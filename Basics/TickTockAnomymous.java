import java.awt.event.*;
import javax.swing.*;

public class TickTockAnomymous {
	private String tickMessage = "Tick...";
	private String tockMessage = "Tock...";

	public static void main(String[] args) {
		TickTockAnomymous t = new TickTockAnomymous();
		t.go();
	}
	private void go() {
		
		Timer t = new Timer(1000, new ActionListener() {
			private boolean tick = true;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tick) {
					System.out.println(tickMessage);
				}else {
					System.out.println(tockMessage);
				}
				tick = !tick;
			}
		});
		t.start();
		
		JOptionPane.showMessageDialog(null,"Click OK to exit the programm");
		System.exit(0);

	}

}
