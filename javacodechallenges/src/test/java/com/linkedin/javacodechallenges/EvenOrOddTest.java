package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EvenOrOddTest {

  /**
   * 
   */
  @Test
    public void testEvenOrOdNumber(){
    
      assertTrue(EvenOrOdd.checkEvenOrOdd(10));
      assertFalse(EvenOrOdd.checkEvenOrOdd(5));
      assertTrue(EvenOrOdd.checkEvenOrOdd(140));
      assertTrue(EvenOrOdd.checkEvenOrOdd(110));
      assertFalse(EvenOrOdd.checkEvenOrOdd(195));
    }
  
}
