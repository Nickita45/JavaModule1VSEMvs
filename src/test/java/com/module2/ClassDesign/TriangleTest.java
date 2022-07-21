package com.module2.ClassDesign;

import org.junit.Assert;
import org.opentest4j.MultipleFailuresError;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @org.junit.jupiter.api.Test
    void whenPerimeterIs12() {
        Triangle triangle = new Triangle(2,3,4);
        Assert.assertEquals(12,triangle.getPerimeter());

    }

    @org.junit.jupiter.api.Test
    void whenAreaValueIs6or3() throws MultipleFailuresError {
        Triangle triangle = new Triangle(2,3,4);
        assertAll( () -> Assert.assertEquals(6,triangle.getAreaValue(2),0.001),
                () -> Assert.assertEquals(3,triangle.getAreaValue(2),0.001));
    }

    @org.junit.jupiter.api.Test
    void whenPoluPerimetrIs4() {
        Triangle triangle = new Triangle(2,3,4);
        Assert.assertEquals(4,triangle.getPoluPerimetr(),0.001);

    }

    @org.junit.jupiter.api.Test
    void whenAreaByFormulaGeronaIs10() {
        Triangle triangle = new Triangle(2,3,4);
        Assert.assertEquals(10,triangle.getAreaByFormulaGerona(),0.5);
    }

    @org.junit.jupiter.api.Test
    void whenRadiusCircleInIs4() {
        Triangle triangle = new Triangle(2,3,4);
        Assert.assertEquals(4,triangle.getRadiusCircleIn(),0.01);
    }
}