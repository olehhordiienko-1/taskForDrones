package dronesScout;

public class DroneOperator {
    private final CombatDrone combatDrone;

    public DroneOperator(CombatDrone combatDrone) {
        this.combatDrone = combatDrone;
    }

    public void scout() {
        combatDrone.findTarget();
    }

    public void fly() {
        combatDrone.fly();
    }
}
