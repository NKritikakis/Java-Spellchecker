package com.Java_Spellchecker_Team_Name;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Gui implements ActionListener {
  private static JFrame window;
  private static JPanel panel;
  private static JLabel label;
  private static JButton button1;
  private static JTextField jt;
  private static JButton button2;
  private static JButton button3;
  private String language;
	private static Gui start;	
	
	Gui() {
	  button1 = new JButton("Ελληνικά");
		button1.addActionListener(this);		
		button2 = new JButton("English");
		button2.addActionListener(this);	
		panel.add(button1);
		panel.add(button2);
		}
		
		
	public static void main (String [] args) {
			window = new JFrame();
			panel = new JPanel();
			panel.setLayout(new FlowLayout());
			panel.setBackground(Color.darkGray);
			panel.setBounds(20, 20, 10, 10);
			window.add(panel);
			window.setSize(450,400);
			window.setTitle("OpenMinds Spellchecker");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
			window.setResizable(true);
			label = new JLabel("Please select a language: ");
			label.setForeground(Color.WHITE);
			panel.add(label);
			start = new Gui();
		}
	public void actionPerformed(ActionEvent e) {
	  if (e.getSource() == button2) {
				language = "EN";
				EnglishDictionary dic = new EnglishDictionary();
				Suggester sugg = new Suggester("EN");
				window = new JFrame();
				panel = new JPanel();
				panel.setLayout(new FlowLayout());
				panel.setBackground(Color.WHITE);
				window.add(panel);
				label = new JLabel("Please insert your text :");
				panel.add(label);
				jt = new JTextField(30);
				panel.add(jt);
				button3 = new JButton(" Click ");
				button3.addActionListener(this);
				JLabel label = new JLabel(" Press here to start spellchecking: ");
				panel.add(label);
				panel.add(button3);
				window.setSize(550,400);
			  window.setTitle(" Spellchecker ");
				window.setDefaultCloseOperation
				(JFrame.EXIT_ON_CLOSE);
				window.setVisible(true);
				window.setResizable(false);
		} else {
			if (e.getSource() == button1) {
				language = "GR";
				Dictionary dic = new Dictionary();
				Suggester sugg = new Suggester("GR");
				window = new JFrame();
				panel = new JPanel();
				panel.setLayout(new FlowLayout());
				panel.setBackground(Color.WHITE);
				window.add(panel);
				label = new JLabel(" Παρακαλώ εισάγετε το κείμενο : ");
				panel.add(label);
				jt = new JTextField(25);
				panel.add(jt);
				button3 = new JButton(" Click ");
				button3.addActionListener(this);
				JLabel label = new JLabel(" Πατήστε εδώ για να αρχίσει ο έλεγχος: ");
				panel.add(label);
				panel.add(button3);
				window.setSize(550,400);
				window.setTitle(" Ορθογραφικός Διορθωτής ");
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setVisible(true);
				window.setResizable(false);
			  } else {
				
				String input = jt.getText();
				if (input.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Please insert an input");
				} else {
				
				LinkedList<String> words ;
				words=SplitText.split(input);
				boolean exists ;
				int i=0;
				while (i < words.size()) {
					exists = Check.checkIfContained(words.get(i));
					if(exists) {
						Results.addWord(words.get(i));
						
					} else {
						 
						 Suggester.createSuggestions(words.get(i));
						 
						
					}
					i++;
				}
				ArrayList<String> rightwords = Results.getResults();
				HashMap<String,String> suggestionsWrongWords = Suggester.getSuggestions();
				if (language.equals("GR")) {
						JOptionPane.showMessageDialog(null, rightwords.toArray(),"Οι ακόλουθες λέξεις είναι σωστές",JOptionPane.INFORMATION_MESSAGE);
				
						
						for ( Map.Entry<String, String> entry : suggestionsWrongWords.entrySet()) {
							String key = entry.getKey();
							String tab = entry.getValue();
							JOptionPane.showMessageDialog(null,key+" --> "+tab,"Ακολουθούν οι προτάσεις για τις λανθασμένες λέξεις :",JOptionPane.INFORMATION_MESSAGE);
					
			    
						}
				
				
				
				
					}else {
						JOptionPane.showMessageDialog(null, rightwords.toArray(),"The following words are correct: ",JOptionPane.INFORMATION_MESSAGE);
						for ( Map.Entry<String, String> entry : suggestionsWrongWords.entrySet()) {
							String key = entry.getKey();
							String tab = entry.getValue();
							JOptionPane.showMessageDialog(null,key+" --> "+tab,"Suggestions for the misspelled words: ",JOptionPane.INFORMATION_MESSAGE);
					
			    
						}
					}
						
					}
					
				}
				
				
			
			}
		}
			
		
		
			


		
	}



	

