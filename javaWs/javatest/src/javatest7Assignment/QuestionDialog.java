package javatest7Assignment;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class QuestionDialog extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String answer;
	@Override
	public void actionPerformed(ActionEvent e) {
		answer = e.getActionCommand(); 
		dispose();//return close by closing
		
	}

}
