package cn.xpbootcamp.fizzbuzz;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameSpec {
    @Test
    void should_return_number() {
        Game game = new Game();
        assertThat(game.run(2)).isEqualTo("2");
    }

    @Test
    void should_return_Fizz_when_divided_exactly_by_3() {
        Game game = new Game();
        assertThat(game.run(3)).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_when_divided_exactly_by_5() {
        Game game = new Game();
        assertThat(game.run(5)).isEqualTo("Buzz");
    }

    @Test
    void should_return_Whizz_when_divided_exactly_by_7() {
        Game game = new Game();
        assertThat(game.run(7)).isEqualTo("Whizz");
    }

    @Test
    void should_return_Buzz_when_divided_exactly_by_3_and_5() {
        Game game = new Game();
        assertThat(game.run(15)).isEqualTo( "Buzz");
    }

    @Test
    void should_return_FizzWhizz_when_divided_exactly_by_3_and_7() {
        Game game = new Game();
        assertThat( game.run(21)).isEqualTo("FizzWhizz");
    }

    @Test
    void should_return_BuzzWhizz_when_divided_exactly_by_5_and_7() {
        Game game = new Game();
        assertThat(game.run(35)).isEqualTo("BuzzWhizz");
    }

    @Test
    void should_return_BuzzWhizz_when_divided_exactly_by_3_and_5_and_7() {
        Game game = new Game();
        assertThat(game.run(105)).isEqualTo("BuzzWhizz");
    }

    @Test
    void should_return_Fizz_when_contains_3() {
        Game game = new Game();
        assertThat(game.run(30)).isEqualTo("Fizz");
    }

    @Test
    void should_not_return_Fizz_when_contains_5_and_divided_exactly_by_3() {
        Game game = new Game();
        assertThat(game.run(54)).isEqualTo("54");
    }
}
