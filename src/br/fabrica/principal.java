package br.fabrica;

import br.fabrica.smart.Iphone;

public class principal {

	public static void main(String[] args) {
		
		Iphone iphone15 = new Iphone();		
		
		iphone15.adicionarNovaAba();
		iphone15.atender();
		iphone15.tocar();

	}

}
