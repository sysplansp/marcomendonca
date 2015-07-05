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
	
	@Override
	public List<Jogador> jogadores(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
