/**
 *@author Marcomendoma
 *Data....: 04/07/2015
 *Programa: pre-jogo dojo
 *Objetivo: Representar o objeto armas que serão utilizadas no jogo
 * 
 */

package br.com.entities;

import static org.junit.Assert.*;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.junit.Test;

@Entity
@Table(name="armas")
public class Armas {
	private long Id;
	private String Nome;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}
	
	public Armas(){
		
	}
	
	public Armas(String nome){
		this.Nome = nome;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
}
