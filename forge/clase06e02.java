package forge;
import java.util.Scanner;

public class clase06e02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, total = 0, gasto;
        for(i=0; i < 5; i++){
            System.out.println("Persona "+ (i+1));
            for(j=0; j < 3; j++){
                System.out.println("Ingrese gasto numero "+ (j+1));
                gasto = in.nextInt();
                total = total + gasto;
            }
        }
        System.out.println("el gasto total fue de " + total);
    }
}
