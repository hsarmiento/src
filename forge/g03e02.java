package forge;
import java.util.Scanner;

public class g03e02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float f, c;
        System.out.println("Ingrese temperatura en fahrenheit");
        f = in.nextFloat();
        c = (f-32)/1.8f;
        System.out.println("La temperatura en celsius es" + c);
    }
}
