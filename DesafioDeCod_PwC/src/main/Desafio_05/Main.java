package main.Desafio_05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * DESAFIO 05
 *
 * Verifica se a string é um anagrama de um palíndromo.
 *
 * *** Exemplo:
 * *** -> Input: racecar
 * *** -> Output: true
 *
 * @autor: Marco Sabatini
 * @version: 1.01
 * @since: 09/07/2023
 **/

public class Main {


    public static void main(String[] args){

        String strExemplo = "racecar";
        String strUser;

        Scanner enter = new Scanner(System.in);

        System.out.println("DESAFIO 05");
        System.out.println("Verifica se existe uma nagrama em um palíndromo.\n");
        System.out.println("---------------------\n");
        System.out.print("Digite 1 para ver o exemplo ou digite seu palíndromo: ");

        strUser = enter.nextLine();


        if(strUser.equals("1")){
            System.out.println();
            System.out.println("-> Input: " + strExemplo);
            System.out.println("RESULTADO: " +  verificaAnagrama(strExemplo));
            System.out.println(resultado(verificaAnagrama(strExemplo)));

        } else {
            System.out.println();
            System.out.println("-> Input: " + strUser);
            System.out.println("RESULTADO: " +  verificaAnagrama(strUser));
            System.out.println(resultado(verificaAnagrama(strUser)));
        }

    }



    public static boolean verificaAnagrama(String str){

        str = str.replace("\\s", "").toLowerCase();

        StringBuilder strReserse = new StringBuilder(str).reverse();

        if(str.equals(strReserse.toString())){

            char[] cStr = str.toCharArray();
            char[] cReverse = strReserse.toString().toCharArray();

            Arrays.sort(cStr);
            Arrays.sort(cReverse);

            return Arrays.equals(cStr, cReverse);
        }

        return false;
    }

    public static String resultado(boolean bool){

        if(bool){
            return "Sim, existe um anagrama em seu palíndromo.\n";

        } else {
            return "Não, não existe um anagrama em seu palíndromo.\n";
        }
    }
}
