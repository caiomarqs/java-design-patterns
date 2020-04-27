package br.com.main;

import br.com.beans.Pedido;
import br.com.command.ConcluirPedidoCommand;
import br.com.command.FilaDeTrabalho;
import br.com.command.PagaPedidoCommand;

public class Teste {
	public static void main(String[] args) {
		Pedido pedio1 = new Pedido("Caio", 300);
		Pedido pedio2 = new Pedido("Maria", 250);
		
		FilaDeTrabalho fila = new FilaDeTrabalho(); //--> na fila eu adiciono os comandos que processam os objetos
		
		fila.adiciona(new PagaPedidoCommand(pedio1));
		fila.adiciona(new PagaPedidoCommand(pedio2));
		fila.adiciona(new ConcluirPedidoCommand(pedio1));
		fila.adiciona(new ConcluirPedidoCommand(pedio2));
		//todos são executados estão porntos para serem executados
		
		//aqui chama a execussão em cadei dos comandos, para cada comando na lista cahama o metodo executa
		fila.processa();
	}
}
