import java.math.MathContext;
public class Triangle extends Geoobject

{

    public Triangle (int Side, String Color, boolean Filled){
        sides=Side;
        color=Color;
        filled=Filled;
    }
    public void display(){
        double perimeter = (sides+sides+sides);
        double s = 0.5*(sides + sides + sides);
        double area = Math.sqrt(s*(s-sides)*(s-sides)*(s-sides));
        System.out.println(perimeter + " "+ area+ " "+ color + filled);
    }




}
