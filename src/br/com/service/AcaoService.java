package br.com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.entities.Acao;

public interface AcaoService extends GenericService<Acao, Integer> {

	@Transactional
	public List<Acao> acoes(Integer id);
}
