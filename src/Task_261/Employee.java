package Task_261;

public class Employee extends Person{
    protected String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    public String work() {
        return "Manager";
    }

    @Override
    public String toString() {
        return "(" + name + ", " + age + ", " + company + ")";
    }
}
