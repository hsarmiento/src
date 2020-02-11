package forge;


import javax.sound.midi.SysexMessage;

public class clase06e01 {
    public static void main(String[] args) {
        int i, j;
        for(i=1; i <=6; i++){
            for(j=1; j<=6; j++){
                if(i + j < 8){
                    System.out.println("combinacion de " + i + " y " + j );
                }
            }
        }
    }
}
