package org.cvtc.shapes;

import org.cvtc.shapes.test.MessageBoxSubstitute;

/**
 * @author David Coulson
 *
 */
public class ShapesTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Dialog dialog = new MessageBoxSubstitute();
		
		ShapeFactory shapeFactory = new ShapeFactory(dialog);
		
		// Create a new instance of the Sphere object
		Sphere sphere = shapeFactory.makeSphere(dialog, 0);
		
		// Call the render method for the Sphere
		sphere.render();
		
		// Create a new instance of the Cylinder object
		Cylinder cylinder = shapeFactory.makeCylinder(dialog, 5, 10);
		
		// Call the render method for the Cylinder
		cylinder.render();
		
		// Create a new instance of the Cuboid object
		Cuboid cuboid = shapeFactory.makeCuboid(dialog, 5, 8, 4);
		
		// Call the render method for the Cuboid
		cuboid.render();
		
		// Exit the thread. Could unnecessarily tax the virtual machine otherwise. 
		System.exit(0);
	}



}
