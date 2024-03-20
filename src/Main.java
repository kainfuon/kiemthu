import java.util.Scanner;

public class Main {
    public static String check(int x) {
        if ((x <= 0) || (x > 40)) return "Khong hop le";
        else if (x < 15) return "7000 VND";
        else if  (x < 25) {
            return "8000 VND";
        } else if (x < 30) {
            return "9000 VND";
        }
        else return "12000 VND";
    }

}