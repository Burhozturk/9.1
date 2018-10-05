

public class Rectangle
{
    public Rectangle()
    {
        System.out.println("Laver en default Rectangle");
    }
    public Rectangle(double width,double height)
    {
        System.out.println("En trekant med a width"+width+"Og height"+height);
    }

    public double getArea()
    {
        double width=1;
        double height=1;
        double getAreaInput=width*height;
        return getAreaInput;

    }

    public double getPerimeter()
    {
        double d=1;

        double getPerimeterInput=Math.PI*d;
        return getPerimeterInput;
    }

    public static void main(String[] args)
    {
        double width=1;
        double height=1;
    }
}
