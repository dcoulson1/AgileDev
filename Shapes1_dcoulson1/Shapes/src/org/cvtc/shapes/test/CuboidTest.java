/**
 * 
 */
package org.cvtc.shapes.test;


import static org.junit.Assert.*;

import java.io.Console;

import org.cvtc.shapes.Cuboid;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.*;
/**
 * @author dfc09
 *
 */
@RunWith(JUnitParamsRunner.class)
public class CuboidTest {

	/**
	 * Test method for {@link org.cvtc.shapes.Cuboid#getSurfaceArea()}.
	 */
	
	
	@Test

	public void testGetSurfaceArea() {
		Cuboid cuboid = new Cuboid(5, 8, 5);
		
		float expected = 210f;
		
		float actual = cuboid.getSurfaceArea();
		
		assertEquals(expected, actual, 0.0001f);
		
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Cuboid#getVolume()}.
	 */
	@Test
	@junitparams.Parameters({"6, 10, 5"})
	public void testGetVolume(float x, float y, float z) {
		//1. arrange
		Cuboid cuboid = new Cuboid(x, y, z);
		float expected = x * y * z;
		//2. act
		float actual = cuboid.getVolume();
		
		//3. assert
		assertEquals(expected, actual, 0.0001f);
	}
	
	@Test
	public void testGetWidth(){
		Cuboid cuboid = new Cuboid(4, 8, 4);
		
		float expected = 4.0f;
		
		float actual = cuboid.getWidth();
		
		assertEquals(expected, actual, 0.0001f);
		
	}
	
	@Test
	public void testGetHeight(){
		Cuboid cuboid = new Cuboid(8, 12, 6);
		
		float expected = 12f;
		
		float actual = cuboid.getHeight();
		
		assertEquals(expected, actual, 0.0001f);
		
	}
	
	@Test
	public void testGetDepth(){
		Cuboid cuboid = new Cuboid(8, 12, 6);
		
		float expected = 6f;
		
		float actual = cuboid.getDepth();
		
		assertEquals(expected, actual, 0.0001f);
		
	}

}
