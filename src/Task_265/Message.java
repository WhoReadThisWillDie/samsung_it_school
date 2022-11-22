package Task_265;

public interface Message {
    public void send();
    public void delete(int n);
    public String read(int n);

    public int maxSize = 100;
}
