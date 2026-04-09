import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    @Test
    public void testEven() {
        App app = new App();
        assertTrue(app.isEven(10));
        assertFalse(app.isEven(7));
    }
}
