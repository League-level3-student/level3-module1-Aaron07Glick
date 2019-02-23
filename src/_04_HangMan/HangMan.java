package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HangMan implements KeyListener {
	public static void main(String[] args) {
		System.out.println("test");
	}

	Stack<String> words = new Stack<>();
	int lives = 10;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	JTextField text = new JTextField();

	public HangMan() {
		frame.setVisible(true);
		frame.pack();
		frame.add(panel);
		panel.add(label);

	}

	public int howManyWords() {
		String user = JOptionPane.showInputDialog("How many words would you like to guess?");
		int usernum = new Integer(user);
		return usernum;
	}

	public void pushToStack(int num) {
		for (int i = 0; i < num; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			words.push(word);

		}
	}

	public void playgame() {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
