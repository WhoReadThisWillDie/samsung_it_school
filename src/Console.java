abstract public class Console {
    protected String company;
    protected String model;
    protected String colour;

    public final void setCompany(String company) {
        this.company = company;
    }

    public final void setModel (String model) {
        this.model = model;
    }

    public final void setColour(String colour) {
        this.colour = colour;
    }

    public final String getCompany() {
        return company;
    }

    public final String getModel() {
        return model;
    }

    public final String getColour() {
        return colour;
    }

    abstract public void turnOn();
}