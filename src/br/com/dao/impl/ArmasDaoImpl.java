package br.com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.dao.ArmasDao;
import br.com.entities.Armas;

@Repository
public class ArmasDaoImpl extends GenericDaoImpl<Armas, Integer> implements ArmasDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Armas> armas(Integer id) {
		Query query = currentSession().createQuery(
                "from Armas " +
                        "where Id_Jogador:id");
        query.setParameter("Id_Jogador", id);
        
        List<Armas> armas = query.list();
        
        return armas;
	}
}
