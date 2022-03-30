package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RouletteAT {

    @Test
    public void itWaitsForTheBallToStop() {
    }

    @Test()
    public void itProvidesAResultWithColor() throws Exception {
        Ball ball = new Ball(500);
        JavaRandomizer randomizer = new JavaRandomizer();
        Roulette roulette = new Roulette(ball, randomizer);
        Result result = roulette.playGame();
        assertThat(result.color).isNotNull();
    }

}
