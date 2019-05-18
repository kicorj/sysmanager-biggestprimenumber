package br.com.challenge.sysmanager.sysmanager_biggestprimenumber;

import java.util.Scanner;

/**
 * Main Class para execução do desafio
 * @author kico
 *
 */
public class AppMain {

	public static void main( String[] args )
    {
		Scanner sc = new Scanner(System.in); 
        int startNumber;
        int endNumber;
  
        System.out.println("Digite o primeiro número do intervalo: "); 
        startNumber = sc.nextInt(); // Lê o input 
  
        System.out.println("Digite o último número do intervalo: "); 
        endNumber = sc.nextInt(); // Lê o input 
        
        sc.close();
  
        //Imprime o resultado
        System.out.printf("O maior número primo entre %d e %d é: ", startNumber, endNumber);
        try {
			System.out.println(PrimeNumber.findBiggestPrimeNumberBetweenTwoNumbers(startNumber, endNumber));
		} catch (NoPrimeNumberException e) {
			System.err.println(e.getMessage());
		}
    }
	
}
