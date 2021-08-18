package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shappe;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Shappe> myShappes = new ArrayList<>();

        System.out.print("Inform the Raius of the Circle: ");
        double r = sc.nextDouble();
        myShappes.add(new Circle(r));
        System.out.print("Inform the Raius of the Circle: ");
        r = sc.nextDouble();
        myShappes.add(new Circle(r));
        System.out.print("Inform the Raius of the Circle: ");
        r = sc.nextDouble();
        myShappes.add(new Circle(r));
        System.out.println("Total Area of Circle: "+ String.format("%.2f",totalArea(myShappes)));
        System.out.println();
        //==============================================================
        System.out.print("Inform the Width of the Rectangle: ");
        r = sc.nextDouble();
        System.out.print("Inform the Heidth of the Rectangle: ");
        double r2 = sc.nextDouble();
        myShappes.add(new Rectangle(r,r2));
        System.out.print("Inform the Width of the Rectangle: ");
        r = sc.nextDouble();
        System.out.print("Inform the Heidth of the Rectangle: ");
        r2 = sc.nextDouble();
        myShappes.add(new Rectangle(r,r2));
        System.out.println("Total Area of Circle and Rectangle: "+ String.format("%.2f",totalArea(myShappes)));


    }
    public static double totalArea(List<Shappe>lista){
        double t = 0.0;
        for(Shappe x:lista){
            t += x.area();
        }
        return t;
    }


}
