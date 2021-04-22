package abc.demo;

import com.google.inject.AbstractModule;

final class DemoModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Demo.class);
    }
}
