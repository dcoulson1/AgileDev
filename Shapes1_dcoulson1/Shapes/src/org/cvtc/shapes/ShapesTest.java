package org.cvtc.shapes;

/**
 * @author David Coulson
 *
 */
public class ShapesTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Dialog dialog = new MessageBox();
		
		// Create a new instance of the Sphere object
		Sphere sphere = new Sphere(dialog, 0);
		
		// Call the render method for the Sphere
		sphere.render();
		
		// Create a new instance of the Cylinder object
		Cylinder cylinder = new Cylinder(dialog, 5, 10);
		
		// Call the render method for the Cylinder
		cylinder.render();
		
		// Create a new instance of the Cuboid object
		Cuboid cuboid = new Cuboid(dialog ,2, 4, 5);
		
		// Call the render method for the Cuboid
		cuboid.render();
		
		// Exit the thread. Could unnecessarily tax the virtual machine otherwise. 
		System.exit(0);
	}



}
