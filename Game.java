package jframes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Game {
	
	static int count;
	static int score;
	static int num;
	JLabel numbershow;
	JLabel result;
	JLabel scoreshow;
	JButton odd;
	JButton even;
	
	Game(){
		
		JFrame frame= new JFrame();
		numbershow = new JLabel();
		numbershow.setBounds(100,50,100,40);
		odd = new JButton("Odd");
		odd.setBounds(50,150,100,40);
		even = new JButton("Even");
		even.setBounds(150,150,100,40);
		scoreshow = new JLabel("0");
		scoreshow.setBounds(100,250,100,40);
		result = new JLabel("Result :");
		result.setBounds(50,250,100,40);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(odd);
		frame.add(even);
		frame.add(numbershow);
		frame.add(scoreshow);
		frame.add(result);
		Random  ran = new Random();
		int num = ran.nextInt(100);
		numbershow.setText(""+num);
		scoreshow.setText(""+score);
		
		
		
		even.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String getnum = numbershow.getText();
				int getnum1 = Integer.parseInt(getnum);
				if(count<10) {
				if(getnum1%2==0) {
					score++;
					scoreshow.setText(""+score);
					
				}
				int num = ran.nextInt(100);
				numbershow.setText(""+num);
				count++;
				if(count==10) {
					JOptionPane.showMessageDialog(frame, "your score is "+scoreshow+"/10");
				}
				
			}
			}
		});
		
		odd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String getnum = numbershow.getText();
				int getnum1 = Integer.parseInt(getnum);
				if(count<10) {
				if(getnum1%2==1) {
					score++;
					scoreshow.setText(""+score);
					
				}
				int num = ran.nextInt(100);
				numbershow.setText(""+num);
				count++;
				if(count==10) {
					JOptionPane.showMessageDialog(frame, "your score is "+score+"/10");
				}
			}
			}
			
		});
		
		}

		
	
	public static void main(String[] args) {
		new Game();
	}

}
