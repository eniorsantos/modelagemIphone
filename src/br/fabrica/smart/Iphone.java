package br.fabrica.smart;

import br.fabrica.funcoes.*;


public class Iphone implements fone, navegador, playermusica  {
	
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
	
	@Override
	public void exibirPagina() {
		System.out.print("Exibindo a Pagina\n");
	};
	
	@Override
	public void adicionarNovaAba() {
		System.out.print("Abrindo a Nova Aba\n");
	};
	
	@Override
	public void atualizarPagina() {
		System.out.print("Atualizando a Pagina\n");
			};
	
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
