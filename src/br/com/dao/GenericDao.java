/**
 *@author Marcomendoma
 *Data....: 04/07/2015
 *Programa: pre-jogo dojo
 *Objetivo: Interface generica que irá representar as ações dos objetos
 *			no jogo
 * 
 */

package br.com.dao;

import java.util.List;

public interface GenericDao<E, K> {
    public void add(E entity) ;
    public void saveOrUpdate(E entity) ;
    public void update(E entity) ;
    public void remove(E entity);
    public E find(K key);
    public List<E> getAll() ;
}
