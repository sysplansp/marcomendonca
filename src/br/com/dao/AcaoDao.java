package br.com.dao;

import java.util.List;

import br.com.entities.Acao;

public interface AcaoDao extends GenericDao<Acao, Integer> {
	public List<Acao> acoes(Integer id);
}
