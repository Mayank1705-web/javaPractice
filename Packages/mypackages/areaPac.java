package mypackages;

public class areaPac {
    public int area(int side){
        return side*side;
    }
    public double area(double  radius){
        return Math.PI*radius*radius;
    }
    public int area(int length, int width){
        return length*width;
    }
    public double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
