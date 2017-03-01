/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author dfc09
 *
 */
public class ShapeFactory {
	
	
	private Dialog dialog;
	
	protected Dialog getDialog(){
		return dialog;
	}
	
	
	
	private void setDialog(Dialog dialog){
		this.dialog = dialog;
	}
	
	// Constructor 
	public ShapeFactory(Dialog dialog){
		setDialog(dialog);
	}
	
	public Cuboid makeCuboid(Dialog dialog, float width, float height, float depth){
		return new Cuboid(dialog,width, height, depth);
	}
	
	
	public Cylinder makeCylinder(Dialog dialog, float radius, float height){
		return new Cylinder(dialog, radius, height);
	}
	
	public Sphere makeSphere(Dialog dialog, float radius){
		return new Sphere(dialog, radius);
	}

}
