package br.com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.dao.JogadorDao;
import br.com.entities.Jogador;

@Repository
public class JogadorDaoImpl extends GenericDaoImpl<Jogador, Integer> implements JogadorDao  {

	@SuppressWarnings("unchecked")
	@Override
	public List<Jogador> jogadores(Integer id) {
		Query query = currentSession().createQuery(
                "from Jogador " +
                        "where Id_Jogador=:id");
        query.setParameter("Id_Jogador", id);
        
        List<Jogador> jogadores = query.list();
        
        return jogadores;
	}
}
