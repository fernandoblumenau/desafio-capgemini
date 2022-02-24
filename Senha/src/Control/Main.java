package Control;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Senha senha = new Senha();

		String senhaDigitada = JOptionPane.showInputDialog("Digite uma Senha:");
				
		senha.verificaMinuscula(senhaDigitada);
		senha.verificarDigito(senhaDigitada);
		senha.verificarEspecial(senhaDigitada);
		senha.VerificarMaiuscula(senhaDigitada);
		senha.VerificarTamanho(senhaDigitada);
		
		if (senha.verificaMinuscula(senhaDigitada) && senha.verificarDigito(senhaDigitada)
				&& senha.verificarEspecial(senhaDigitada) && senha.VerificarMaiuscula(senhaDigitada)
				&& senha.VerificarTamanho(senhaDigitada))
			System.out.println("Senha Ok");
	}
}
