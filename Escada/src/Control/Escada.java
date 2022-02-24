package Control;

public class Escada {

	public void montarEscada(int qtddegrais) {

		for (int i = 0; i < qtddegrais; i++) {
			String escada = " ".repeat(qtddegrais - i - 1) + "*".repeat(i + 1);
			System.out.println(escada);
		}
	}
}
