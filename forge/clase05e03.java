package forge;

import java.util.Scanner;

public class clase05e03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int votos_si = 0, votos_no = 0;
        String opcion;
        boolean flag = true;
        while(flag){
            System.out.println("Ingrese una opcion");
            opcion = in.nextLine();
            if(opcion.equals("fin")){
                flag = false;
            }else{
                if(opcion.equals("si")){
                    votos_si = votos_si + 1;
                }else if(opcion.equals("no")){
                    votos_no = votos_no + 1;
                }else{
                    System.out.println("Ingrese una opcion valida 9(si, no o fin)");
                }
            }
        }

        if(votos_si > votos_no){
            System.out.println("El SI gano por " + (votos_si - votos_no) + " de diferencia");
        }else if(votos_si < votos_no){
            System.out.println("El NO gano por " + (votos_no - votos_si) + " de diferencia");
        }else{
            System.out.println("Hay empate");
        }


    }
}
