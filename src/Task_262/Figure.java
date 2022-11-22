package Task_262;

public abstract class Figure {
    protected float x;
    protected float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }
    abstract public float getArea();
    abstract public float getPerimeter();
}
