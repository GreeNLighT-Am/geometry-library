package org.greenlight.geometry.utils;

import org.greenlight.geometry.library.shapes.Shape;

public class GeometryUtils {
    public static int compareByArea(Shape s1, Shape s2) {
        return Double.compare(s1.getArea(), s2.getArea());
    }

    public static double metersToSquareCentimeters(double squareMeters) {
        return squareMeters * 10_000;
    }
}
