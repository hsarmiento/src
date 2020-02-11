package forge;
import java.util.Scanner;

public class clase06e03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j,gasto;
        for(i=0; i < 5; i++){
            System.out.println("Persona "+ (i+1));
            int suma = 0;
            for(j=0; j < 3; j++){
                System.out.println("Ingrese gasto numero "+ (j+1));
                gasto = in.nextInt();
                suma = suma + gasto;
            }
            System.out.println("el gasto promedio de la persona "+ (i+1) + " fue " + (suma/3.0));
        }
    }
}
