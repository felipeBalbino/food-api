package br.com.food.di.service;

import org.springframework.stereotype.Component;

import br.com.food.di.modelo.Cliente;
import br.com.food.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	private NotificadorEmail notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
