import java.util.Scanner;

public class Tarea2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("El resultado de la serie se interpreta de la siguiente manera: True (Consecutiva)  False(No Consecutiva)");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("Ingresa una serie de caracteres: ");
            String inicio = sc.nextLine();

            boolean SecuenciaConsecutiva = true;

            for (int i = 0; i < inicio.length() - 1; i++) {
                int serie1 = (int) inicio.charAt(i);
                int serie2 = (int) inicio.charAt(i + 1);

                if (serie2 - serie1 != 1) {
                    SecuenciaConsecutiva = false;
                    break;
                }
            }

            System.out.println("La secuencia de caracteres es: " + SecuenciaConsecutiva);
        }
}
