import org.junit.jupiter.api.Test;

import java.security.UnresolvedPermission;

import static org.junit.jupiter.api.Assertions.*;

class UpperLowerCaseTest {

    @Test
    void containsUpperLowerCase() {
        assertTrue(PasswortValidieren.containsUpperLowerCase("Hallo123"));
    }
}