package abc.screen;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Solves the screen!
 */
final class ScreenSolver {

    private final String echoPrefix;

    ScreenSolver(String echoPrefix) {
        this.echoPrefix = echoPrefix;
    }

    /**
     * Returns an echo...echo...echo...
     */
    String echo(String input) {
        return String.format("%s %s!", echoPrefix, input);
    }

    String echo(Collection<String> input) {
        return input.stream().map(this::echo).collect(Collectors.joining(" "));
    }

}
