import org.junit.Test;
import static org.junit.Assert.*;
public class TestMain {

    @Test
    public void test1(){
        String result = Main.check(0);
        assertEquals("Khong hop le", result);
    }

    @Test
    public void test2(){
        String result = Main.check(10);
        assertEquals("7000 VND", result);
    }

    @Test
    public void test3(){
        String result = Main.check(20);
        assertEquals("8000 VND", result);
    }

    @Test
    public void test4(){
        String result = Main.check(27);
        assertEquals("9000 VND", result);
    }

    @Test
    public void test5() {
        String result = Main.check(35);
        assertEquals("12000 VND", result);

    }

    @Test
    public void test6() {
        String result = Main.check(45);
        assertEquals("Khong hop le", result);

    }

}
