import static org.junit.Assert.*;

public class DocSearchTest {
    @Test
    public void handleURLTest() {
        assertEquals(handleRequest(), "Don't know how to handle that path!")
    }
}