abstract class Shape {
    abstract void draw();
}
class Line extends Shape {
    public void draw(){
        System.out.println("Line is drawn");
    }
}
class Rectangle extends Shape {
    public void draw(){
        System.out.println("rectangle is drawn");
    }
}
class Cube extends Shape{
    public void draw(){
        System.out.println("cube is drawn");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("square is drawn");
    }
}
public class Main{
    public static void main(String[] args) {
        Shape l=new line();
        Shape r=new rectangle();
        Shape c=new cube();
        Shape s=new square();
        draw_All(l);
        draw_All(r);
        draw_All(c);
        draw_All(s);
    }
    //just one method to call methods from four different classes
    public static void draw_All(shape obj){
        obj.draw();
    }
}
