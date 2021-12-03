import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDigitTest {

    @Test
    void containsNum() {
        assertTrue(PasswortValidieren.containsNum("rollor123"));
    }
}