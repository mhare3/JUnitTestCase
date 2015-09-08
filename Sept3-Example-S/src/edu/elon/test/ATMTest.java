package edu.elon.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.NumberFormat;

public class ATMTest {

  private ATM atm;

  @Before
  public void setUp() throws Exception {
    atm = new ATM(1000);
  }

  @After
  public void tearDown() throws Exception {
    atm = null;
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDeposit() {
    atm.deposit(-100);
    // atm.deposit(500);
    // assertEquals(1500, atm.getBalance(), 0);
  }

  @Test
  public void testGetBalance() {
    assertEquals(1000, atm.getBalance(), 0);
  }

  @Test
  public void testToString() {
    String str = atm.toString();
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    assertEquals("Amount balance is " + currencyFormat.format(atm.getBalance()),
            str);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithdraw() {
    atm.withdraw(1500);
    // atm.withdraw(200);
    // assertEquals(800, atm.getBalance(), 0);
  }

}
