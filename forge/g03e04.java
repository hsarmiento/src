package forge;
import java.util.Scanner;

public class g03e04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anio, mes, vividos;
        System.out.println("Ingrese anio que nacio");
        anio = in.nextInt();
        System.out.println("Ingrese mes que nacio");
        mes = in.nextInt();
        vividos = (2020-anio)*12 + (12-mes);
        System.out.println("Has vivido " + vividos + " meses");
    }
}
