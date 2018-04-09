import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class videolist1 implements ActionListener {

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		// TODO Auto-generated method stub
		JFrame videolist1 = new JFrame("廖冠霖");
		videolist1.setSize(2880, 1800);
		videolist1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblAngelaSorry = new JLabel("ANGELA SORRY");
		videolist1.getContentPane().add(lblAngelaSorry, BorderLayout.CENTER);
		
		videolist1.setVisible(true);  
	}

}
