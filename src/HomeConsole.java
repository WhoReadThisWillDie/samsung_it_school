public class HomeConsole extends Console {
    private String gamepad;

    public void setGamepad(String gamepad) {
        this.gamepad = gamepad;
    }

    public String getGamepad(String gamepad) {
        return gamepad;
    }

    @Override
    public void turnOn() {
        System.out.println("This is your " + colour + " " + company + " " + model + " with cool " + gamepad);
    }
}
