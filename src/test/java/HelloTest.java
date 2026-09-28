import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {

    @Test
    void testGreeting() {
        String greeting = "Hello from Java in Docker!";

        assertTrue(greeting.contains("Hello"));
        assertTrue(greeting.contains("Docker"));
    }

    @Test
    void testSimpleMath() {
        assertEquals(4, 2 + 2);
    }
}
