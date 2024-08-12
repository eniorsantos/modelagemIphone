package br.fabrica.dispositivos;

import br.fabrica.funcoes.*;

public class safari implements navegador{
	
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

}
