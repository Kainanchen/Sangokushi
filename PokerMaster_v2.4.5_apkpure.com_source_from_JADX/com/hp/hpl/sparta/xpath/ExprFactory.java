package com.hp.hpl.sparta.xpath;

import com.illuminate.texaspoker.R.R;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import com.tencent.mm.sdk.modelbase.BaseResp.ErrCode;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;

public class ExprFactory {
    static BooleanExpr createExpr(XPath xPath, SimpleStreamTokenizer simpleStreamTokenizer) {
        String str;
        switch (simpleStreamTokenizer.ttype) {
            case ErrCode.ERR_SENT_FAILED /*-3*/:
                if (!simpleStreamTokenizer.sval.equals("text")) {
                    throw new XPathException(xPath, "at beginning of expression", simpleStreamTokenizer, "text()");
                } else if (simpleStreamTokenizer.nextToken() != 40) {
                    throw new XPathException(xPath, "after text", simpleStreamTokenizer, "(");
                } else if (simpleStreamTokenizer.nextToken() != 41) {
                    throw new XPathException(xPath, "after text(", simpleStreamTokenizer, ")");
                } else {
                    switch (simpleStreamTokenizer.nextToken()) {
                        case GameRoomBaseInfo.SFROMCLUBURL_FIELD_NUMBER /*33*/:
                            simpleStreamTokenizer.nextToken();
                            if (simpleStreamTokenizer.ttype != 61) {
                                throw new XPathException(xPath, "after !", simpleStreamTokenizer, "=");
                            }
                            simpleStreamTokenizer.nextToken();
                            if (simpleStreamTokenizer.ttype == 34 || simpleStreamTokenizer.ttype == 39) {
                                str = simpleStreamTokenizer.sval;
                                simpleStreamTokenizer.nextToken();
                                return new TextNotEqualsExpr(str);
                            }
                            throw new XPathException(xPath, "right hand side of !=", simpleStreamTokenizer, "quoted string");
                        case R.AppCompatTheme_popupMenuStyle /*61*/:
                            simpleStreamTokenizer.nextToken();
                            if (simpleStreamTokenizer.ttype == 34 || simpleStreamTokenizer.ttype == 39) {
                                str = simpleStreamTokenizer.sval;
                                simpleStreamTokenizer.nextToken();
                                return new TextEqualsExpr(str);
                            }
                            throw new XPathException(xPath, "right hand side of equals", simpleStreamTokenizer, "quoted string");
                        default:
                            return TextExistsExpr.INSTANCE;
                    }
                }
            case ErrCode.ERR_USER_CANCEL /*-2*/:
                int i = simpleStreamTokenizer.nval;
                simpleStreamTokenizer.nextToken();
                return new PositionEqualsExpr(i);
            case R.AppCompatTheme_editTextBackground /*64*/:
                if (simpleStreamTokenizer.nextToken() != -3) {
                    throw new XPathException(xPath, "after @", simpleStreamTokenizer, SelectCountryActivity.EXTRA_COUNTRY_NAME);
                }
                String str2 = simpleStreamTokenizer.sval;
                int parseInt;
                switch (simpleStreamTokenizer.nextToken()) {
                    case GameRoomBaseInfo.SFROMCLUBURL_FIELD_NUMBER /*33*/:
                        simpleStreamTokenizer.nextToken();
                        if (simpleStreamTokenizer.ttype != 61) {
                            throw new XPathException(xPath, "after !", simpleStreamTokenizer, "=");
                        }
                        simpleStreamTokenizer.nextToken();
                        if (simpleStreamTokenizer.ttype == 34 || simpleStreamTokenizer.ttype == 39) {
                            str = simpleStreamTokenizer.sval;
                            simpleStreamTokenizer.nextToken();
                            return new AttrNotEqualsExpr(str2, str);
                        }
                        throw new XPathException(xPath, "right hand side of !=", simpleStreamTokenizer, "quoted string");
                    case R.AppCompatTheme_toolbarNavigationButtonStyle /*60*/:
                        simpleStreamTokenizer.nextToken();
                        if (simpleStreamTokenizer.ttype == 34 || simpleStreamTokenizer.ttype == 39) {
                            parseInt = Integer.parseInt(simpleStreamTokenizer.sval);
                        } else if (simpleStreamTokenizer.ttype == -2) {
                            parseInt = simpleStreamTokenizer.nval;
                        } else {
                            throw new XPathException(xPath, "right hand side of less-than", simpleStreamTokenizer, "quoted string or number");
                        }
                        simpleStreamTokenizer.nextToken();
                        return new AttrLessExpr(str2, parseInt);
                    case R.AppCompatTheme_popupMenuStyle /*61*/:
                        simpleStreamTokenizer.nextToken();
                        if (simpleStreamTokenizer.ttype == 34 || simpleStreamTokenizer.ttype == 39) {
                            str = simpleStreamTokenizer.sval;
                            simpleStreamTokenizer.nextToken();
                            return new AttrEqualsExpr(str2, str);
                        }
                        throw new XPathException(xPath, "right hand side of equals", simpleStreamTokenizer, "quoted string");
                    case R.AppCompatTheme_popupWindowStyle /*62*/:
                        simpleStreamTokenizer.nextToken();
                        if (simpleStreamTokenizer.ttype == 34 || simpleStreamTokenizer.ttype == 39) {
                            parseInt = Integer.parseInt(simpleStreamTokenizer.sval);
                        } else if (simpleStreamTokenizer.ttype == -2) {
                            parseInt = simpleStreamTokenizer.nval;
                        } else {
                            throw new XPathException(xPath, "right hand side of greater-than", simpleStreamTokenizer, "quoted string or number");
                        }
                        simpleStreamTokenizer.nextToken();
                        return new AttrGreaterExpr(str2, parseInt);
                    default:
                        return new AttrExistsExpr(str2);
                }
            default:
                throw new XPathException(xPath, "at beginning of expression", simpleStreamTokenizer, "@, number, or text()");
        }
    }
}
