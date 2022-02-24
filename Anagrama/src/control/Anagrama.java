package control;

public class Anagrama {
	
	public int contarAnagrama(String palavra) {
		int anagramas = 0;
		int cont = 0;
		char[] array = palavra.toCharArray();

		for (int i = 0; i < array.length; i++) {
			String pos1 = Character.toString(array[i]);
			char posicao1 = pos1.charAt(0);
			cont = 0;
			for (int j = 0; j < array.length; j++) {
				String pos2 = Character.toString(array[j]);
				char posicao2 = pos2.charAt(0);
				if (posicao1 == posicao2) {
				cont++;
				}

				if(cont >= 2) {
					anagramas++;
					cont = 0;
					if (i + 1 != j) {
						anagramas++;
					}
				}				
			}
		}
		return anagramas/2;
	}
	
	

}
