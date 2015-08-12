package br.com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.entities.Armas;

public interface ArmasService extends GenericService<Armas, Integer> {
	@Transactional
	public List<Armas> armas(Integer id);
}
