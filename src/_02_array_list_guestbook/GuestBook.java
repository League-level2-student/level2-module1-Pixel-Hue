package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
ArrayList<String> list = new ArrayList<String>();
	public void main() {
	
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Add Name");
		button2.setText("View Names");
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		System.out.println("test");
		if (buttonPressed == button1) {
			String input = JOptionPane.showInputDialog("Please write a name you want to add to the list");
			list.add(input);
		}
		if (buttonPressed == button2) {
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			int c = i+1;
			System.out.println("Guest #" + c + ": " + s);
		}	
		}
	}

	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
