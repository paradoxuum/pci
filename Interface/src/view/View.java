package view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class View extends JFrame {

	JList listEstados;
	JScrollPane scrollpane;
	
	public View() {
		
		super ("Interface");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		String estados[] = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		
		listEstados = new JList(estados);
		scrollpane = new JScrollPane(listEstados);
		
		scrollpane.setBounds(20, 20, 100, 80);
		
		paine.add(scrollpane);
		
		String[] coluna = {"Nome", "Cidade", "Estado"};
		
		String[][] dados = {{"Eduardo Jorge", "Salvador", "Bahia"}, {"Gustavo Neves", "Caetité", "Bahia"}, {"Tarcísio", "Mutuípe", "Bahia"}, {"Rafael", "Campinas", "São Paulo"}};
		
		JTable listEstados = new JTable(dados, coluna);
		
		JScrollPane scrEstado = new JScrollPane(listEstados);
		
		scrEstado.setBounds(20, 150, 400, 200);
		paine.add(scrEstado);
		
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 490);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		View view = new View();
	}

}
