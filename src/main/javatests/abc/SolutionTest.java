package abc;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testEcho() {
        Solution solution = new Solution();
        String result = solution.echo("foo");
        assertThat(result).isEqualTo("Echo foo");
    }

    @Test
    public void testEchoSet() {
        Solution solution = new Solution();
        assertThat(solution.echoSet("foo")).containsExactly("foo");
    }
}