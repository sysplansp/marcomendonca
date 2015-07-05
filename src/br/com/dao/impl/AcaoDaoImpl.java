package br.com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.dao.AcaoDao;
import br.com.entities.Acao;

@Repository
public class AcaoDaoImpl extends GenericDaoImpl<Acao, Integer> implements AcaoDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Acao> acoes(Integer id) {
		Query query = currentSession().createQuery(
                "from Acao " +
                        "where id=:id");
        query.setParameter("id", id);
        
        List<Acao> acoes = query.list();
        
        return acoes;
	}
}
