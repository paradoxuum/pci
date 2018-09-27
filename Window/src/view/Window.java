package view;

import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Window extends JFrame {
	
	JTextArea Mensagem = new JTextArea("Digite sua mensagem aqui jovem!", 15, 30);
	
	JScrollPane Rolagem = new JScrollPane(Mensagem);
	
	JLabel Question1 = new JLabel("O que AS VEZES não funciona?");
	
	JCheckBox chkOpcao1 = new JCheckBox("Java");
	JCheckBox chkOpcao2 = new JCheckBox("Android Studio");
	JCheckBox chkOpcao3 = new JCheckBox("C#");
	JCheckBox chkOpcao4 = new JCheckBox("Windows");
	
	public Window() {
		super ("Window");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		Rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		Rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		Rolagem.setBounds(20, 20, 360, 150);
		paine.add(Rolagem);
	
		
		
		//Pergunta 1 - Pergunta + Opções de Check
		Question1.setBounds(20, 190, 200, 20);
		paine.add(Question1);
		
		chkOpcao1.setBounds(20, 210, 100, 20);
		paine.add(chkOpcao1);
		
		chkOpcao2.setBounds(20, 230, 110, 20);
		paine.add(chkOpcao2);
		
		chkOpcao3.setBounds(20, 250, 100, 20);
		paine.add(chkOpcao3);
		
		chkOpcao4.setBounds(20, 270, 100, 20);
		paine.add(chkOpcao4);
		
		this.setSize(400, 500);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		Window Dez = new Window();
		
	}
}