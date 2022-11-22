package Task_265;

public interface Liveable {
    public String breathe();
    public String reproduction();
    public String feed(Liveable[] liveables);

    public boolean isLive = true;
}
