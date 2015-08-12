/**
 *@author Marcomendoma
 *Data....: 04/07/2015
 *Programa: pre-jogo dojo
 *Objetivo: Representar o objeto jogador no jogo
 * 
 */

package br.com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="jogador")
public class Jogador {
	private long id;
	private String nome;
	private List<Acao> lista;
	private List<Armas> armas;
	private int Vencidas;
	private int qtdMortes;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	
	public Jogador(){
		
	}
	
	public Jogador(String nome, List<Acao> acoes, List<Armas> armas){
		this.nome = nome;
		this.lista = acoes;
		this.armas = armas;
	}
	
	@OneToMany(mappedBy="armas")
	public List<Armas> getArmas() {
		return armas;
	}

	public void setArmas(List<Armas> armas) {
		this.armas = armas;
	}

	@OneToMany(mappedBy="acao")
	public List<Acao> getLista() {
		return lista;
	}

	public void setLista(List<Acao> lista) {
		this.lista = lista;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="nome", unique=true)
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getVencidas() {
		return Vencidas;
	}

	public void setVencidas(int vencidas) {
		Vencidas = vencidas;
	}
	
	public int getQtdMortes() {
		return qtdMortes;
	}

	public void setQtdMortes(int qtd) {
		this.qtdMortes = qtd;
	}
}
