package br.com.challenge.sysmanager.sysmanager_biggestprimenumber;

public class NoPrimeNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoPrimeNumberException() {
		super("Não há número primo entre os 2 valores informados.");
	}

}
