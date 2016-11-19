import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class GUI extends JFrame{
	
	private JLabel label;
	private JButton button;
	private JButton button2;
	private JScrollPane scroll;
	private JTextArea textarea;

	
	public GUI(){
		super("Process List");
		setLayout(new FlowLayout());
		
		
		
		textarea = new JTextArea();
		
		//textarea.setLineWrap(true);
		textarea.setEditable(false);
		textarea.setVisible(true);
		label= new JLabel("PROCESSES");
		add(label);
		scroll = new JScrollPane(textarea);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		super.add(scroll);
				
		button = new JButton("RUN PROCESS");
		add(button);
		
		button2 = new JButton("SMN");
		add(button2);
		
		event e = new event();
		button.addActionListener(e);
		
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//get file, read from file then output file
			
			try{
				BufferedReader fileData = new BufferedReader(new FileReader("Process List.txt"));
				String line = fileData.readLine();
				while(line != null){
					textarea.append(line+ "\n");
					line = fileData.readLine();
				}
				textarea.setSize(200, 600);
			}catch(Exception error){
				
			}
			
		
		}
	}
	
	//THIS IS GOING TO BE USED IN MAIN TO CALL THE TEXTAREA GUI
	//THE GUI NEEDED A SECOND WINDOW INORDER TO MAKE IT MORE PRESENTABLE 
	
	/*GUI g = new GUI();
	g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	g.setSize(400,600);
	g.setVisible(true);
	*/
	
}
