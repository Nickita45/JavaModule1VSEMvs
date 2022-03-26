package com.module2.FactoryBuilder;

import com.module2.ClassDesign.Cylinder;

public class CylinderFactory {
    public static Cylinder create(int height, int radius)
    {
        if(height > 0 && radius > 0)
            return new Cylinder(height,radius);
        return null;
    }
}
