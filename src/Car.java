public class Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(car);
    }
    private String electicity;
    private String command;
    private String fuelSystem;


    public Car() {
    }

    private void start(Car car){
        car.startElecticity("on");
        car.startFuelSystem("on");
        car.startCommand("start");
    }

    public void startElecticity(String onOff) {
        if (onOff.equals("on")){
            System.out.println("Electricity on");
        } else if(onOff.equals("off")){
            System.out.println("Electricity off");
        }
    }

    public void startCommand(String command) {
        if (command.equals("start")){
            System.out.println("Turning on on-board computer");
        } else if(command.equals("stop")){
            System.out.println("Turning off on-board computer");
        }
    }

    public void startFuelSystem(String onOff) {
        if (onOff.equals("on")){
            System.out.println("Fuel system on");
        } else if(onOff.equals("off")){
            System.out.println("Fuel system off");
        }
    }
}