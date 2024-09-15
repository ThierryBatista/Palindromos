package controller;
import models.PilhaString;

public class Palicontroller 
{

	public Palicontroller() 
	{
		super();
	}

	public String invertePalavra(String palavra) {
	 String invertido ="";
	 int tamanho = palavra.length();
	 PilhaString p = new PilhaString();
	 
	 for(int i = 0; i < tamanho; i ++) {
		 p.pushS(palavra.substring(i, i + 1));
	 }
	 
	 for(int i = 0; i < tamanho; i ++) {
		 try {
			invertido = invertido.concat(p.popS());
		} catch (Exception e) {
			e.printStackTrace();
		}	 	 
	 }
	 System.out.println(invertido);
	 return invertido;
	 
	}
	
	public boolean comparaPalavras(String palavra, String invertido) {
		if (invertido.contains(palavra)) {
			System.out.println("Palíndromo = true");
			return true;
			
		}
		System.out.println("Palíndromo = false");
		return false;
	}
	
}
