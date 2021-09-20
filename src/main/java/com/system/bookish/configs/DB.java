package com.system.bookish.configs;




import org.springframework.stereotype.Service;

import com.system.bookish.domain.Livro;
import com.system.bookish.domain.Trecho;
import com.system.bookish.domain.Usuario;
import com.system.bookish.domain.enums.Categoria;
import com.system.bookish.domain.enums.CategoriaTrecho;
@Service
public class DB {

	public void instantiateTestDatabase() {
		Usuario user=new Usuario(1,"tami","123","Tamires");
		Livro l=new Livro(1,"Corte de Espinhos e Rosas","Sarah",Categoria.FANTASIA);
		user.addLivros(l);
		l.addTrechos(new Trecho(1,"Feyre","50","5","Olha para as estrelas",CategoriaTrecho.INSPIRACAO));
	//	System.out.println(user);
	}
}
