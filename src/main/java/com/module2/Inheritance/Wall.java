package com.module2.Inheritance;

import com.module2.ClassDesign.Rectangle;
import com.module2.Polymorphism.IFileType;

import java.awt.*;
import java.util.Objects;

public class Wall extends Rectangle implements IFileType {
    private int depth = 1;
    private String material;
    private int costForOneMeter = 5;
    private Color color = Color.white;
    private double density;
    private int countRowsSetka = 1;

    public Wall(int a, int b) {
        super(a, b);
    }

    public Wall(int a, int b, int depth, String material, int costForOneMeter) {
        super(a, b);
        this.depth = depth;
        this.material = material;
        this.costForOneMeter = costForOneMeter;
    }

    public int costDoubleMeter()
    {
        return this.getPerimeter()*this.costForOneMeter;
    }
    public int costTripleMeter()
    {
        return (((int)(this.getArea())*this.depth) * this.costForOneMeter * (countRowsSetka+1));
    }
    public int getCountBlockFromOneBlock(int width,int height)
    {
        return (int)this.getArea()/(width*height);
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCostForOneMeter() {
        return costForOneMeter;
    }

    public void setCostForOneMeter(int costForOneMeter) {
        this.costForOneMeter = costForOneMeter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getCountRowsSetka() {
        return countRowsSetka;
    }

    public void setCountRowsSetka(int countRowsSetka) {
        this.countRowsSetka = countRowsSetka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wall wall = (Wall) o;
        return depth == wall.depth && costForOneMeter == wall.costForOneMeter && Double.compare(wall.density, density) == 0 && countRowsSetka == wall.countRowsSetka && Objects.equals(material, wall.material) && Objects.equals(color, wall.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), depth, material, costForOneMeter, color, density, countRowsSetka);
    }

    @Override
    public String toString() {
        return "Wall{" +
                "depth=" + depth +
                ", material='" + material + '\'' +
                ", costForOneMeter=" + costForOneMeter +
                ", color=" + color +
                ", density=" + density +
                ", countRowsSetka=" + countRowsSetka +
                '}';
    }

    @Override
    public String getXML() {
        return "<wall>" +
                "<width>"+this.getWidth()+"</width>"+
                "<length>"+this.getLength()+"</length>"+
                "<depth>"+depth+"</depth>"+
                "<material>"+material+"</material>"+
                "<costForOneMeter>"+costForOneMeter+"</costForOneMeter>"+
                "<color>"+color+"</color>"+
                "<density>"+density+"</density>"+
                "<countRowsSetka>"+countRowsSetka+"</countRowsSetka>"+
                "</wall>";
    }

    @Override
    public String getJSON() {
        return "{wall{" +
                "\"width\":"+this.getWidth()+","+
                "\"length\":"+this.getLength()+","+
                "\"depth\":"+depth+","+
                "\"material\":\""+material+"\","+
                "\"costForOneMeter\":"+costForOneMeter+","+
                "\"color\":\""+color.toString()+"\","+
                "\"density\":"+density+","+
                "\"countRowsSetka\":"+countRowsSetka+","+
                "}}";
    }
}
