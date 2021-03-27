package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the Internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image
		String image = "https://lh3.googleusercontent.com/proxy/JJHbUpdCLUG5T1cFzvF1D_GPWlwCNlBARvFUnMcnerYh9EU98u-ZnmKuCo2PSLxXVeFrPez2wx1le3yhvp5o-yCzb2f040Iv2Hn-rp3soOKmTBzDY6Okjp03uTAukt0";
		// 3. use the "createImage()" method below to initialize your Component
		Component component = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(component);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String user1 = JOptionPane.showInputDialog("What percent of a waterelon is water?");
		// 7. print "CORRECT" if the user gave the right answer
		if(user1.equals("92") || user1.equals("92%")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line
		// of code)
		String image2 = "https://i.pinimg.com/736x/05/79/5a/05795a16b647118ffb6629390e995adb.jpg";
		Component component2 = createImage(image2);
		// 11. add the second image to the quiz window
		quizWindow.add(component2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String user2 = JOptionPane.showInputDialog("What percent of an orange is water?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(user2.equals("88") || user2.equals("88%")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
