package forge;
import java.util.Scanner;

public class g03e01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float libras, kilos;
        System.out.println("Ingrese peso en kilos");
        kilos = in.nextFloat();
        libras = kilos*2.2046f;
        System.out.println("El peso en libras es "+ libras);
    }
}
