package forge;
import java.util.Scanner;

public class g03e05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre, apellido, inicial_nombre, inicial_apellido;
        System.out.println("Ingrese nombre");
        nombre = in.nextLine();
        System.out.println("Ingrese apellido");
        apellido = in.nextLine();
        nombre = nombre.toLowerCase(); //dejamos nombre y apellido en minuscula para asegurarnos
        apellido = apellido.toLowerCase();
        inicial_nombre = nombre.substring(0,1); //extraemos la primera letra de ambos y las guardamos en 2 variables
        inicial_apellido = apellido.substring(0,1);
        inicial_nombre = inicial_nombre.toUpperCase(); //primera letra de ambos en mayuscula
        inicial_apellido = inicial_apellido.toUpperCase();
        nombre = inicial_nombre + nombre.substring(1);
        apellido = inicial_apellido + apellido.substring(1);
        System.out.println("El nombre y apellido formateado es " + nombre + " " + apellido);
    }
}
