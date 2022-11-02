/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacaoII.Excecoes;

import java.util.Scanner;

/**
 *
 * @author notebook
 */
public class FinallyExcecao {

    public static void main(String args[]) throws InterruptedException {
        int divisor, dividendo, quociente = 0;
        String controle = "s";

        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Entre com o dividendo.");
            dividendo = s.nextInt();
            System.out.println("Entre com o divisor.");
            divisor = s.nextInt();
            try {
                if (divisor == 0) {
                    throw new ArithmeticException("Divisor nulo.");
                }
                quociente = dividendo / divisor;
            } catch (Exception e) {
                System.out.println("ERRO: Divisão por zero! " + e.getMessage());
            } finally {
                System.out.println("Bloco finally.");
            }
            System.out.println("O quociente é: " + quociente);
            System.out.println("Repetir?");
            controle = s.next().toString();
        } while (controle.equals("s"));
        s.close();
    }
}
