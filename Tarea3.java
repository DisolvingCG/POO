import java.util.Scanner;
public class Tarea3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de 9 caracteres que contenga solo X, O y _ : ");
        String Arreglo = scanner.nextLine();

        if (Arreglo.length() != 9) {
            System.out.println("La cadena debe contener exactamente 9 caracteres.");
            return;
        }

        System.out.println("Cadena ingresada: " + Arreglo);

        System.out.println("Marco: ");
        System.out.println(" " + Arreglo.charAt(0) + " | " + Arreglo.charAt(1) + " | " + Arreglo.charAt(2) + " ");
        System.out.println("---|---|---");
        System.out.println(" " + Arreglo.charAt(3) + " | " + Arreglo.charAt(4) + " | " + Arreglo.charAt(5) + " ");
        System.out.println("---|---|---");
        System.out.println(" " + Arreglo.charAt(6) + " | " + Arreglo.charAt(7) + " | " + Arreglo.charAt(8) + " ");
    }
}