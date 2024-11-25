package Ej;
//Autor:AROA RIVAS RIOS
/*
 * Un alamacén de ropa identidica sus productos siguiendo un código 
 * formado por números y letras, el cual permite reconocer el tipo
 * de cliente al que van dirigidos, un identificador y su origen de fabricación.
 *  Su estreuctura es la siguiente:
 * 
 * Una letra que indica el tipo de cliente('H'-Hombre,'M'-Mujer o 'B'Bebé);
 * Un identificador de entre tres y siete dígitos numéricos;
 * Una letra que indica el origen de fabricación del producto: 'E'(Europa) 
 * o 'A'(Asi);
 * Un código de control (dos dígitos).
 * Las letras solo pueden ser mayúsculas. Si hay alguna letra minúscula,
 * el código se considera inválido.
 * 
 * Escribe un programa en Java que permita detectar si una cadena cumple 
 * le estructura de un código textil. Y, en caso afirmativo,  extraer 
 * en variables de tipo String el tipo de cliente, el indentificador, el
 * origen de fabricación y el código de control.
 */

import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Ejercicio13 {
    public static void main(String[] args) {
 
        String [] producto = {"H12345E15", "M00000E00","A12345E11","B00011A02","B00011A11","h12345E15","B1111A04","B111111A06"};
       String [] descripcionproducto;


        //tipoCliente = [HNB];
        //identificador = [0-9];
        //origen =[EA];
        //control=[0-9]{2}


        Pattern patron= Pattern.compile("([HNB])([0-9])([EA])([0-9]{2})");
       // Matcher union= patron.matcher(texto);

        /*String tipoCliente, identificador, origen, control;
        if(union.matches()){

        }*/
    }
}
