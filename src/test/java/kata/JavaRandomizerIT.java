package kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class JavaRandomizerIT {

    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        JavaRandomizer javaRandomizer = new JavaRandomizer();
        int random = javaRandomizer.getRouletteResult();
        int high = 37;
        int low = 0;
        assertTrue(high >= random);
        assertTrue(low  <= random);
    }

    @Test
    public void allNumbersOccur() throws Exception {

    }


}
