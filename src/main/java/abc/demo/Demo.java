package abc.demo;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;

final class Demo {

    @Inject
    Demo() {}
    String echo(String input) {
        return "Echo " + input;
    }

    ImmutableSet<String> echoSet(String input) {
        return ImmutableSet.of(input);
    }
}
