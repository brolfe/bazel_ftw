package abc;

import org.junit.Test;
import org.mockito.Mockito;

import static com.google.common.truth.Truth.assertThat;

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

    interface Shape {
        int getArea();
    }

    @Test
    public void testMock() {
        Shape shapeMock = Mockito.mock(Shape.class);
        Mockito.when(shapeMock.getArea()).thenReturn(50);
        assertThat(shapeMock.getArea()).isEqualTo(50);
        Mockito.verify(shapeMock, Mockito.times(1)).getArea();
    }
}