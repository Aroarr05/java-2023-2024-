import java.util.Scanner;

public class NumerosRomanos {
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un número del 1 al 3999: ");
        int num = entrada.nextInt();

        System.out.println("El número " + num + " es: " + romanos(num));
        entrada.close();
    }
    public static String romanos(int numeroEntero) {
        String unidadesStr="";
        String decenasStr="";
        String centenasStr="";
        String millaresStr="";
        
        int unidades = numeroEntero % 10;

        int decenas = numeroEntero / 10;
        decenas %= 10;

        int centenas = numeroEntero / 100;
        
        centenas %= 10;

        int millares = numeroEntero / 1000;
        millares %= 10;

        switch (millares) {
            case 0: millaresStr = ""; break;
            case 1: millaresStr = "M";  break;
            case 2: millaresStr = "MM"; break;
            case 3: millaresStr = "MMM"; break;
        }
        switch (centenas) {
            case 0: centenasStr = ""; break;
            case 1: centenasStr = "C";  break;
            case 2: centenasStr = "CC"; break;
            case 3: centenasStr = "CCC"; break;
            case 4: centenasStr = "CD"; break;
            case 5: centenasStr = "D"; break;
            case 6: centenasStr = "DC"; break;
            case 7: centenasStr = "DCC"; break;
            case 8: centenasStr = "DCCC"; break;
            case 9: centenasStr = "CM"; break;
        }
        switch (decenas) {
            case 0: decenasStr = ""; break;
            case 1: decenasStr = "X";  break;
            case 2: decenasStr = "XX"; break;
            case 3: decenasStr = "XXX"; break;
            case 4: decenasStr = "XL"; break;
            case 5: decenasStr = "L"; break;
            case 6: decenasStr = "LX"; break;
            case 7: decenasStr = "LXX"; break;
            case 8: decenasStr = "LXXX"; break;
            case 9: decenasStr = "XC"; break;
        }
        switch (unidades) {
            case 0: unidadesStr = ""; break;
            case 1: unidadesStr = "I";  break;
            case 2: unidadesStr = "II"; break;
            case 3: unidadesStr = "III"; break;
            case 4: unidadesStr = "IV"; break;
            case 5: unidadesStr = "V"; break;
            case 6: unidadesStr = "VI"; break;
            case 7: unidadesStr = "VII"; break;
            case 8: unidadesStr = "VIII"; break;
            case 9: unidadesStr = "IX"; break;
        }
        return millaresStr + centenasStr + decenasStr + unidadesStr;
    }
}