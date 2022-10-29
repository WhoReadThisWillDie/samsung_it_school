public class PortableConsole extends Console {
    private boolean portable = true;

    public void changeMode() {
        this.portable = !portable;
    }

    @Override
    public void turnOn() {
        if (portable)
            System.out.println("This is your portable " + colour + " " + company + " " + model);
        else
            System.out.println("This is your connected to TV " + colour + " " + company + " " + model);
    }

}
