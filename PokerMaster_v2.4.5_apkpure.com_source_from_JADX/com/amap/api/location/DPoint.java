package com.amap.api.location;

public class DPoint {
    private double f790a;
    private double f791b;

    public DPoint(double d, double d2) {
        double d3 = 180.0d;
        double d4 = 90.0d;
        double d5 = -180.0d;
        double d6 = -90.0d;
        if (d2 <= 180.0d) {
            d3 = d2;
        }
        if (d3 >= -180.0d) {
            d5 = d3;
        }
        if (d <= 90.0d) {
            d4 = d;
        }
        if (d4 >= -90.0d) {
            d6 = d4;
        }
        this.f790a = d5;
        this.f791b = d6;
    }

    public double getLatitude() {
        return this.f791b;
    }

    public double getLongitude() {
        return this.f790a;
    }

    public void setLatitude(double d) {
        double d2 = 90.0d;
        double d3 = -90.0d;
        if (d <= 90.0d) {
            d2 = d;
        }
        if (d2 >= -90.0d) {
            d3 = d2;
        }
        this.f791b = d3;
    }

    public void setLongitude(double d) {
        double d2 = 180.0d;
        double d3 = -180.0d;
        if (d <= 180.0d) {
            d2 = d;
        }
        if (d2 >= -180.0d) {
            d3 = d2;
        }
        this.f790a = d3;
    }
}
