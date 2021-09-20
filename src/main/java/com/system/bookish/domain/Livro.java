package com.system.bookish.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;
import com.system.bookish.domain.enums.Categoria;
@Entity
public class Livro implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private String nome;
	@NotNull
	private String autor;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Trecho>trechos;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Livro(Integer id, String nome, String autor, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.categoria = categoria;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Set<Trecho> getTrechos() {
		return trechos;
	}
	public void addTrechos(Trecho trecho) {
		this.getTrechos().add(trecho);
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((trechos == null) ? 0 : trechos.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (categoria != other.categoria)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (trechos == null) {
			if (other.trechos != null)
				return false;
		} else if (!trechos.equals(other.trechos))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + ", autor=" + autor + ", trechos=" + trechos + ", categoria="
				+ categoria + "]";
	}
	
	
}
