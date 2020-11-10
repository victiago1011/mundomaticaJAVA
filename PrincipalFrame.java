import javax.swing.JFrame;


public class PrincipalFrame extends JFrame {
	
	public PrincipalFrame() {
		this("Demo PrincipalFrame");
	}
	
	public PrincipalFrame(String title) {
		super(title);
		
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
}
