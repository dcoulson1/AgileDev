package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author David Coulson
 *
 */

// Represent 3D Sphere shape
public class Sphere extends Shape {
	
	// Holds the radius of the Sphere instance
	private float radius = 0.0f;
	
	// Get the radius of the Sphere
	private float getRadius() {
		return radius;
	}

	// Set the radius of the Sphere
	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	public Sphere(float radius){
		// ensure the dimensions of the sphere are not negative
		if(radius > 0){
			setRadius(radius);
		}else{
			/*
			 * Use an input message box to get a new dimension 
			 * for the shape.
			 */
			// holds the new value the user passes in for the dimension
			String zeroRadius = "";
			
			// holds the string input from the messagebox converted to a float
			float newRadius = 0.0f;
			do {
				// Display an input box to get the new measurement
				zeroRadius = JOptionPane.showInputDialog("The sphere's radius must be higher than zero.\n Please enter a new value");
				
				// Convert the input into a floating number
				newRadius = Float.parseFloat(zeroRadius);
			} while (!(newRadius > 0));
				// Store the new measurement in the shape object
			 	setRadius(newRadius); 
			}
	}

	
	@Override
	public float getSurfaceArea() {
		// perform the formula for the surface area of the shape
		return (float) Math.PI * 4 * (getRadius() * getRadius());
	}

	@Override
	public float getVolume() {
		// perform the formula for the volume of the shape
		return (float) Math.PI * (float)Math.pow(getRadius(), 3) * (4 / 3); 
	}

	// Display the message box with the measurements of the shape
	@Override
	public void render() {
		//Build a string for the dialog box and display the box		
		JOptionPane.showMessageDialog(null, "The Sphere has a surface area of: " + getSurfaceArea() + ""
				+ "\n The Sphere's volume is: " + getVolume());
		

	}
	
	
	
	
}
