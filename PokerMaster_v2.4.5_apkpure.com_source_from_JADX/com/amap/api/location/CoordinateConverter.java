package com.amap.api.location;

import android.content.Context;
import com.amap.p003a.bc;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import net.sqlcipher.database.SQLiteDatabase;

public class CoordinateConverter {
    DPoint f786a;
    private Context f787b;
    private CoordType f788c;
    private DPoint f789d;

    /* renamed from: com.amap.api.location.CoordinateConverter.1 */
    static /* synthetic */ class C02581 {
        static final /* synthetic */ int[] f784a;

        static {
            f784a = new int[CoordType.values().length];
            try {
                f784a[CoordType.BAIDU.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f784a[CoordType.MAPBAR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f784a[CoordType.MAPABC.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f784a[CoordType.SOSOMAP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f784a[CoordType.ALIYUN.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f784a[CoordType.GOOGLE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f784a[CoordType.GPS.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    public enum CoordType {
        BAIDU,
        MAPBAR,
        MAPABC,
        SOSOMAP,
        ALIYUN,
        GOOGLE,
        GPS
    }

    public CoordinateConverter(Context context) {
        this.f788c = null;
        this.f789d = null;
        this.f786a = null;
        this.f787b = context;
    }

    public synchronized DPoint convert() {
        if (this.f788c != null) {
            if (this.f789d != null) {
                if (this.f789d.getLongitude() <= 180.0d && this.f789d.getLongitude() >= -180.0d) {
                    if (this.f789d.getLatitude() <= 90.0d && this.f789d.getLatitude() >= -90.0d) {
                        switch (C02581.f784a[this.f788c.ordinal()]) {
                            case SQLiteDatabase.OPEN_READONLY /*1*/:
                                this.f786a = OffsetUtil.m769a(this.f789d);
                                break;
                            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                                this.f786a = OffsetUtil.m774b(this.f787b, this.f789d);
                                break;
                            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                                this.f786a = this.f789d;
                                break;
                            case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                                this.f786a = OffsetUtil.m768a(this.f787b, this.f789d);
                                break;
                        }
                    }
                    throw new IllegalArgumentException("\u8bf7\u4f20\u5165\u5408\u7406\u7eac\u5ea6");
                }
                throw new IllegalArgumentException("\u8bf7\u4f20\u5165\u5408\u7406\u7ecf\u5ea6");
            }
            throw new IllegalArgumentException("\u8f6c\u6362\u5750\u6807\u6e90\u4e0d\u80fd\u4e3a\u7a7a");
        }
        throw new IllegalArgumentException("\u8f6c\u6362\u5750\u6807\u7c7b\u578b\u4e0d\u80fd\u4e3a\u7a7a");
        return this.f786a;
    }

    public synchronized CoordinateConverter coord(DPoint dPoint) {
        if (dPoint == null) {
            throw new IllegalArgumentException("\u4f20\u5165\u7ecf\u7eac\u5ea6\u5bf9\u8c61\u4e3a\u7a7a");
        } else if (dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
            throw new IllegalArgumentException("\u8bf7\u4f20\u5165\u5408\u7406\u7ecf\u5ea6");
        } else if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d) {
            throw new IllegalArgumentException("\u8bf7\u4f20\u5165\u5408\u7406\u7eac\u5ea6");
        } else {
            this.f789d = dPoint;
        }
        return this;
    }

    public synchronized CoordinateConverter from(CoordType coordType) {
        this.f788c = coordType;
        return this;
    }

    public boolean isAMapDataAvailable(double d, double d2) {
        return bc.m331a(d, d2);
    }
}
