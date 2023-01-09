package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordComplexityCheckTest {

  @Test
  public void testPasswordComplexityMeets(){
  assertTrue(PasswordComplexityCheck.isComplexPassword("Ameena79"));
  assertTrue(PasswordComplexityCheck.isComplexPassword("AmEEna79"));
  assertTrue(PasswordComplexityCheck.isComplexPassword("Ameena7b"));
  assertTrue(PasswordComplexityCheck.isComplexPassword("SirazA875b"));
  assertTrue(PasswordComplexityCheck.isComplexPassword("Ameena789Zaa"));
  }

  @Test
  public void testPasswordComplexityDoesNotMeets() {
    assertFalse(PasswordComplexityCheck.isComplexPassword("Ame79"));
    assertFalse(PasswordComplexityCheck.isComplexPassword("AmEEna"));
    assertFalse(PasswordComplexityCheck.isComplexPassword("Ameena"));
    assertFalse(PasswordComplexityCheck.isComplexPassword("siraz875b"));
    assertFalse(PasswordComplexityCheck.isComplexPassword("789zaaaaaaaa"));
  }
  
}
