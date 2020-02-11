package forge;

import java.util.Scanner;

public class clase05e01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, n, pares = 0, impares = 0;
        while(i < 10){
            System.out.println("Ingrese un numero");
            n = in.nextInt();
            if(n % 2 == 0){
                pares++;
            }else{
                impares++;
            }
            i++;
        }
        System.out.println("numero de pares: " + pares);
        System.out.println("numero de impares: "+ impares);
    }
}
