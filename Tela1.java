import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela1 extends PrincipalFrame implements ActionListener{

	public void actionPerformed(ActionEvent e){
		
		JFrame tela2 = new Tela2();
		tela2.setVisible(true);	
		dispose();
	}

	public Tela1() {
		super("Tela 1");
		
		init();
	}
	
	private void init() {
		
		//setLayout(null);
				
		ImageIcon imagem = new ImageIcon(getClass().getResource("fundo.png"));
		JLabel fundo = new JLabel(imagem);
		Font fonte = new Font("Comic Sans MS",Font.BOLD,20);
		

		JButton botao = new JButton("Professor");
		botao.setBounds(200, 350, 150, 50);
		botao.setForeground(Color.WHITE);
		botao.setBackground(Color.BLUE);
		botao.setFont(fonte);
		botao.addActionListener(this);
		add(botao);
		
		JButton botao2 = new JButton("Aluno");
		botao2.setBounds(400, 350, 150, 50);
		botao2.setForeground(Color.WHITE);
		botao2.setBackground(Color.GREEN);
		botao2.setFont(fonte);
        add(botao2);
		
		add(fundo);

    }
    
}// fim da classe Tela 1


