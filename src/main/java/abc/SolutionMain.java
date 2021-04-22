package abc;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SolutionMain {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new SolutionModule());
        Solution solution = injector.getInstance(Solution.class);

        System.out.println(solution.echo("Hello World"));
    }
}
