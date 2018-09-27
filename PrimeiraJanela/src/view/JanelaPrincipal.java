package view;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;	

public class JanelaPrincipal extends JFrame {
	
	JLabel lblTitulo = new JLabel ("Preencha os campos e click em OK");
	
	JLabel lblNome = new JLabel ("Nome: "); //Nome -- Elemento na janela
	JTextField txtNome = new JTextField();
	
	JLabel lblEnd = new JLabel ("Endereço: "); //Endereço
	JTextField txtEnd = new JTextField();
	
	JLabel lblBairro = new JLabel ("Bairro: "); //Bairro
	JTextField txtBairro = new JTextField();
	
	JLabel lblUF = new JLabel ("Estado: "); //Estado
	JTextField txtUF = new JTextField();
	
	JLabel lblTel = new JLabel ("Telefone: "); //Telefone
	JTextField txtTel = new JTextField();
	
	JLabel lblCel = new JLabel ("Celular: "); //Celular
	JTextField txtCel = new JTextField();

	JLabel lblEmail = new JLabel ("Email: "); //Email
	JTextField txtEmail = new JTextField();
	
	public JanelaPrincipal() {
		super ("Bye Console - Cadastro (MELHOR QUE C#)"); //Nome da janela
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblTitulo.setBounds(100, 20, 400, 25); 
		paine.add(lblTitulo);
		
		lblNome.setBounds(20, 60, 40, 25); //x, y, largura, altura
		paine.add(lblNome);
		txtNome.setBounds(82, 60, 278, 25);
		paine.add(txtNome);
		
		lblEnd.setBounds(20, 90, 80, 25);
		paine.add(lblEnd);
		txtEnd.setBounds(82, 90, 278, 25);
		paine.add(txtEnd);
		
		lblBairro.setBounds(20, 120, 80, 25);
		paine.add(lblBairro);
		txtBairro.setBounds(82, 120, 150, 25);
		paine.add(txtBairro);
		
		lblUF.setBounds(20, 150, 80, 25);
		paine.add(lblUF);
		txtUF.setBounds(82, 150, 150, 25);
		paine.add(txtUF);
		
		lblTel.setBounds(20, 180, 80, 25);
		paine.add(lblTel);
		txtTel.setBounds(82, 180, 110, 25);
		paine.add(txtTel);
		
		lblCel.setBounds(20, 210, 80, 25);
		paine.add(lblCel);
		txtCel.setBounds(82, 210, 110, 25);
		paine.add(txtCel);
		
		lblEmail.setBounds(20, 240, 80, 25);
		paine.add(lblEmail);
		txtEmail.setBounds(82, 240, 278, 25);
		paine.add(txtEmail);


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Faz o fechar funcionar
		this.setSize(400, 380); //Tamanho da janela
		this.setVisible(true); //Visibilidade
	}
	
	public static void main (String[] args) {
		
		JanelaPrincipal byeConsole = new JanelaPrincipal();
	}
}
