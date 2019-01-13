package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable memberVariable;

    @Before
    public void setUp() {
        memberVariable = new MemberVariable();
    }

    @After
    public void tearDown() {
        memberVariable = null;
    }

    @Test
    public void testGetNameSuccess() {
        String input = "Shalini";
        String expectedValue = input;
        String actualValue = memberVariable.getName(input);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetAgeSuccess() {
        int input = 20;
        int expectedValue = input;
        int actualValue = memberVariable.getAge(input);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetSalarySuccess() {
        double input = 2500.07;
        double expectedValue = input;
        double actualValue = memberVariable.getSalary(input);
    }

    @Test
    public void testGetNameFailure() {
        String input = "Deepa";
        String expectedValue = "shalini";
        String actualValue = memberVariable.getName(input);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetAgeFailure() {
        int input = 29;
        int expectedValue = input;
        int actualValue = memberVariable.getAge(input);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetSalaryFailure() {
        double input = 70000;
        double expectedValue = input;
        double actualValue = memberVariable.getSalary(input);
    }

    @Test(expected = NullPointerException.class)
    public void invalidTest() {
        assertNull(null, memberVariable.getName(null));
    }
}