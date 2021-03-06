
package com.frotas.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Veiculo extends AbstractEntity<Long> {

	@Column(nullable = false, length = 15)
	private String ano;

	@Column(nullable = false, length = 15)
	private String placa;

	@Column(nullable = false, length = 20)
	private String renavam;

	@Column(nullable = false, length = 20)
	private String patrimonio;

	@Column(nullable = false, unique = true, length = 120)
	private String chassi;

	@Column(name = "capacidade_tanque", nullable = false, length = 20)
	private Integer capacidadeTanque;

	@ManyToOne
	@JoinColumn(name = "id_fipe_fk")
	private Fipe fipe;

	@ManyToOne
	@JoinColumn(name = "id_categoria_fk")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "id_combustivel_fk")
	private Combustivel tipoCombustivel;
	
	// geters e setters 

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Integer getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(Integer capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}	

	public Combustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(Combustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Fipe getFipe() {
		return fipe;
	}

	public void setFipe(Fipe fipe) {
		this.fipe = fipe;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}