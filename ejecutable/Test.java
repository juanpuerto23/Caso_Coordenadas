package ejecutable;

import java.text.DecimalFormat;

import modelo.Coordenada;

public class Test
{
    public static void main(String[] args) {
        
        Coordenada c1 = new Coordenada();
        System.out.println("Coordenada 1: " + c1);

        Coordenada c2 = new Coordenada(1.3, 5.3);
        System.out.println("Coordenada 2: " + c2);

        Coordenada c3 = c1;
        System.out.println("Coordenada 3: " + c3);

        Coordenada c4 = c2;
        System.out.println("Coordenada 4: " + c4);

        System.out.println("\nPunto 2\n");
        if (c1.equals(c2))
        {
            System.out.println("Las coordenadas " + c1 + " y " + c2 + " son iguales");
        }
        else
        {
            System.out.println("Las coordenadas " + c1 + " y " + c2 +  " son diferentes");
        }

        System.out.println("\nPunto 3\n");
        Coordenada otra = new Coordenada();
        otra.setX(1.3);
        otra.setY(5.3);

        Coordenada nueva = new Coordenada();
        nueva.setX(3.8);
        nueva.setY(2.6);

        if (otra.equals(c1))
        {
            System.out.println("Las coordenadas " + otra + " y " + nueva + " son iguales");
        }
        else
        {
            System.out.println("Las coordenadas " + otra + " y " + nueva +  " son diferentes");
            double XTotal = (nueva.getX() - otra.getX());
            double YTotal = (nueva.getY() - otra.getY());
            double P = (Math.pow(XTotal, 2) + Math.pow(YTotal, 2));
            double distancia = (Math.pow(P, 0.5));
            DecimalFormat formato1 = new DecimalFormat("#.000");
            System.out.println("La distancia entre los puntos " + nueva + " y " + otra + " es igual a: " + (formato1.format(distancia)) + " unidades.");
        }   
    }
}

