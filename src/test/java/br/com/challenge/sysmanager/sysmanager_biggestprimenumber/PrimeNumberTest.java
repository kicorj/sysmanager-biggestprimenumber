package br.com.challenge.sysmanager.sysmanager_biggestprimenumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testes unitários SysManager PrimeNumber
 * @author kico
 *
 */
public class PrimeNumberTest {
	
	@Test(expected = NoPrimeNumberException.class)
	public void passNoPrimeNumberShouldThrowException() throws NoPrimeNumberException {
		PrimeNumber.findBiggestPrimeNumberBetweenTwoNumbers(0, 1);
	}
	
	@Test
	public void passZeroAnd10MustReturnSeven() throws NoPrimeNumberException {
		assertTrue(PrimeNumber.findBiggestPrimeNumberBetweenTwoNumbers(0, 10) == 7);
	}
}
