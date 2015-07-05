/**
 *@author Marcomendoma
 *Data....: 04/07/2015
 *Programa: pre-jogo dojo
 *Objetivo: Representar o objeto partida no jogo
 * 
 */

package br.com.entities;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.ValueGenerationType;
import org.junit.Test;

@Entity
public class Partida {
	private long Id;
	private String Nome;
	private List<Acao> lista;

	@Id
	@GeneratedValue
	public long getId() {
		return Id;
	}

	public Partida(){
		
	}
	
	public Partida(long id, String nome, List<Acao> acoes){
		this.Id = id;
		this.Nome = nome;
		this.lista = acoes;
	}
	
	public void setId(long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public List<Acao> getLista() {
		return lista;
	}

	public void setLista(List<Acao> lista) {
		this.lista = lista;
	}

	@Test
	public void IniciarPartida() {
		List<Acao> acoes = new ArrayList<>();
		acoes.add(new Acao(Calendar.getInstance(), "Iniciar Partica"));
		@SuppressWarnings("unused")
		Partida partida = new Partida(1L, "Teste", acoes);
	}
}
