package main;

public class Maquinadecafe {
    int agua;
    int cafe;
    int crema;
    int vasos;

    public Maquinadecafe() {
        agua = 5000;
        cafe = 1000;
        crema = 1500;
        vasos = 50;
    }

    public void servirAmericano() {
        if (agua >= 180 && cafe >= 15 && vasos > 0) {
            agua -= 180;
            cafe -= 15;
            vasos--;
            System.out.println("Tu café americano esta listo!.");
        } else {
            System.out.println("No hay suficientes ingredientes para tu cafe :(.");
        }
    }

    public void servirExpreso() {
        if (agua >= 120 && cafe >= 20 && vasos > 0) {
            agua -= 120;
            cafe -= 20;
            vasos--;
            System.out.println("Tu café expreso esta listo.");
        } else {
            System.out.println("No hay suficientes ingredientes para tu cafe :(.");
        }
    }

    public void servirCapuchino() {
        if (agua >= 100 && cafe >= 14 && crema >= 70 && vasos > 0) {
            agua -= 100;
            cafe -= 14;
            crema -= 70;
            vasos--;
            System.out.println("Tu capuchino esta listo.");
        } else {
            System.out.println("No hay suficientes ingredientes para tu capuchino.");
        }
    }

    public void estadoRecursos() {
        System.out.println("Recursos actuales:");
        System.out.println("Agua: " + agua + " ml");
        System.out.println("Café: " + cafe + " g");
        System.out.println("Crema: " + crema + " ml");
        System.out.println("Vasos: " + vasos);
    }
}
