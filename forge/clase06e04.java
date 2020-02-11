package forge;
import java.util.Scanner;

public class clase06e04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j,gasto;
        float promedio_acumulado = 0;
        for(i=0; i < 5; i++){
            System.out.println("Persona "+ (i+1));
            int suma = 0;
            float promedio_persona;
            for(j=0; j < 3; j++){
                System.out.println("Ingrese gasto numero "+ (j+1));
                gasto = in.nextInt();
                suma = suma + gasto;
            }
            promedio_persona = suma/3.0f;
            promedio_acumulado = promedio_acumulado + promedio_persona;
        }
        promedio_acumulado = promedio_acumulado/5.0f;
        System.out.println("El promedio de compras de todas las personas fue "+ promedio_acumulado);
    }
}