package kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.*;

public class ResultTest {

    @Test
    public void the37CorrespondsTo00() {
        Result result = new Result(37);
        assertEquals(result.number,"00");
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
        JavaRandomizer javaRandomizer = new JavaRandomizer();
        int random = javaRandomizer.getRouletteResult();
        Result result = new Result(random);
        int test = parseInt(result.number);
        assertTrue(test >= 0 && test<=37);
    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        Result result_00 = new Result(37);
        assertEquals(result_00.color, Result.Color.GREEN);
        Result result_0 = new Result(0);
        assertEquals(result_0.color, Result.Color.GREEN);
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        for (int i = 2; i<=36; i+=2) {
            Result result = new Result(i);
            assertEquals(Result.Color.BLACK,result.color);
        }

    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        for (int i = 1; i<=36; i+=2) {
            Result result = new Result(i);
            assertEquals(Result.Color.RED,result.color);
        }
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {
        assertThrows(RouletteException.class, () -> new Result(38));
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {
        assertThrows(RouletteException.class, () -> new Result(-1));
    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {


    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
    }
}