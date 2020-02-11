package forge;

import java.util.Scanner;

public class clase05e02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,cantidad = 0;
        float suma = 0;
        boolean flag = true;
        while(flag){
            System.out.println("Ingrese un numero");
            n = in.nextInt();
            if(n == 0){
                flag = false;
            }else{
                cantidad ++;
                suma = suma + n;
            }
        }
        float promedio;
        promedio = suma/cantidad;
        System.out.println("el promedio es igual a " + promedio);
    }
}
