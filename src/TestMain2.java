import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain2 {
    @Test
    public void test1(){
        String result = Main.check(-1);
        assertEquals("Khong hop le", result);
    }

    @Test
    public void test2(){
        String result = Main.check(0);
        assertEquals("Khong hop le", result);
    }

    @Test
    public void test3(){
        String result = Main.check(1);
        assertEquals("7000 VND", result);
    }

    @Test
    public void test4(){
        String result = Main.check(8);
        assertEquals("7000 VND", result);
    }

    @Test
    public void test5() {
        String result = Main.check(14);
        assertEquals("7000 VND", result);

    }

    @Test
    public void test6() {
        String result = Main.check(15);
        assertEquals("8000 VND", result);

    }

    @Test
    public void test7(){
        String result = Main.check(16);
        assertEquals("8000 VND", result);
    }

    @Test
    public void test8(){
        String result = Main.check(20);
        assertEquals("8000 VND", result);
    }

    @Test
    public void test9(){
        String result = Main.check(24);
        assertEquals("8000 VND", result);
    }

    @Test
    public void test10(){
        String result = Main.check(25);
        assertEquals("9000 VND", result);
    }

    @Test
    public void test11() {
        String result = Main.check(26);
        assertEquals("9000 VND", result);

    }

    @Test
    public void test12() {
        String result = Main.check(27);
        assertEquals("9000 VND", result);

    }

    @Test
    public void test13(){
        String result = Main.check(29);
        assertEquals("9000 VND", result);
    }

    @Test
    public void test14(){
        String result = Main.check(30);
        assertEquals("12000 VND", result);
    }

    @Test
    public void test15(){
        String result = Main.check(31);
        assertEquals("12000 VND", result);
    }

    @Test
    public void test16(){
        String result = Main.check(35);
        assertEquals("12000 VND", result);
    }

    @Test
    public void test17() {
        String result = Main.check(39);
        assertEquals("12000 VND", result);

    }

    @Test
    public void test18() {
        String result = Main.check(40);
        assertEquals("12000 VND", result);

    }

    @Test
    public void test19() {
        String result = Main.check(45);
        assertEquals("Khong hop le", result);

    }
}
