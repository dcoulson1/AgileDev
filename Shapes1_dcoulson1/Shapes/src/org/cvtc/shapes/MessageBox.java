/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author dfc09
 *
 */
//Wrapper class for the JOptionPane
// Will not be unit tested
public class MessageBox implements Dialog{

	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, 3);
		
		// For extensibility
		return JOptionPane.OK_OPTION;
	}
	
}
