import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Gerenciamento extends PrincipalFrame{

    public Gerenciamento() {
		super("Gerenciamento");
	
        ImageIcon imagem = new ImageIcon(getClass().getResource("outro.png"));
        JLabel fundo = new JLabel(imagem);

        Font fonteBtn = new Font("Comic Sans MS",Font.BOLD,16);

		JButton botao;
	
		botao = new JButton("Questões");
		botao.setBounds(10, 220, 160, 40);
		botao.setForeground(Color.WHITE);
		botao.setBackground(new Color(30,144,255));
		botao.setFont(fonteBtn);
        add(botao);
        
        botao = new JButton("Turmas");
		botao.setBounds(10, 280, 160, 40);
		botao.setForeground(Color.WHITE);
		botao.setBackground(new Color(30,144,255));
		botao.setFont(fonteBtn);
		add(botao);
        
        botao = new JButton("Notas");
		botao.setBounds(10, 340, 160, 40);
		botao.setForeground(Color.WHITE);
		botao.setBackground(new Color(30,144,255));
		botao.setFont(fonteBtn);
		add(botao);

        add(fundo);
        
    }// fim do construtor Gerenciamento

}// fim da classse Gerenciamento
