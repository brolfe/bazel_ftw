package abc.demo;

import org.junit.Test;
import org.mockito.Mockito;

import static com.google.common.truth.Truth.assertThat;

public class DemoTest {
    @Test
    public void testEcho() {
        Demo demo = new Demo();
        String result = demo.echo("foo");
        assertThat(result).isEqualTo("Echo foo");
    }

    @Test
    public void testEchoSet() {
        Demo demo = new Demo();
        assertThat(demo.echoSet("foo")).containsExactly("foo");
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