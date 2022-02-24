package control;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Digite a palavra");
		
		Anagrama anagrama = new Anagrama();
		
		System.out.println(anagrama.contarAnagrama(palavra));

	}

}
