package br.com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.entities.Partida;

public interface PartidaService extends GenericService<Partida, Integer> {
	
	@Transactional
	public List<Partida> partidas(Integer id);
}
