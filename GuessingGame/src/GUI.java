import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI {
	JFrame frame;
	JButton enter;
	JButton giveUp;
	JTextField enterAnsText;
	JTextField enterAnsField;
	JLabel countAns;
	JLabel hint;
	JPanel ui;
	String ans = null;
	int count = 0;
	Game GG = new Game(1,100);
	public GUI(){
		frame = new JFrame("GUI frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		frame = new JFrame("frame");
		enter = new JButton("Enter");
		ButtonListenertoCheck check = new ButtonListenertoCheck();
		ButtonGiveUp giveup = new ButtonGiveUp();
		giveUp = new JButton("Give UP"); 
		enter.addActionListener(check);
		giveUp.addActionListener(giveup);
		enterAnsText = new JTextField("enter Ans : ");
		enterAnsText.setEditable(false);
		enterAnsField = new JTextField(12);
		countAns = new JLabel("Guesses Count : " + count);
		hint = new JLabel( GG.getHint() );
		ui = new JPanel();
		frame.add(hint,BorderLayout.NORTH);
		ui.add(enterAnsText);
		ui.add(enterAnsField);
		ui.add(enter);
		ui.add(giveUp);
		frame.add(ui,BorderLayout.CENTER);
		frame.add(countAns,BorderLayout.SOUTH);
		frame.pack();
	}
	public void run(){
		frame.setVisible(true);
	}
	public static void main(String[]args) {
		GUI gui = new GUI();
		gui.run();
		System.out.println("RUNNNNNNNNNNN");
	}
	class ButtonListenertoCheck implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			count++;
			if (enterAnsField.getText().equals("")){
				ans = "0";
			}else
				ans = enterAnsField.getText();
			GG.setAns(Integer.parseInt(ans));
			hint.setText(GG.getHint());
			countAns.setText("Guesses Count : " + count);
		}
		
	}
	class ButtonGiveUp implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			hint.setText("Correct is " + GG.getRandomnum());
			countAns.setText("GG");
			GG = new Game(1,100);
			count = 0;
		}
		
	}

}
