package br.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dao.PartidaDao;
import br.com.entities.Partida;
import br.com.service.PartidaService;

@Service("PartidaService")
public class PartidaServiceImpl extends GenericServiceImpl<Partida, Integer>
	implements PartidaService {

	@Autowired
	private PartidaDao partidaDAO;
	
	public PartidaServiceImpl(){
		
	}
		
	@Override
	public void saveOrUpdate(Partida entity) {
		Partida partida = new Partida();
		partida.setNome(entity.getNome());
		partida.setJogadores(entity.getJogadores());
		partida.setLista(entity.getLista());
		
		partidaDAO.saveOrUpdate(partida);
	}

	@Override
	public void add(Partida entity) {
		Partida partida = new Partida();
		partida.setNome(entity.getNome());
		partida.setJogadores(entity.getJogadores());
		partida.setLista(entity.getLista());
		
		partidaDAO.add(partida);
	}

	@Override
	public void update(Partida entity) {
		Partida partida = new Partida();
		partida = partidaDAO.find(entity.getId());
		partida.setNome(entity.getNome());
		partida.setJogadores(entity.getJogadores());
		partida.setLista(entity.getLista());
		
		partidaDAO.update(partida);
	}

	@Override
	public void remove(Partida entity) {
		partidaDAO.remove(entity);
	}

	@Override
	public Partida get(Integer id) {
		return partidaDAO.find(id);
	}

	@Override
	public List<Partida> partidas(Integer id) {
		return partidaDAO.getAll();
	}
}
