package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {

    //TODO: add tests here
   // @Test
  /*  public void emptyTest() {
        assertEquals(true, true);
    }*/
    //1
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //2
    @Test
    public void emptyStringReturnTrue()
    {
    assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    //3
    @Test
    public void bracketsWithLetterInsideReturnsTrue()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    //4
    @Test
    public void bracketsWithMultipleSideLettersReturnsTrue()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Co]de"));
    }
    //5
    @Test
    public void bracketsWithOneSideLetterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    //6
    @Test
    public void manyBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][][][][]"));
    }
    //7
    @Test
    public void oneBracketWithLettersReturnsFalse()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    //8
    @Test
    public void notMatchedBracketsWithWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    //9
    @Test
    public void misMatchBracketsReturnsFalse()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //10
    @Test
    public void oneOpenBracketWithoutLettersReturnsFalse()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    //11
    @Test
    public void oneCloseBracketWithoutLettersReturnsFalse()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    //12
    @Test
    public void spaceReturnsFalse()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }
}
