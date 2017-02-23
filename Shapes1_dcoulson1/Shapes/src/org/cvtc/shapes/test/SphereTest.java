/**
 * 
 */
package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.Sphere;
import org.junit.Test;

/**
 * @author dfc09
 *
 */
public class SphereTest {
	Dialog dialog = new MessageBoxSubstitute();

	/**
	 * Test method for {@link org.cvtc.shapes.Sphere#getSurfaceArea()}.
	 */
	@Test
	public void testGetSurfaceArea() {
		Sphere sphere = new Sphere(dialog, 5);
		
		float expected = (float) Math.PI * 4 * 25;
		
		float actual = sphere.getSurfaceArea();
		
		assertEquals(expected, actual, 0.0001f);
		
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Sphere#getVolume()}.
	 */
	@Test
	public void testGetVolume() {
		Sphere sphere = new Sphere(dialog, 10);
		
		float expected = (float) Math.PI * (float)Math.pow(10, 3) * (4 / 3); 
		
		float actual = sphere.getVolume();
		
		assertEquals(expected, actual, 0.0001f);

	}
	
	@Test
	public void testRadius(){
		Sphere sphere = new Sphere(dialog, 12);
		
		float expected = 12f;
		
		float actual = sphere.getRadius();
		
		assertEquals(expected, actual, 0.0001f);
		
		
	}

}
