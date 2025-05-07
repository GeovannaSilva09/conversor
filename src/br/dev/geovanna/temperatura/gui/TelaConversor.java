package br.dev.geovanna.temperatura.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.geovanna.temperatura.model.Temperatura;

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
		tela.setSize(500, 400);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// Componentes da tela

		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius:");
		textCelsius = new JTextField();
		textCelsius.setBounds(40, 90, 420, 30);

		labelResultado = new JLabel();
		labelResultado.setBounds(40, 190, 420, 40);

		labelMensagemErro = new JLabel();
		labelMensagemErro.setBounds(40, 240, 420, 40);

		// Propriedade que altera cor adicionada
		labelMensagemErro.setForeground(Color.RED);

		// Botões da tela
		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(260, 130, 200, 40);

		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("Fahreinheit");
		buttonFahreinheit.setBounds(40, 130, 200, 40);

		// Painel de conteúdo
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(labelResultado);

		tela.getContentPane().add(labelMensagemErro);

		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);

		// Ouvintes de ação adicionados
		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String ValorCelsius = textCelsius.getText();

				// Método try mostra os resultados
				try {
					Temperatura temperatura = new Temperatura();
					double celsius = Double.parseDouble(ValorCelsius);
					temperatura.setCelsius(celsius);

					double kelvin = temperatura.converterParaKelvin();

					labelResultado.setText(kelvin + " Kelvin");
					labelMensagemErro.setText(null);

				} catch (NumberFormatException ex) {
					labelMensagemErro.setText("O valor inserido é inválido, digite apenas números");
					textCelsius.setText(null);
					textCelsius.requestFocus();

				}

			}
		});

		buttonFahreinheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String ValorCelsius = textCelsius.getText();

				try {
					Temperatura temperatura = new Temperatura();
					double celsius = Double.parseDouble(ValorCelsius);
					temperatura.setCelsius(celsius);

					double fahreinheit = temperatura.converterParaFahreinheit();

					labelResultado.setText(fahreinheit + " Fahreinheit");
					labelMensagemErro.setText(null);

				} catch (NumberFormatException ex) {
					labelMensagemErro.setText("O valor inserido é inválido, digite apenas números");
					textCelsius.setText(null);
					textCelsius.requestFocus();

				}

			}
		});

		// Última linha desse método
		tela.setVisible(true);

	}

}
