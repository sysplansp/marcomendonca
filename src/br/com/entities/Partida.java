/**
 *@author Marcomendoma
 *Data....: 04/07/2015
 *Programa: pre-jogo dojo
 *Objetivo: Representar o objeto partida no jogo
 * 
 */

package br.com.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.junit.Test;

@Entity
public class Partida {
	private long Id;
	private String Nome;
	private List<Acao> lista;
	private List<Jogador> jogadores;

	@Id
	@GeneratedValue
	public long getId() {
		return Id;
	}

	public Partida(){
		
	}
	
	public Partida(long id, String nome, List<Acao> acoes, List<Jogador> jogadores){
		this.Id = id;
		this.Nome = nome;
		this.lista = acoes;
		this.jogadores = jogadores;
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
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
	@SuppressWarnings("unused")
	public void IniciarPartida() {
		List<Acao> acoes = new ArrayList<>();
		List<Jogador> jogadores = new ArrayList<>();
		List<Armas> armas = new ArrayList<>();
		
		acoes.add(new Acao(Calendar.getInstance(), "Iniciar Partica"));
		
		//jogadores.add(new Jogador("Marco", acoes.add(new Acao(Calendar.getInstance(), "ativou nova arma")), armas.add(new Armas("Calibre 12 automática"))));
		
		//@SuppressWarnings("unused")
		//Jogador jogador = new Jogador("Marco", acoes, armas.add(new Armas("Calibre 12 automática")));
		
		//jogadores.add(jogador);
		
		//@SuppressWarnings("unused")
		//Partida partida = new Partida(1L, "Teste", acoes, jogadores);
	}
}
