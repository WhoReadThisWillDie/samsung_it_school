public class Main {
    public static void main(String[] args) {
        HomeConsole Ps5 = new HomeConsole();
        Ps5.setCompany("Sony");
        Ps5.setModel("PlayStation 5");
        Ps5.setColour("White");
        Ps5.setGamepad("Dualshock");
        Ps5.turnOn();

        PortableConsole Switch = new PortableConsole();
        Switch.setCompany("Nintendo");
        Switch.setModel("Switch");
        Switch.setColour("red & blue");
        Switch.turnOn();
        Switch.changeMode();
        Switch.turnOn();
    }
}
