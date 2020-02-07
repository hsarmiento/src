package forge;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un numero");
        n = in.nextInt();
        if(n > 0) {
            // este bloque encerrado entre llaves es
            // cuando se cumple la condicion
            System.out.println("n es mayor que cero");
            if (n > 10) {
                System.out.println("n es mayor que 10");
            } else {
                System.out.println("n es menor o igual que 10, pero mayor que cero");
            }
        }
        System.out.println("con too sino pa que");
    }

}
