package com.company;

/*getxxx & sexxx*/
class Rectangle{
    private double length;
    private double width;

    public double getLength(){
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double l){
        length = l;
    }
    public void setWidth(double w){
        width = w;
    }

    public  double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}
public class practiceT2 {
    public static void main(String[]args){
        Rectangle r=new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        System.out.println("Area is "+r.area());
        System.out.println(("perimeter is "+r.perimeter()));
        System.out.println("Length is "+ r.getLength());
        System.out.println("Width is "+r.getWidth());
    }
}
