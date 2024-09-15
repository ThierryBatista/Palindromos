package view;

import controller.Palicontroller;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String Args[]){
		Palicontroller pali = new Palicontroller();
		
		String palavra = JOptionPane.showInputDialog("Digite a palavra");
		
		String invertido = pali.invertePalavra(palavra);
		pali.comparaPalavras(palavra, invertido);
		
	}

}
