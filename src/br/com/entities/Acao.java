/**
 *@author Marcomendoma
 *Data....: 04/07/2015
 *Programa: pre-jogo dojo
 *Objetivo: Representar o objeto acao na partida do jogo
 * 
 */

package br.com.entities;

import java.util.Calendar;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.junit.Test;

@Entity
@Table(name="acao")
public class Acao {
	private long Id_Acao;
	private long Id_Partida;
	private long Id_Jogador;
	private long Id_Arma;
	private Calendar data;
	private String Acao;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return Id_Acao;
	}
	
	public Acao (){
		
	}

	public Acao(Calendar data, String acao){
		this.data= data;
		this.Acao = acao;
	}
	
	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public void setId(long id) {
		Id_Acao = id;
	}

	public String getAcao() {
		return Acao;
	}

	public void setAcao(String acao) {
		Acao = acao;
	}
	
	public long getId_Partida() {
		return Id_Partida;
	}

	public void setId_Partida(long id_Partida) {
		Id_Partida = id_Partida;
	}

	public long getId_Jogador() {
		return Id_Jogador;
	}

	public void setId_Jogador(long id_Jogador) {
		Id_Jogador = id_Jogador;
	}

	public long getId_Arma() {
		return Id_Arma;
	}

	public void setId_Arma(long id_Arma) {
		Id_Arma = id_Arma;
	}
	
	@Test
	public void DeveIncluirAcao() {
		Acao acao = new Acao();
		acao.data = Calendar.getInstance();
		acao.Acao = "Inciando";
	}
}
