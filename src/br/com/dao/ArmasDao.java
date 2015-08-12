package br.com.dao;

import java.util.List;

import br.com.entities.Armas;

public interface ArmasDao extends GenericDao<Armas, Integer> {
	public List<Armas> armas(Integer id);
}
