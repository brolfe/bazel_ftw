package abc.screen;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class ScreenSolverTest {

    @Test
    public void echo() {
        ScreenSolver solver = new ScreenSolver("Echo");
        assertThat(solver.echo("hello")).isEqualTo("Echo hello!");
    }

    @Test
    public void echo_collection() {
        ScreenSolver solver = new ScreenSolver("Echo");
        assertThat(solver.echo(ImmutableList.of("hello", "world"))).isEqualTo("Echo hello! Echo world!");
    }
}