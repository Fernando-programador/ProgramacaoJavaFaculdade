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
public class DivisaoPorZero {

    public static void main(String[] args) {

        int divisor, dividendo, quociente = 0;
        String controle = "s";

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Entre com o dividendo.");
            dividendo = s.nextInt();
            System.out.println("Entre com o divisor.");
            divisor = s.nextInt();
            try {
                quociente = dividendo / divisor;
            } catch (Exception e) {
                System.out.println("ERRO: Não é possível essa divisão");
            }
            
            System.out.println("O quociente é: " + quociente);
            System.out.println("Repetir?");
            controle = s.next().toString();
        } while (controle.equals("s"));

        s.close();
    }

}
