package main.Desafio_01;

/**
 * DESAFIO 01
 *
 * Neste desafio, o programa reverte as palavras, mantendo a ordem
 * de suas letras.
 *
 ***** Exemplo:
 ***** -> Input: Hello, World! OpenAI is amazing.
 ***** -> Output: amazing. is OpenAI World! Hello,
 *
 *
 * Vale ressaltar que, indo além do pedido, o código possui uma con-
 * dicional que permite ao usuário escolher entre o exemplo acima ou
 * entrar com uma frase própria.
 *
 * @autor: Marco Sabatini
 * @version: 1.02
 * @since: 08/07/2023
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String strExemplo = "Hello, World! OpenAI is amazing.";
        String fraseUser;

        Scanner enter = new Scanner(System.in);

        System.out.println("DESAFIO 01");
        System.out.println("Reversão de palavras.\n");
        System.out.println("---------------------\n");
        System.out.print("Digite 1 para ver o exemplo ou digite sua frase: ");

        fraseUser = enter.nextLine();


        if (fraseUser.equals("1")) {
            String[] count = strExemplo.split(" ");
            String[] reverse = new String[count.length];

            int c = 0;

            for (int i = count.length; i > 0; i--) {

                reverse[c] = count[i - 1];

                c++;
            }

            System.out.println("\t--> Input: " + strExemplo);
            arrPrint(reverse);
            System.out.println();

        } else {

            String[] count = fraseUser.split(" ");
            String[] reverse = new String[count.length];

            int c = 0;

            for (int i = count.length; i > 0; i--) {

                reverse[c] = count[i - 1];

                c++;
            }

            System.out.println("\t--> Input: " + fraseUser);
            arrPrint(reverse);
            System.out.println();

        }

        enter.close();
    }


    // Poderíamos incluir nesse método o código repetido acima no if{}else{}
    // Porém, para fins didáticos, não refatoramos o código.
    public static void arrPrint(String[] arr) {

        System.out.print("\t--> String revertida: ");
        for (String s : arr) {
            System.out.print(s + " ");
        }

    }
}