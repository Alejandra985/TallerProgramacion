
package com.mycompany.punto2;

import java.util.Scanner;




public class taller {
public static void main(String[] args){
        int num1, num2, suma, resta, modulo;
        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        num1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        num2 = teclado.nextInt();

        suma = num1 + num2;
        resta = num1 - num2; 
        modulo = num1 % num2;

        System.out.println( "La suma es " + suma);
        System.out.println( "La resta es " + resta);
        System.out.println( "El residuo es " + modulo);
    }
}

