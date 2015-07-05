package br.com.dao;

import java.util.List;

import br.com.entities.Partida;

public interface PartidaDao extends GenericDao<Partida, Integer> {
	public List<Partida> Ranking(long id);
}
