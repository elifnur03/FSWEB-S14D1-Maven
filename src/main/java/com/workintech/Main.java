package com.workintech;

import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Rectangle;
import com.workintech.pool.Cuboid;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Circle Test
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + String.format(Locale.US, "%.2f", circle.getArea()));

        // Cylinder Test
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + String.format(Locale.US, "%.2f", cylinder.getArea()));
        System.out.println("cylinder.volume= " + String.format(Locale.US, "%.2f", cylinder.getVolume()));

        // Rectangle Test
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + String.format(Locale.US, "%.2f", rectangle.getArea()));

        // Cuboid Test
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + String.format(Locale.US, "%.2f", cuboid.getArea()));
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + String.format(Locale.US, "%.2f", cuboid.getVolume()));
    }
}