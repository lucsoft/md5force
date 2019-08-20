package de.lucsoft.md5force;

import org.junit.Test;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    cr4cker crack = new cr4cker();
    
    @Test
    public void checkHash() {
        Assert.assertEquals(crack.getHash("lolcat"),"1aae4f5eb740067d22088604cd0dc189");
    }
    @Test
    public void cr4ckHashSimple() {
        Assert.assertEquals("ab", crack.crackAnHashSlow(crack.getHash("ab")));
    }
    @Test
    public void cr4ckHashSimpleFast() {
        Assert.assertEquals("a", crack.crackAnHashFast(crack.getHash("a")));
    }
    
    @Test
    public void cr4ckHashFast2() {
        Assert.assertEquals("abcd", crack.crackAnHashFast(crack.getHash("abcd")));
    }
    
    
    
}
