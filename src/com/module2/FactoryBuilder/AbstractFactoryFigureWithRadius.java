package com.module2.FactoryBuilder;

import com.module2.ClassDesign.Cone;
import com.module2.ClassDesign.Cylinder;
import com.module2.ClassDesign.Ring;

public class AbstractFactoryFigureWithRadius {
    public static IFigureWithRadius create(int height, int radius, String figure)
    {
        if(figure.equals("cone"))
            return new Cone(height, radius);
        else if(figure.equals("cylinder"))
            return new Cylinder(height, radius);
        else if(figure.equals("ring"))
            return new Ring(radius,height);
        return null;
    }
}
