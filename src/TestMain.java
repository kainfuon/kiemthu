import org.junit.Test;
import static org.junit.Assert.*;
public class Test {

    @Test
    void test1(){
        String result = Main.check(25);
        assertEquals("Allowed", result);
    }

}
