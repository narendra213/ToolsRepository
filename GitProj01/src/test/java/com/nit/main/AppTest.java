package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

	 @Test
	    public void testSumWithPositives() {
	        int a=10;
	        int b=20;
	        int expected=30;
	        App app=new App();
	        int actual=app.sum(a, b);
	        assertEquals(expected, actual);
	    }
	    @Test
	    public void testSumWithNegitives() {
	        int a=-10;
	        int b=-20;
	        int expected=-30;
	        App app=new App();
	        int actual=app.sum(a, b);
	        assertEquals(expected, actual);
	    }
	    @Test
	    public void testSumWithZeros() {
	        int a=0;
	        int b=0;
	        int expected=0;
	        App app=new App();
	        int actual=app.sum(a, b);
	        assertEquals(expected, actual);
	    }
}
