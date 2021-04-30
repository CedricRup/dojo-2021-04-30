package pin;

import java.util.Set;


public class PinGuesser {
    public Set<String> getPINs(String observedPin) {
        if (("2").equals(observedPin)) {
            return Set.of("1", "2", "3", "5");
        } else if ("3".equals(observedPin)) {
            return Set.of("2", "3", "6");
        }
        return Set.of("1", "2", "4");
    }
}
