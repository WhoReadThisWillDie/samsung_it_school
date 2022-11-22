package Task_262;

public class Circle extends Figure implements Moveable{
    protected float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return radius * radius * 3.1415927f;
    }

    @Override
    public float getPerimeter() {
        return 2 * 3.1415927f * radius;
    }

    @Override
    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void resize(float koeff) {
        radius *= koeff;
    }

    @Override
    public String toString() {
        return "Circle\n" + "Center: " + "(" + x + ", " + y + ")\n" + "Radius: " + radius;
    }
}
