/**
 *@author Marcomendoma
 *Data....: 04/07/2015
 *Programa: pre-jogo dojo
 *Objetivo: Interface generica que irá representar as ações dos objetos
 *			no jogo
 * 
 */

package br.com.dao;

public interface GenericDao<T> {
	 T create(T t);
	 void delete(Object id);
	 T find(Object id);
	 T update(T t);
}
