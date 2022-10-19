package com.company;

/*Circle and rectangle Area Class*/
class Circle{
    public float radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}

class Rectangle{
    public int width;
    public int length;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}
public class practiceW6 {
    public static void main(String[]args){
        Circle c=new Circle();
        c.radius=7;
        System.out.println("Area of cirlce is "+c.area());
        System.out.println("perimeter of circle is "+c.perimeter());

        Rectangle r=new Rectangle();
        r.length=10;
        r.width=20;
        System.out.println("Area of rectangle is "+r.area());
        System.out.println("perimeter of rectangle is "+r.perimeter());
    }
}
