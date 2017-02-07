package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author David Coulson
 *
 */

// Represents 3D Cylinder shape
public class Cylinder extends Shape{

	// Holds radius of Cylinder
	private float radius = 0.0f;
	
	// Holds height of Cylinder
	private float height = 0.0f;

	// Gets the radius of the Cylinder
	private float getRadius() {
		return radius;
	}

	// Sets the radius of the Cylinder
	private void setRadius(float radius) {
		this.radius = radius;
	}

	// Gets the height of the Cylinder
	private float getHeight() {
		return height;
	}

	// Sets the height of the Cylinder
	private void setHeight(float height) {
		this.height = height;
	}
	
	public Cylinder(float radius, float height){
		// ensure the dimensions of the Cylinder are not negative
		if(radius > 0 && height > 0){
			setRadius(radius);
			setHeight(height);
		}else{
			// holds the passed in values from the messagebox for radius and height
			String zeroRadius = "";
			String zeroHeight = "";
			
			// holds the string input converted to a float
			float newRadius = 0.0f;
			float newHeight = 0.0f;
			
			do {
				// test both measurements to ensure they are greater than zero
	
					zeroRadius = JOptionPane.showInputDialog("The cylinder's radius must be higher than zero.\n Please enter a new value.");
					
					// Convert the input into a floating number
					newRadius = Float.parseFloat(zeroRadius);
					

					zeroHeight = JOptionPane.showInputDialog("The cylinder's height must be higher than zero.\n Please enter a new value.");
					
					// Convert the input into a floating number
					newHeight = Float.parseFloat(zeroHeight);
				
				
			} while (!(radius > 0 || height > 0));
			
			// Store the measurements in the shape object
			setRadius(newRadius);
			setHeight(newHeight);
		}
	}
	
	@Override 
	public float getSurfaceArea(){
		//Use the dimensions to perform the calculations for surface area of a cylinder
		return (float) ((2 * Math.PI * (getRadius() * getRadius())) + (2 * Math.PI * getRadius() * getHeight()));
	}
	
	@Override
	public float getVolume(){
		// Use the dimensions to perform the calculations for volume of a cylinder
		return (float) Math.PI * getHeight() * (getRadius() * getRadius());
	}
	
	// Display the message box with the measurements of the shape
	@Override
	public void render(){
		//Build a string for the dialog box and display the box		
		JOptionPane.showMessageDialog(null, "The Cylinder has a surface area of: " + getSurfaceArea() + ""
				+ "\n The Cylinder's volume is: " + getVolume());

	}
	
	
}
