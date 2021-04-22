package abc;

import com.google.inject.AbstractModule;

final class SolutionModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Solution.class);
    }
}
