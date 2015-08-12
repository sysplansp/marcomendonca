package br.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dao.ArmasDao;
import br.com.entities.Armas;
import br.com.entities.Jogador;
import br.com.service.ArmasService;

@Service("ArmasService")
public class ArmasServiceImpl extends GenericServiceImpl<Armas, Integer> implements ArmasService {

	@Autowired
	private ArmasDao armasDAO;
	
	public ArmasServiceImpl(){
		
	}

	@Override
	public void saveOrUpdate(Armas entity) {
		Armas armas = new Armas();
		armas.setNome(entity.getNome());
		armasDAO.saveOrUpdate(armas);
	}
	
	@Override
	public void add(Armas entity) {
		Jogador jogador = new Jogador();
		jogador.setNome(entity.getNome());
		
		armasDAO.add(entity);
	}

	@Override
	public void update(Armas entity) {
		Armas armas = new Armas();
		armas.setNome(entity.getNome());
		
		armasDAO.update(entity);
	}

	@Override
	public void remove(Armas entity) {
		armasDAO.remove(entity);
	}

	@Override
	public Armas get(Integer id) {
		return armasDAO.find(id);
	}

	@Override
	public List<Armas> armas(Integer id) {
		return armasDAO.getAll();
	}
}
