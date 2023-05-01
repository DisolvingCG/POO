package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     Caja<String> miCaja = new Caja<>(new String[10]);

     miCaja.add(0,"Hola");
     miCaja.add(1, "Adios");
     miCaja.add(2, "Hi");
     System.out.println(miCaja);
     String temp = miCaja.get(0);

     System.out.println("---------");
     CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
     cajaSin.add(0, "Hola");
     cajaSin.add(1, "Adios");
     cajaSin.add(2, "Hi");
     System.out.println(cajaSin);
     //Transformamos el tipo de dato con un casting ya asi no marca error
     String temp2=  (String)cajaSin.get(0);

     /* Si le pedimos a la clase que la clase CajaSinGenericos
     nos devuelva un dato string, nos lo marcara mal, ya que los datos
       que maneja no son String, si no Object
        Sting temp2 = cajaSin.get(0);*/

     System.out.println("-----------comida---------");

     Caja<Comida> cajaComida = new Caja<>(new Comida[10]);

     cajaComida.add(0, new Comida("Yogurth", true));
     System.out.println(cajaComida.get(0));

     System.out.println("-----");

     /*Los array en listas, a comparacion de la primera declaracion de caja
     No esta limitada en su tamaño por un valor fijo, es dinamica*/

     ArrayList<Comida> comidas = new ArrayList<>();
     comidas.add(new Comida("Zanahoria", false));
     comidas.add(new Comida("Zanahoria", false));
     comidas.add(new Comida("Zanahoria", false));
     comidas.add(new Comida("Zanahoria", false));
     comidas.add(new Comida("Zanahoria", false));
     comidas.add(new Comida("Zanahoria", false));
     comidas.add(new Comida("Zanahoria", false));
     comidas.add(new Comida("Zanahoria", false));
     comidas.add(new Comida("Zanahoria", false));
     comidas.add(new Comida("Manzana", false));
     System.out.println(comidas.size());
     System.out.println(comidas.get(13));

     ArrayList<Comida> comidas2 = new ArrayList<>();
     comidas2.add(new Comida("Zanahoria", false));
     comidas2.add(new Comida("Yogurth", true));
     comidas2.add(new Comida("Queso", true));
     comidas2.add(new Comida("Manzana", false));
     comidas2.add(new Comida("Lechuga", false));

     System.out.println(comidas2.get(3));
     comidas2.set(3, new Comida("Fresa", false));
     comidas2.add(3, new Comida("Naranja", false));
     System.out.println("----final----");
     for (Comida comida : comidas2) {
      System.out.println(comida);
     }


    }

}