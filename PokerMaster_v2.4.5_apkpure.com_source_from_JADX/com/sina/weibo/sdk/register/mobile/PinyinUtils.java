package com.sina.weibo.sdk.register.mobile;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.android.tpush.common.MessageKey;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PinyinUtils {
    private static final int DISTINGUISH_LEN = 10;
    private static final char FIRST_CHINA = '\u4e00';
    private static final char LAST_CHINA = '\u9fa5';
    private static final String[] PINYIN;
    private static final char SPECIAL_HANZI = '\u3007';
    private static final String SPECIAL_HANZI_PINYIN = "LING";
    private static volatile boolean isLoad;
    private static PinyinUtils sInstance;
    private static short[] sPinyinIndex;

    public static class MatchedResult {
        public int end;
        public int start;

        public MatchedResult() {
            this.start = -1;
            this.end = -1;
        }
    }

    static {
        PINYIN = new String[]{"a", "ai", "an", "ang", "ao", "ba", "bai", "ban", "bang", "bao", "bei", "ben", "beng", "bi", "bian", "biao", "bie", "bin", "bing", "bo", "bu", "ca", "cai", "can", "cang", "cao", "ce", "cen", "ceng", "cha", "chai", "chan", "chang", "chao", "che", "chen", "cheng", "chi", "chong", "chou", "chu", "chuai", "chuan", "chuang", "chui", "chun", "chuo", "ci", "cong", "cou", "cu", "cuan", "cui", "cun", "cuo", "da", "dai", "dan", "dang", "dao", "de", "deng", "di", "dia", "dian", "diao", "die", "ding", "diu", "dong", "dou", "du", "duan", "dui", "dun", "duo", "e", "ei", "en", "er", "fa", "fan", "fang", "fei", "fen", "feng", "fo", "fou", "fu", "ga", "gai", "gan", "gang", "gao", "ge", "gei", "gen", "geng", "gong", "gou", "gu", "gua", "guai", "guan", "guang", "gui", "gun", "guo", "ha", "hai", "han", "hang", "hao", "he", "hei", "hen", "heng", "hong", "hou", "hu", "hua", "huai", "huan", "huang", "hui", "hun", "huo", "ji", "jia", "jian", "jiang", "jiao", "jie", "jin", "jing", "jiong", "jiu", "ju", "juan", "jue", "jun", "ka", "kai", "kan", "kang", "kao", "ke", "ken", "keng", "kong", "kou", "ku", "kua", "kuai", "kuan", "kuang", "kui", "kun", "kuo", "la", "lai", "lan", "lang", "lao", "le", "lei", "leng", "li", "lia", "lian", "liang", "liao", "lie", "lin", "ling", "liu", "long", "lou", "lu", "luan", "lun", "luo", "lv", "lve", "m", "ma", "mai", "man", "mang", "mao", "me", "mei", "men", "meng", "mi", "mian", "miao", "mie", MessageKey.MSG_ACCEPT_TIME_MIN, "ming", "miu", "mo", "mou", "mu", "na", "nai", "nan", "nang", "nao", "ne", "nei", "nen", "neng", "ng", "ni", "nian", "niang", "niao", "nie", "nin", "ning", "niu", "none", "nong", "nou", "nu", "nuan", "nuo", "nv", "nve", "o", "ou", "pa", "pai", "pan", "pang", "pao", "pei", "pen", "peng", "pi", "pian", "piao", "pie", "pin", "ping", "po", "pou", "pu", "qi", "qia", "qian", "qiang", "qiao", "qie", "qin", "qing", "qiong", "qiu", "qu", "quan", "que", "qun", "ran", "rang", "rao", "re", "ren", "reng", "ri", "rong", "rou", "ru", "ruan", "rui", "run", "ruo", "sa", "sai", "san", "sang", "sao", "se", "sen", "seng", "sha", "shai", "shan", "shang", "shao", "she", "shei", "shen", "sheng", "shi", "shou", "shu", "shua", "shuai", "shuan", "shuang", "shui", "shun", "shuo", "si", "song", "sou", "su", "suan", "sui", "sun", "suo", "ta", "tai", "tan", "tang", "tao", "te", "teng", "ti", "tian", "tiao", "tie", "ting", "tong", "tou", "tu", "tuan", "tui", "tun", "tuo", "wa", "wai", "wan", "wang", "wei", "wen", "weng", "wo", "wu", "xi", "xia", "xian", "xiang", "xiao", "xie", "xin", "xing", "xiong", "xiu", "xu", "xuan", "xue", "xun", "ya", "yan", "yang", "yao", "ye", "yi", "yiao", "yin", "ying", "yo", "yong", "you", "yu", "yuan", "yue", "yun", "za", "zai", "zan", "zang", "zao", "ze", "zei", "zen", "zeng", "zha", "zhai", "zhan", "zhang", "zhao", "zhe", "zhei", "zhen", "zheng", "zhi", "zhong", "zhou", "zhu", "zhua", "zhuai", "zhuan", "zhuang", "zhui", "zhun", "zhuo", "zi", "zong", "zou", "zu", "zuan", "zui", "zun", "zuo"};
        isLoad = false;
    }

    private PinyinUtils() {
    }

    public static synchronized PinyinUtils getInstance(Context context) {
        PinyinUtils pinyinUtils;
        synchronized (PinyinUtils.class) {
            if (sInstance == null) {
                sInstance = new PinyinUtils();
            }
            loadData(context);
            pinyinUtils = sInstance;
        }
        return pinyinUtils;
    }

    private static void loadData(Context context) {
        InputStream open;
        DataInputStream dataInputStream;
        InputStream inputStream;
        Throwable th;
        Throwable th2;
        DataInputStream dataInputStream2 = null;
        try {
            if (!isLoad) {
                open = context.getAssets().open("pinyinindex");
                try {
                    dataInputStream = new DataInputStream(open);
                    try {
                        sPinyinIndex = new short[((int) ((long) (dataInputStream.available() >> 1)))];
                        for (int i = 0; i < sPinyinIndex.length; i++) {
                            sPinyinIndex[i] = dataInputStream.readShort();
                        }
                        isLoad = true;
                        try {
                            dataInputStream.close();
                            if (open != null) {
                                open.close();
                            }
                        } catch (IOException e) {
                        }
                    } catch (IOException e2) {
                        inputStream = open;
                    } catch (Exception e3) {
                    }
                } catch (IOException e4) {
                    dataInputStream = null;
                    inputStream = open;
                    try {
                        isLoad = false;
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (IOException e5) {
                                return;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        open = inputStream;
                        dataInputStream2 = dataInputStream;
                        th2 = th;
                        if (dataInputStream2 != null) {
                            try {
                                dataInputStream2.close();
                            } catch (IOException e6) {
                                throw th2;
                            }
                        }
                        if (open != null) {
                            open.close();
                        }
                        throw th2;
                    }
                } catch (Exception e7) {
                    dataInputStream = null;
                    try {
                        isLoad = false;
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (IOException e8) {
                                return;
                            }
                        }
                        if (open != null) {
                            open.close();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        dataInputStream2 = dataInputStream;
                        th2 = th;
                        if (dataInputStream2 != null) {
                            dataInputStream2.close();
                        }
                        if (open != null) {
                            open.close();
                        }
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    if (open != null) {
                        open.close();
                    }
                    throw th2;
                }
            }
        } catch (IOException e9) {
            dataInputStream = null;
            isLoad = false;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Exception e10) {
            dataInputStream = null;
            open = null;
            isLoad = false;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            if (open != null) {
                open.close();
            }
        } catch (Throwable th6) {
            th2 = th6;
            open = null;
            if (dataInputStream2 != null) {
                dataInputStream2.close();
            }
            if (open != null) {
                open.close();
            }
            throw th2;
        }
    }

    private String getPinyin(char c) {
        if (!isLoad) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (c == SPECIAL_HANZI) {
            return SPECIAL_HANZI_PINYIN;
        }
        if (c < FIRST_CHINA || c > LAST_CHINA) {
            return String.valueOf(c);
        }
        String str = PINYIN[sPinyinIndex[c - 19968]];
        if (str == null) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        return str;
    }

    public String getPinyin(String str) {
        if (TextUtils.isEmpty(str)) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (!isLoad) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(getPinyin(str.charAt(i)));
        }
        return stringBuilder.toString();
    }

    public MatchedResult getMatchedResult(String str, String str2) {
        MatchedResult matchedResult = new MatchedResult();
        matchedResult.start = -1;
        matchedResult.end = -1;
        if (!isLoad) {
            return matchedResult;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return matchedResult;
        }
        String str3;
        int i;
        int i2;
        String toUpperCase = str.toUpperCase();
        String toUpperCase2 = str2.toUpperCase();
        if (Math.min(toUpperCase.length(), toUpperCase2.length()) > DISTINGUISH_LEN) {
            toUpperCase = toUpperCase.substring(0, DISTINGUISH_LEN);
            toUpperCase2 = toUpperCase2.substring(0, DISTINGUISH_LEN);
            str3 = toUpperCase;
        } else {
            str3 = toUpperCase;
        }
        int indexOf = str3.indexOf(toUpperCase2);
        if (indexOf >= 0) {
            matchedResult.start = indexOf;
            matchedResult.end = (indexOf + toUpperCase2.length()) - 1;
        }
        char[] cArr = new char[toUpperCase2.length()];
        for (i = 0; i < toUpperCase2.length(); i++) {
            cArr[i] = toUpperCase2.charAt(i);
        }
        char[] cArr2 = new char[str3.length()];
        String[] strArr = new String[str3.length()];
        i = str3.length();
        for (i2 = 0; i2 < i; i2++) {
            char charAt = str3.charAt(i2);
            cArr2[i2] = charAt;
            Object pinyin = getPinyin(charAt);
            if (TextUtils.isEmpty(pinyin)) {
                strArr[i2] = new StringBuilder(String.valueOf(charAt)).toString();
            } else {
                strArr[i2] = pinyin.toUpperCase();
            }
        }
        char c = cArr[0];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            char charAt2 = strArr[i3].charAt(0);
            char c2 = cArr2[i3];
            if (charAt2 == c || c2 == c) {
                i2 = distinguish(cArr, 0, subCharRangeArray(cArr2, i3, cArr2.length - 1), subStringRangeArray(strArr, i3, strArr.length - 1), 0, 0);
                if (i2 != -1) {
                    matchedResult.start = i3;
                    matchedResult.end = i2 + i3;
                    return matchedResult;
                }
            }
        }
        return matchedResult;
    }

    public int distinguish(char[] cArr, int i, char[] cArr2, String[] strArr, int i2, int i3) {
        if (i == 0 && (cArr[0] == cArr2[0] || cArr[0] == strArr[0].charAt(0))) {
            if (cArr.length != 1) {
                return distinguish(cArr, 1, cArr2, strArr, 0, 1);
            }
            return 0;
        } else if (strArr[i2].length() <= i3 || i >= cArr.length || !(cArr[i] == cArr2[i2] || cArr[i] == strArr[i2].charAt(i3))) {
            if (strArr.length <= i2 + 1 || i >= cArr.length || !(cArr[i] == cArr2[i2 + 1] || cArr[i] == strArr[i2 + 1].charAt(0))) {
                if (strArr.length > i2 + 1) {
                    for (int i4 = 1; i4 < i; i4++) {
                        if (distinguish(cArr, i - i4, cArr2, strArr, i2 + 1, 0) != -1) {
                            return i2 + 1;
                        }
                    }
                }
                return -1;
            } else if (i != cArr.length - 1) {
                return distinguish(cArr, i + 1, cArr2, strArr, i2 + 1, 1);
            } else if (distinguish(cArr, cArr2, strArr, i2)) {
                return i2 + 1;
            } else {
                return -1;
            }
        } else if (i != cArr.length - 1) {
            return distinguish(cArr, i + 1, cArr2, strArr, i2, i3 + 1);
        } else if (distinguish(cArr, cArr2, strArr, i2)) {
            return i2;
        } else {
            return -1;
        }
    }

    private boolean distinguish(char[] cArr, char[] cArr2, String[] strArr, int i) {
        String str = new String(cArr);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            i3 = str.indexOf(strArr[i2].charAt(0), i3);
            if (i3 == -1) {
                i3 = str.indexOf(cArr2[i2], i3);
            }
            if (i3 == -1) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    private char[] subCharRangeArray(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[((i2 - i) + 1)];
        int i3 = 0;
        while (i <= i2) {
            cArr2[i3] = cArr[i];
            i++;
            i3++;
        }
        return cArr2;
    }

    private String[] subStringRangeArray(String[] strArr, int i, int i2) {
        String[] strArr2 = new String[((i2 - i) + 1)];
        int i3 = 0;
        while (i <= i2) {
            strArr2[i3] = strArr[i];
            i++;
            i3++;
        }
        return strArr2;
    }

    public static PinyinUtils getObject() {
        return sInstance;
    }
}
