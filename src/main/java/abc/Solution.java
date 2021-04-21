package abc;

import com.google.common.collect.ImmutableSet;

final class Solution {
    String echo(String input) {
        return "Echo " + input;
    }

    ImmutableSet<String> echoSet(String input) {
        return ImmutableSet.of(input);
    }
}
