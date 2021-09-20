package com.system.bookish.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;
import com.system.bookish.domain.enums.CategoriaTrecho;
@Entity
public class Trecho implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private String personagem;
	@NotNull
	private String pagina;
	@NotNull
	private String capitulo;
	@NotNull
	private String texto;
	@Enumerated(EnumType.STRING)
	private CategoriaTrecho categoriaTrecho;
	
	
	
	public Trecho() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Trecho(Integer id, String personagem, String pagina, String capitulo, String texto,
			CategoriaTrecho categoriaTrecho) {
		super();
		this.id = id;
		this.personagem = personagem;
		this.pagina = pagina;
		this.capitulo = capitulo;
		this.texto = texto;
		this.categoriaTrecho = categoriaTrecho;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPersonagem() {
		return personagem;
	}
	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}
	public String getPagina() {
		return pagina;
	}
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	public String getCapitulo() {
		return capitulo;
	}
	public void setCapitulo(String capitulo) {
		this.capitulo = capitulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public CategoriaTrecho getCategoriaTrecho() {
		return categoriaTrecho;
	}
	public void setCategoriaTrecho(CategoriaTrecho categoriaTrecho) {
		this.categoriaTrecho = categoriaTrecho;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitulo == null) ? 0 : capitulo.hashCode());
		result = prime * result + ((categoriaTrecho == null) ? 0 : categoriaTrecho.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pagina == null) ? 0 : pagina.hashCode());
		result = prime * result + ((personagem == null) ? 0 : personagem.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
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
		Trecho other = (Trecho) obj;
		if (capitulo == null) {
			if (other.capitulo != null)
				return false;
		} else if (!capitulo.equals(other.capitulo))
			return false;
		if (categoriaTrecho != other.categoriaTrecho)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pagina == null) {
			if (other.pagina != null)
				return false;
		} else if (!pagina.equals(other.pagina))
			return false;
		if (personagem == null) {
			if (other.personagem != null)
				return false;
		} else if (!personagem.equals(other.personagem))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Trecho [id=" + id + ", personagem=" + personagem + ", pagina=" + pagina + ", capitulo=" + capitulo
				+ ", texto=" + texto + ", categoriaTrecho=" + categoriaTrecho + "]";
	}
	
	
	
	
}
