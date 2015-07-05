package br.com.dao;

import java.util.List;

import br.com.entities.Jogador;

public interface JogadorDao extends GenericDao<Jogador, Integer> {
	public List<Jogador> jogadores(Integer id);
}
