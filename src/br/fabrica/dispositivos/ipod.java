package br.fabrica.dispositivos;

import br.fabrica.funcoes.*;

public class ipod implements playermusica{
	
	@Override
	public void tocar() {
		System.out.print("Tocando a Musica\n");
		
	};
	
	@Override
	public void pausar() {
		System.out.print("Pausando a Musica\n");
	};
	
	@Override
	public void escolherMusica() {
		System.out.print("Escolhendo a Musica\n");
		
	};

}
