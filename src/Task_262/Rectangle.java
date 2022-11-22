package Task_262;

public class Rectangle extends Figure implements Moveable{
    protected float height;
    protected float width;

    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        return height * width;
    }

    @Override
    public float getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void resize(float koeff) {
        height *= koeff;
        width *= koeff;
    }

    @Override
    public String toString() {
        return "Rectangle\n" + "Center: " + "(" + (x + (width / 2)) + ", " + (y + (height / 2))+ ")\n" + "Height: " + height + "\nWidth: " + width;
    }
}
