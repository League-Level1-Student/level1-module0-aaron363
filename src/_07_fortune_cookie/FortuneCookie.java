package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {
		
		new FortuneCookie().showButton();
	}
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	    
	    button.addActionListener(this);
	    
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int rand = new Random().nextInt(5);
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "Do a good deed today.");
		}else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "Be careful on Tuesday.");
		}else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "Success is a journey, not a destination.");
		}else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "The harder you work, the luckier you get.");
		}else {
			JOptionPane.showMessageDialog(null, "Pick battles big enough to matter, small enough to win.");
		}
	}

}
