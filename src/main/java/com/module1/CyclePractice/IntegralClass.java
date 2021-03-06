package com.module1.CyclePractice;

public class IntegralClass {
    public static double getIntegral(int steps, double line,double minLimitedArea, double maxLimitedArea)
    {
        double width = maxLimitedArea/steps;
        double area = minLimitedArea;
        for(int i=0;i<steps;i++)
        {
            double height = Math.sin((i*width));
            if(height > line)
                height = line;
            area+=(width * height);
        }
        return area;
    }
    public static void main(String[] args) {
        int k = 5; //variant number
        double y = 0.1 * k;
        System.out.println(getIntegral(10,y,0,Math.PI));
    }
}
