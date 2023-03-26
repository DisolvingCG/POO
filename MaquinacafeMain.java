package main;

import java.util.Scanner;

public class MaquinacafeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maquinadecafe maquina = new Maquinadecafe();
        maquina.estadoRecursos();

        boolean detener = false;
        while (!detener && maquina.vasos > 0 && (maquina.agua >= 180 || maquina.cafe >= 20 || maquina.crema >= 70)) {
            System.out.println("Que bebida quieres?:");
            System.out.println("1. Café americano");
            System.out.println("2. Café expreso");
            System.out.println("3. Capuchino");
            System.out.println("4. Detener la máquina");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    maquina.servirAmericano();
                    break;
                case 2:
                    maquina.servirExpreso();
                    break;
                case 3:
                    maquina.servirCapuchino();
                    break;
                case 4:
                    detener = true;
                    break;
                default:
                    System.out.println("No se encuentra lo que pediste, selecciona algo del menu.");
                    break;
            }

            if (!detener) {
                maquina.estadoRecursos();
                if (maquina.vasos == 0 || (maquina.agua < 180 && maquina.cafe < 20 && maquina.crema < 70)) {
                    System.out.println("Se acabaron los ingredientes para servir mas bebidas.");
                    detener = true;
                }
            }
        }
    }
}