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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.junit.Test;

@Entity
@Table(name="partida")
public class Partida {
	private Integer Id_Partida;
	private String Nome;
	private List<Acao> lista;
	private List<Jogador> jogadores;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return Id_Partida;
	}

	public Partida(){
		
	}
	
	public Partida(Integer id, String nome, List<Acao> acoes, List<Jogador> jogadores){
		this.Id_Partida = id;
		this.Nome = nome;
		this.lista = acoes;
		this.jogadores = jogadores;
	}
	
	@OneToMany(mappedBy="jogador")
	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public void setId(Integer id) {
		Id_Partida = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	@ManyToMany
	@JoinTable(name = "partida_acao",
	joinColumns = @JoinColumn(name = "Id_Partida"),
	inverseJoinColumns = @JoinColumn(name = "Id_Partida"))
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
