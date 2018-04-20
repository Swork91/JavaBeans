import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSourceListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TestSourceListener");
		
		//create source object
		JButton jbt = new JButton("OK");
		frame.add(jbt);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//create listener
		MyListener listener = new MyListener();
		
		//add listener
		jbt.addActionListener(listener);
	}
}
class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.print("OK PRESSED\n");
		
	}
	
}

