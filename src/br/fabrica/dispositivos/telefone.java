package br.fabrica.dispositivos;

import br.fabrica.funcoes.*;

public class telefone implements fone{
	
	@Override
	public void atender() {
		System.out.print("Adentendo ligação\n");		
	};
	
	@Override
	public void ligar() {
		System.out.print("Discando o numero\n");
	};
	
	@Override
	public void correioDeVoz() {
		System.out.print("Abrindo Correio de Voz\n");
	};

	

}
