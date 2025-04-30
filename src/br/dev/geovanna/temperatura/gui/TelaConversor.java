package br.dev.geovanna.temperatura.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {

	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	public void criarTelaConversor() {
		JFrame tela = new JFrame();
		tela.setTitle("Conversor de Temperatura");
		tela.setSize(400, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		//Componentes da tela
		
		textCelsius = new JTextField();
		textCelsius.setBounds(0, 0, 0, 0);
		
		
		buttonKelvin = new JButton();
		buttonFahreinheit = new  JButton();
		
		

	}

}
