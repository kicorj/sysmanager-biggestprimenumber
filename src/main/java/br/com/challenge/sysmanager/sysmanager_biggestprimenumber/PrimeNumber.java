package br.com.challenge.sysmanager.sysmanager_biggestprimenumber;

/**
 * Classe para operações com números primos
 * @author kico
 *
 */
public class PrimeNumber 
{
	
	private PrimeNumber() {}
	
	/**
	 * Método que verifica se um número é primo
	 * @param n
	 * @return
	 */
	public static boolean isPrime(final int number) {
		if (number == 2) return true;
		if (number == 1 || number % 2 == 0) return false;
		
		for(int i = 3; i * i <= number; i += 2) {
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	/**
	 * Método que retorna o maior número primo dado um limite inferior e um limite superior
	 * @param startNumber
	 * @param endNumber
	 * @return
	 * @throws NoPrimeNumberException
	 */
	public static int findBiggestPrimeNumberBetweenTwoNumbers(int startNumber, int endNumber) throws NoPrimeNumberException {
		int biggestPrimeNumber = 0;
        
        for (int i = startNumber; i <= endNumber; i++) { 
        	if(PrimeNumber.isPrime(i))
        		biggestPrimeNumber = i;
        }
        
        if (biggestPrimeNumber == 0)
        	throw new NoPrimeNumberException();
        
        return biggestPrimeNumber;
	}
}
