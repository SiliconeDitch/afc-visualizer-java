import org.junit.*;
import static junit.framework.TestCase.assertEquals;

public class TestMain {
    @Test
    public void additionTest(){
        Main main = new Main();
        assertEquals(5, main.sum(2, 3));
    }
}
