package org.cvtc.shapes;

/**
 * @author David Coulson
 * January 27, 2017
 *
 */
// Base Shape superclass
public abstract class Shape {

	/*
	 * method for determining surfaceArea of a shape
	 */
	public abstract float getSurfaceArea();
	
	
	/*
	 * method for determining the volume of a shape
	 */
	public abstract float getVolume();
	
	/*
	 * method to display the measurements of a shape
	 */
	public abstract void render();


}
