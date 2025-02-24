package com.generation.CoracaoSolidario.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_doacoes")
public class Doacao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull(message = "Este atributo é obrigatório!")
	private double valor;
	
	@NotNull(message = "Este atributo é obrigatório!")
	private String descricao;
	
	@NotNull(message = "Este atributo é obrigatório!")
	private String destino;
	
	@UpdateTimestamp
	private LocalDateTime dataDoacao;
	
	
	@ManyToOne
	@JsonIgnoreProperties("doacao")
	private Categoria categoria;

	@ManyToOne
	@JsonIgnoreProperties("doacao")
	private Usuario usuario;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public LocalDateTime getDataDoacao() {
		return dataDoacao;
	}


	public void setDataDoacao(LocalDateTime dataDoacao) {
		this.dataDoacao = dataDoacao;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
