package br.com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.entities.Jogador;

public interface JogadorService extends GenericService<Jogador, Integer> {
	
	@Transactional
	public List<Jogador> jogadores(Integer id); 
}
