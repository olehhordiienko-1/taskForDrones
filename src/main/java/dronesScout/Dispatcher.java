package dronesScout;

public class Dispatcher {
    public static void main(String[] args) {
        DroneOperator droneOperator = new DroneOperator(new ScoutDroneAdapter());
        droneOperator.scout();
        droneOperator.fly();
    }
}
