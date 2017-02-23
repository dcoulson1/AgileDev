package org.cvtc.shapes;

/**
 * @author David Coulson
 * January 27, 2017
 *
 */
// Base Shape superclass
public abstract class Shape {

	private Dialog dialog;
	
	protected Dialog getDialog(){
		return dialog;
	}
	
	private void setDialog(Dialog dialog){
		this.dialog = dialog;
	}
	
	
	/*
	 * method for determining surfaceArea of a shape
	 */
	public abstract float getSurfaceArea();
	
	
	/*
	 * method for determining the volume of a shape
	 */
	public abstract float getVolume();
	

	
	// Constructor 
	public Shape(Dialog dialog){
		setDialog(dialog);
	}


}
