import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Tela4 extends Gerenciamento {
    
    public Tela4(){
        
        init();
    }

    private void init(){

        

        ImageIcon imagem = new ImageIcon(getClass().getResource("outro.png"));
        JLabel fundo = new JLabel(imagem);
        JLabel txtPergunta = new JLabel("Cadastre a pergunta:");
        JTextArea caixaPergunta = new JTextArea();

        txtPergunta.setBounds(300, 100, 400, 400);        
        caixaPergunta.setBounds(350, 200, 300, 120);

        add(txtPergunta);
        add(caixaPergunta);
        add(fundo);
        
    }
}// fim da classe Tela 4
