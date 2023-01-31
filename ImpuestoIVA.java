package com.javasesion1.ClaseString;

import java.util.Scanner;

public class ImpuestoIVA {
    public static void main(String[] args) {
        Double precioProducto;
        Scanner scan =  new Scanner(System.in);
        System.out.print("Ingresa el precio de un producto: " ); precioProducto = scan.nextDouble();
        System.out.println("---Se calculara el precio  con IVA incluido---");

        System.out.println("El precio con IVA incluido es: "+ PrecioConImpuesto(precioProducto));
    }

    public static Double PrecioConImpuesto(Double precio){
        Double impuesto = precio*0.21;
        Double PrecioFinal = precio + impuesto;
        return PrecioFinal;
    }
}
