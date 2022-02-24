package Control;

public class Senha {

	public boolean VerificarTamanho(String senha) {

		if (senha.length() < 6) {
			int numCaracter = 6 - senha.length();
			System.out.println("Faltam: "+numCaracter+ " Caracter(es)");
			return false;
		}
		return true;
	}

	public boolean VerificarMaiuscula(String senha) {
		int cont = 0;
		for (int i = 0; i < senha.length(); i++) {
			if (!Character.isUpperCase(senha.charAt(i))) {
				cont++;
				if (cont == senha.length()) {
					System.out.println("Digitar letra Maiuscula");
					return false;
				}
			}
		}

		return true;
	}

	public boolean verificaMinuscula(String senha) {

		int cont = 0;
		for (int i = 0; i < senha.length(); i++) {
			if (!Character.isLowerCase(senha.charAt(i))) {
				cont++;
				if (cont == senha.length()) {
					System.out.println("Digitar Letra Minúscula");
					return false;
				}
			}
		}
		return true;
	}

	public boolean verificarDigito(String senha) {
		int cont = 0;
		for (int i = 0; i < senha.length(); i++) {
			if (!Character.isDigit(senha.charAt(i))) {
				cont++;
				if (cont == senha.length()) {
					System.out.println("Digita um numero");
					return false;
				}
			}
		}
		return true;
	}

	public boolean verificarEspecial(String senha) {
		for (int i = 0; i < senha.length(); i++) {
			if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")
					|| senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")
					|| senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
				System.out.println("Digitar um caractere especial");
				return true;
			}
		}
		return false;
	}

}
