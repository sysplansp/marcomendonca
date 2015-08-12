package br.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dao.JogadorDao;
import br.com.entities.Jogador;
import br.com.service.JogadorService;

@Service("JogadorService")
public class JogadorServiceImpl extends GenericServiceImpl<Jogador, Integer>
	implements JogadorService  {

	@Autowired
	private JogadorDao jogadorDAO;
	
	public JogadorServiceImpl(){
		
	}

	@Override
	public void saveOrUpdate(Jogador entity) {
		Jogador jogador = new Jogador();
		jogador.setNome(entity.getNome());
		jogador.setLista(entity.getLista());
		jogador.setArmas(entity.getArmas());
		jogador.setVencidas(entity.getVencidas());
		jogador.setQtdMortes(entity.getQtdMortes());

		jogadorDAO.saveOrUpdate(jogador);
	}
	
	@Override
	public void add(Jogador entity) {
		Jogador jogador = new Jogador();
		jogador.setNome(entity.getNome());
		jogador.setLista(entity.getLista());
		jogador.setArmas(entity.getArmas());
		jogador.setVencidas(entity.getVencidas());
		jogador.setQtdMortes(entity.getQtdMortes());
		
		jogadorDAO.add(jogador);
	}

	@Override
	public void update(Jogador entity) {
		Jogador jogador = new Jogador();
		jogador.setNome(entity.getNome());
		jogador.setLista(entity.getLista());
		jogador.setArmas(entity.getArmas());
		jogador.setVencidas(entity.getVencidas());
		jogador.setQtdMortes(entity.getQtdMortes());
		
		jogadorDAO.update(jogador);
	}

	@Override
	public void remove(Jogador entity) {
		jogadorDAO.remove(entity);
	}

	@Override
	public Jogador get(Integer id) {
		return jogadorDAO.find(id);
	}

	@Override
	public List<Jogador> jogadores(Integer id) {
		return jogadorDAO.getAll();
	}
}
