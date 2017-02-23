/**
 * 
 */
package org.cvtc.shapes.test;

import org.cvtc.shapes.Dialog;

/**
 * @author dfc09
 *
 */
public class MessageBoxSubstitute implements Dialog{

	@Override
	public int show(String message, String title) {
		
		return 0;
	}

}
