package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * IT integration-test testing the real thing in integration
 * the suffix IT means that it's run in a separate test suite.
 * Another possibility is to put this into a separate directory like src/integration-test/java
 */
public class BallIT {

    @Test
    public void itRollsForAGivenAmountOfTime() throws Exception {
        Ball ball = new Ball();
        try{
            ball.roll();
        } catch(Exception e){
            fail("Délais dépasser");
        }

    }
}
