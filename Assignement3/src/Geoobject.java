public abstract class Geoobject {
     int sides;

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    String color;
    boolean filled;

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
}
