public class Car {
    public Car() {
    }

    public void start(){
        startElecticity();
        startCommand();
        startFuelSystem();
    }

    private void startElecticity() {
        System.out.println("Start electicity");
    }

    private void startCommand() {
        System.out.println("Start command");
    }

    private void startFuelSystem() {
        System.out.println("Start fuel system");
    }
}