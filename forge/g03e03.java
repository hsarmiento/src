package forge;
import java.util.Scanner;

//fe de erratas, la pregunta deberia decir que ingrese el anio de nacimiento
// no la fecha completa

public class g03e03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anio, hoy, quince;

        System.out.println("Ingrese anio de nacimiento");
        anio = in.nextInt();
        hoy = 2020-anio;
        quince = hoy + 15;
        System.out.println("Su edad hasta este año es " + hoy + " y en 15 anios sera" + quince);
    }
}
