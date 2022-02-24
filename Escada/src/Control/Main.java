package Control;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Escada escada = new Escada();
		escada.montarEscada(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Degraus")));
	}
}
