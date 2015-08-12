package br.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.dao.AcaoDao;
import br.com.entities.Acao;
import br.com.entities.Jogador;
import br.com.service.AcaoService;

public class AcaoServiceImpl extends GenericServiceImpl<Acao, Integer>
	implements AcaoService {

	@Autowired
	private AcaoDao acaoDAO;

	public AcaoServiceImpl(){
		
	}
	
	@Override
	public void saveOrUpdate(Acao entity) {
		Acao acao = new Acao();
		
		acao.setAcao(entity.getAcao());
		acao.setData(entity.getData());
		acao.setId_Arma(entity.getId_Arma());
		acao.setId_Jogador(entity.getId_Jogador());
		acao.setId_Partida(entity.getId_Partida());

		acaoDAO.saveOrUpdate(acao);
	}
	
	@Override
	public void add(Acao entity) {
		Acao acao = new Acao();
		
		acao.setAcao(entity.getAcao());
		acao.setData(entity.getData());
		acao.setId_Arma(entity.getId_Arma());
		acao.setId_Jogador(entity.getId_Jogador());
		acao.setId_Partida(entity.getId_Partida());
		
		acaoDAO.add(acao);
	}

	@Override
	public void update(Acao entity) {
		Acao acao = new Acao();
		
		acao.setAcao(entity.getAcao());
		acao.setData(entity.getData());
		acao.setId_Arma(entity.getId_Arma());
		acao.setId_Jogador(entity.getId_Jogador());
		acao.setId_Partida(entity.getId_Partida());
		
		acaoDAO.update(acao);
	}

	@Override
	public void remove(Acao entity) {
		acaoDAO.remove(entity);
	}

	@Override
	public Acao get(Integer id) {
		return acaoDAO.find(id);
	}
	
	@Override
	public List<Acao> acoes(Integer id) {
		return acaoDAO.getAll();
	}
}
