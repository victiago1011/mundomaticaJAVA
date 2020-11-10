import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class Tela3 extends Gerenciamento implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
		
			JFrame tela4 = new Tela4();
			tela4.setVisible(true);	
			dispose();
		
	}

    ImageIcon imagem = new ImageIcon(getClass().getResource("outro.png"));
    JLabel fundo = new JLabel(imagem);

    public Tela3(){
        super();

        init();
    }

    private void init(){

        String[] colunas = { "Questão", "Pergunta", "Resposta" };
		String[][] dados = {
				{ "1", "Quanto é 2+2?", "4" },
				{ "2", "Quanto é 3x3?", "9" },
				{ "3", "Quantos lados tem um triângulo?", "Três" },
				{ "4", "Joãozinho tinha 10 balas, comeu 3, com quantas ficou?", "7" }
        };
        JTable table = new JTable(dados, colunas);
        table.setBounds(300, 100, 420, 200);
        add(table);

        JButton botao;
        JButton btnAdd;
        Font fonteBtn = new Font("Comic Sans MS",Font.BOLD,16);
	
		botao = new JButton("Editar");
		botao.setBounds(300, 400, 180, 40);
		botao.setForeground(Color.WHITE);
		botao.setBackground(new Color(0,255,0));
		botao.setFont(fonteBtn);
        add(botao);

        botao = new JButton("Excluir");
		botao.setBounds(500, 400, 180, 40);
		botao.setForeground(Color.WHITE);
		botao.setBackground(new Color(139,0,139));
		botao.setFont(fonteBtn);
        add(botao);

        btnAdd = new JButton("Adicionar");
		btnAdd.setBounds(350, 450, 270, 60);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBackground(new Color(30,144,255));
        btnAdd.setFont(fonteBtn);
        btnAdd.addActionListener(this);
        add(btnAdd);
        
        add(fundo);
    }


}// fim da classe Tela 3
