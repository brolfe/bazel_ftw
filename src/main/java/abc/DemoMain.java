package abc;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class DemoMain {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DemoModule());
        Demo demo = injector.getInstance(Demo.class);

        System.out.println(demo.echo("Hello World"));
    }
}
