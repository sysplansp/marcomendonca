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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.junit.Test;

@Entity
public class Acao {
	private long Id;
	private Calendar data;
	private String Acao;
	
	@Id
	@GeneratedValue
	public long getId() {
		return Id;
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
		Id = id;
	}

	public String getAcao() {
		return Acao;
	}

	public void setAcao(String acao) {
		Acao = acao;
	}
	
	@Test
	public void DeveIncluirAcao() {
		Acao acao = new Acao();
		acao.data = Calendar.getInstance();
		acao.Acao = "Inciando";
	}
}
