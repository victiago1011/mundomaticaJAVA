import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Tela2 extends PrincipalFrame implements ActionListener{
	
	JTextField caixaUsuario = new JTextField();
	JPasswordField caixaSenha = new JPasswordField();
	//String senha = new String(this.caixaSenha.getPassword());

	public void actionPerformed(ActionEvent e){
		
		if(caixaUsuario.getText().equals("adm")){ //&& senha.equals("adm")){
			JFrame tela3 = new Tela3();
			tela3.setVisible(true);	
			dispose();
		}
		else{
			JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválido!");
		}	
	}

    public Tela2() {
		super("Tela 2");
		
		init();
	}
	
	private void init() {
		//setLayout(null);

		ImageIcon imagem = new ImageIcon(getClass().getResource("fundo2.png"));
		JLabel fundo = new JLabel(imagem);
	
		JLabel txtUsuario = new JLabel("Usuário");
		JLabel txtSenha = new JLabel("Senha");	

		Font fonte = new Font("Comic Sans MS",Font.BOLD,30);

		txtUsuario.setBounds(300,90,200,200);
		txtUsuario.setFont(fonte);
		txtUsuario.setForeground(Color.BLUE);
		txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		add(txtUsuario);

		txtSenha.setBounds(300,190,200,200);
		txtSenha.setFont(fonte);
		txtSenha.setForeground(Color.blue);
		txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
		add(txtSenha);

		caixaUsuario.setBounds(300, 220, 200, 40);
		add(caixaUsuario);
		
		caixaSenha.setBounds(300, 320, 200, 40);
		add(caixaSenha);

		JButton botao;
		botao = new JButton("ENTRAR");
		botao.setBounds(250, 400, 300, 80);
		botao.setForeground(Color.WHITE);
		botao.setBackground(Color.GREEN);
		botao.setFont(fonte);
		botao.addActionListener(this);
		add(botao);

		add(fundo);
	}// fim init
	
}// fim da classe tela 2
