package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import triangleCal.Func;

public class FuncTest {

	private Func f;
	
	@Before
	public void setUp() throws Exception {
		f = new Func();
	}

	@Test
	public void testFunc() {
		f.setFunc(1, 1, 1);
		assertEquals(1, f.getAns());//正三角形
		
		f.setFunc(-1, -1, -1);
		assertEquals(-1, f.getAns());//不是三角形
		
		f.setFunc(-1, 1, 1);
		assertEquals(-1, f.getAns());//不是三角形
		
		f.setFunc(1, -1, 1);
		assertEquals(-1, f.getAns());//不是三角形
		
		f.setFunc(1, 1, -1);
		assertEquals(-1, f.getAns());//不是三角形
		
		f.setFunc(0, 0, 0);
		assertEquals(-1, f.getAns());//不是三角形
		
		f.setFunc(1, 5, 2);
		assertEquals(-1, f.getAns());//不是三角形
		
		f.setFunc(1, 5, 4);
		assertEquals(-1, f.getAns());//不是三角形
		
		f.setFunc(2, 1, 7);
		assertEquals(-1, f.getAns());//不是三角形
		
		f.setFunc(3, 4, 5);
		assertEquals(0, f.getAns());//非等边三角形
		
		f.setFunc(4, 4, 6);
		assertEquals(2, f.getAns());//等腰三角形
		
		f.setFunc(6.88, 4.54, 6.88);
		assertEquals(2, f.getAns());//等腰三角形
	}

	@Test
	public void testIsEquilateral() {
		f.setFunc(1, 1, 1);
		assertEquals(true, f.isEquilateral());
		
		f.setFunc(1.46, 1.46, 1.46);
		assertEquals(true, f.isEquilateral());
		
		f.setFunc(1.46, 1.46, 1.45);
		assertEquals(false, f.isEquilateral());
	}

	@Test
	public void testIsIsosceles() {
		f.setFunc(1, 1, 1);
		assertEquals(true, f.isIsosceles());
		
		f.setFunc(1.46, 1.46, 1.0);
		assertEquals(true, f.isIsosceles());
		
		f.setFunc(3, 4, 5);
		assertEquals(false, f.isIsosceles());
	}

	@Test
	public void testIsTriangle() {
		f.setFunc(-1, 1, 1);
		assertEquals(false, f.isTriangle());
		
		f.setFunc(1, -1, 1);
		assertEquals(false, f.isTriangle());
		
		f.setFunc(1, 1, -1);
		assertEquals(false, f.isTriangle());
		
		f.setFunc(0, 0, 0);
		assertEquals(false, f.isTriangle());
		
		f.setFunc(-1, -1, -1);
		assertEquals(false, f.isTriangle());
		
		f.setFunc(2, 3, 5);
		assertEquals(false, f.isTriangle());
		
		f.setFunc(7, 3, 2);
		assertEquals(false, f.isTriangle());
		
		f.setFunc(2, 3, 4);
		assertEquals(true, f.isTriangle());
	}

}
