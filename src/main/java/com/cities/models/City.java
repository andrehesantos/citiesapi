package com.cities.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "cidade")
@TypeDefs(value = {@TypeDef(name = "point", typeClass = PoinType.class)})
public class City {

	@Id
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "uf")
	private Integer uf;
	
	@Column(name = "ibge")
	private Integer ibge;
	
	@Type(type = "point")
	@Column(name = "lat_lon", updatable = false, insertable = false)
	private Point localizacao;
	
	public City() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getUf() {
		return uf;
	}

	public void setUf(Integer uf) {
		this.uf = uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}

	public Point getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Point localizacao) {
		this.localizacao = localizacao;
	}


	
	
}
