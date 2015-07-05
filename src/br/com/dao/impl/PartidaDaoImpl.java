package br.com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.dao.PartidaDao;
import br.com.entities.Partida;

@Repository
public class PartidaDaoImpl extends GenericDaoImpl<Partida, Integer> implements PartidaDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Partida> Ranking(long id) {
        Query query = currentSession().createQuery(
                "from Partida " +
                        "where id=:id");
        query.setParameter("id", id);
        
        List<Partida> partidas = query.list();
        
        return partidas;
	}
}
