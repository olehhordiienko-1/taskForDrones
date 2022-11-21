package dronesScout;

import org.apache.log4j.Logger;

public class ScoutDrone {
    private static final Logger logger = Logger.getLogger(ScoutDrone.class);

    public void scout(){
        logger.info("<<Drone>> is scouting");
    }

    public void fly() {
        logger.info("<<Drone>> is flying");
    }
}
