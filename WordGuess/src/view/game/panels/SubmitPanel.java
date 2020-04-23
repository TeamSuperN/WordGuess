package view.game.panels;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import javax.swing.border.BevelBorder;

/*
 * This is where the text input and 
 * button for submittion should go 
 * in the future
 */
@SuppressWarnings("serial")
public class SubmitPanel extends JPanel
{
	private JLabel answerLabel;
	private JButton submitButton;
	private JTextField textField;
	
	/*
	 * This Submit panel will appear 
	 * at the bottom of the MainFrame
	 */
	public SubmitPanel()
	{
		setForeground(Color.BLACK);

		int labelLength = 10;
		
		//initialize components
    setBackground(Color.DARK_GRAY);
		answerLabel = new JLabel("Guess a letter or word:");
		answerLabel.setForeground(Color.WHITE);
		textField = new JTextField(labelLength);
		submitButton = new JButton("Submit Answer");
    submitButton.setBackground(new Color(128, 128, 128));
		
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the SubmitPanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 300; 
		dim.height = 75;
		setPreferredSize(new Dimension(528, 88));
		/////////////////////////
		
//******sets the layout for the panel***************//
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(answerLabel);
		add(textField);
		add(submitButton);
		

		
//******creates a trim around the bottom panel*********************************//
		setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Submit Panel: ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255))));		//combines the two bits of border information
	}
}