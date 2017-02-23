/**
 * 
 */
package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Dialog;
import org.junit.Test;

/**
 * @author dfc09
 *
 */
public class CylinderTest {
	Dialog dialog = new MessageBoxSubstitute();

	/**
	 * Test method for {@link org.cvtc.shapes.Cylinder#getSurfaceArea()}.
	 */
	@Test
	public void testGetSurfaceArea() {
		
		Cylinder cylinder = new Cylinder(dialog, 8, 12);

		float expected = (float)((2 * Math.PI * 64) + (2 * Math.PI * 8 * 12));
		
		float actual = cylinder.getSurfaceArea();
		
		assertEquals(expected, actual, 0.0001f);
		
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Cylinder#getVolume()}.
	 */
	@Test
	public void testGetVolume() {
		
		
		Cylinder cylinder = new Cylinder(dialog, 10, 16);

		float expected = (float) Math.PI * 16 * 100;
		
		float actual = cylinder.getVolume();
		
		assertEquals(expected, actual, 0.0001f);

	}
	
	@Test 
	public void testGetRadius(){
		Cylinder cylinder = new Cylinder(dialog, 4, 8);
		
		float expected = 4f;
		
		float actual = cylinder.getRadius();
		
		assertEquals(expected, actual, 0.0001f);

	}
	
	@Test
	public void testGetHeight(){
		Cylinder cylinder = new Cylinder(dialog, 7, 10);
		
		float expected = 10f;
		
		float actual = cylinder.getHeight();
		
		assertEquals(expected, actual, 0.0001f);
	}

}
