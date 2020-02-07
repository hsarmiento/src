package forge;
import java.util.Scanner;

public class g03e06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tiempo, hora, min, seg;
        System.out.println("Ingrese tiempo en segundos");
        tiempo = in.nextInt();
        hora = tiempo/3600;  // una hora tiene 3600 segundos
        min = (tiempo%3600)/60;  //vemos si al dividir por 1 hora sobra tiempo.
        seg = (tiempo%3600)%60;  //si sobra al dividir por hora y minutos, es por que son los segundos restantes
        System.out.println("Los segundos ingresados se pueden dividir en:");
        System.out.println("hora: " + hora);
        System.out.println("minuto: " + min);
        System.out.println("segundo: " + seg);
    }
}
