package org.slf4j;

import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticMarkerBinder;

public class MarkerFactory {
    static IMarkerFactory MARKER_FACTORY;

    private MarkerFactory() {
    }

    private static IMarkerFactory bwCompatibleGetMarkerFactoryFromBinder() {
        try {
            return StaticMarkerBinder.getSingleton().getMarkerFactory();
        } catch (NoSuchMethodError e) {
            return StaticMarkerBinder.SINGLETON.getMarkerFactory();
        }
    }

    static {
        try {
            MARKER_FACTORY = bwCompatibleGetMarkerFactoryFromBinder();
        } catch (NoClassDefFoundError e) {
            MARKER_FACTORY = new BasicMarkerFactory();
        } catch (Throwable e2) {
            Util.report("Unexpected failure while binding MarkerFactory", e2);
        }
    }

    public static Marker getMarker(String str) {
        return MARKER_FACTORY.getMarker(str);
    }

    public static Marker getDetachedMarker(String str) {
        return MARKER_FACTORY.getDetachedMarker(str);
    }

    public static IMarkerFactory getIMarkerFactory() {
        return MARKER_FACTORY;
    }
}
