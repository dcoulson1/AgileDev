package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author David Coulson
 *
 */

// Represents 3D Cuboid shape
public class Cuboid extends Shape implements Renderer{

	// The width of the cuboid instance
	private float width = 0.0f;
	
	// The height of the cuboid instance
	private float height = 0.0f;
	
	// The depth of the cuboid instance
	private float depth = 0.0f;

	
	// Get the width of the cuboid
	public float getWidth() {
		return width;
	}

	// Set the width of the cuboid
	private void setWidth(float width) {
		this.width = width;
	}

	// Get the height of the Cuboid
	public float getHeight() {
		return height;
	}
	
	// Set the height of the cuboid
	private void setHeight(float height) {
		this.height = height;
	}
	
	// Get the depth of the cuboid
	public float getDepth() {
		return depth;
	}

	// Set the depth of the cuboid
	private void setDepth(float depth) {
		this.depth = depth;
	}

	// Initialize a new instance of the cuboid
	
	public Cuboid(Dialog dialog, float width, float height, float depth){
		// ensure the dimensions of the cuboid are not negative
		super(dialog);
		
		if(width > 0 && height > 0 && depth > 0){
			setWidth(width);
			setHeight(height);
			setDepth(depth);
		}else{
			
			// holds the passed in values from the messagebox for width and height and depth
			String zeroWidth = "";
			String zeroHeight = "";
			String zeroDepth = "";
			
			// holds the string input from the messagebox converted to a float
			float newWidth = 0.0f;
			float newHeight = 0.0f;
			float newDepth = 0.0f;
			
			do {
				// test measurements to ensure they are greater than zero
					
					// Display the width messagebox
					zeroWidth = JOptionPane.showInputDialog("The cuboid's width must be higher than zero.\n Please enter a new value.");
					
					// Convert the input into a floating number
					newWidth = Float.parseFloat(zeroWidth);
					
					// Display the height messagebox
					zeroHeight = JOptionPane.showInputDialog("The cuboid's height must be higher than zero.\n Please enter a new value.");
					
					// Convert the input into a floating number
					newHeight = Float.parseFloat(zeroHeight);

					// Display the height messagebox
					zeroDepth = JOptionPane.showInputDialog("The cuboid's depth must be higher than zero.\n Please enter a new value.");
					
					// Convert the input into a floating number
					newDepth = Float.parseFloat(zeroDepth);
				
				
			} while (!(width > 0 || height > 0 || depth > 0));
			
			// Store the measurements in the shape object
			setWidth(newWidth);
			setHeight(newHeight);
			setDepth(newDepth);
		}
			
		}
		
	

		
	@Override
	public float getSurfaceArea() {
		// Use the dimensions to execute the calculations for surface area
		return (getWidth() * getHeight() + getWidth() * getDepth() + getHeight() * getDepth()) * 2;
	}

	@Override
	public float getVolume() {
		// Use the dimensions to execute the calculations for volume
		return getWidth() * getHeight() * getDepth();
	}

	@Override
	public void render() {
		// Build string for dialog box
		getDialog().show("The Cuboid has a surface area of: " + getSurfaceArea() + ""
				+ "\n The Cuboid's volume is: " + getVolume(), "Cuboid");
		
	}


    

	
	
	
}
