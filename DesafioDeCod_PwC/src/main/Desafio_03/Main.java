package main.Desafio_03;

/**
 * DESAFIO 03
 * <p>
 * O código abaixo encontra e imprime uma substring palíndroma,
 * caso exista, a partir de uma string maior.
 * <p>
 * **** Exemplo:
 * **** -> Input: babad
 * **** -> Output: bab
 *
 * @autor: Marco Sabatini
 * @version: 1.02
 * @since: 08/07/2023
 **/


import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String strExemplo = "babad";
        String palindromo;
        Scanner enter = new Scanner(System.in);

        System.out.println("DESAFIO 03");
        System.out.println("Encontrar palíndromos.\n");
        System.out.println("---------------------\n");
        System.out.print("Digite 1 para ver o exemplo ou digite seu palíndromo: ");

        palindromo = enter.nextLine();

        if (palindromo.equals("1")) {
            System.out.println("-> Input: " + strExemplo);
            encontraPalindromos(strExemplo);
            System.out.println();

        } else {
            System.out.println("-> Input: " + palindromo);
            encontraPalindromos(palindromo);
            System.out.println();
        }

        enter.close();
    }

    public static void encontraPalindromos(String str){

        Set<String> conjuntoPalindromo = new LinkedHashSet<>();

        if(str.length() >= 3){
            for(int i = 0; i < str.length();i++){
                conjPalindromos(str, i, i, conjuntoPalindromo);
                conjPalindromos(str, i, i + 1, conjuntoPalindromo);
            }
        } else {
            conjuntoPalindromo.add("Por favor, digite uma palavra com 3 ou mais caracteres.");
        }

        Object[] palindromos = conjuntoPalindromo.toArray();

        if(conjuntoPalindromo.isEmpty()){
            System.out.println("Nenhum palíndromo foi encontrado.");
        } else {
            System.out.println("O(s) foi/foram:");
            for(int i = 0; i < palindromos.length;i++){

                String strP = (String) palindromos[i];

                if(strP.length() >= 3){
                    System.out.println(palindromos[i]);
                }
            }
        }

        Object maiorPalindromo = palindromos[0];
        int tamanhoMaisComprido = maiorPalindromo.toString().length();

        for (int i = 1; i < palindromos.length; i++) {
            Object objetoAtual = palindromos[i];
            int tamanhoAtual = objetoAtual.toString().length();

            if (tamanhoAtual > tamanhoMaisComprido) {
                maiorPalindromo = objetoAtual;
                tamanhoMaisComprido = tamanhoAtual;
            }
        }
        System.out.println("\t--> O maior palíndromo é: " + maiorPalindromo);
    }

    private static void conjPalindromos(String str, int min, int max, Set<String> conjunto) {

        while (min >= 0 && max < str.length() && str.charAt(min) == str.charAt(max)) {

            conjunto.add(str.substring(min, max + 1));

            min--;
            max++;
        }
    }
}

