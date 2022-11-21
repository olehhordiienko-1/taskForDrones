package dronesScout;

public class ScoutDroneAdapter implements CombatDrone {
   private final ScoutDrone scoutDrone;

    public ScoutDroneAdapter() {
        scoutDrone = new ScoutDrone();
    }

    public void findTarget() {
        scoutDrone.scout();
    }

    @Override
    public void fly() {
        scoutDrone.fly();
    }
}
