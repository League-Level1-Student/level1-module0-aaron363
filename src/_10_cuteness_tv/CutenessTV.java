package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;

import _08_jack_in_the_box.JackInABox;

public class CutenessTV implements ActionListener {

	public static void main(String[] args) {
		new CutenessTV().showButton();
	}
	public void showButton() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JFrame frame2 = new JFrame();
		frame2.setVisible(true);
		JFrame frame3 = new JFrame();
		frame3.setVisible(true);
		
		JButton button1 = new JButton();
	    frame.add(button1);
	    button1.setText("Ducks");
	    frame.pack();
	    button1.addActionListener(this);
	    
	    JButton button2 = new JButton();
	    frame2.add(button2);
	    button2.setText("Frogs");
	    frame2.pack();
	    button2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		showDucks();
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}
	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
