package com.system.bookish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.system.bookish.domain.Livro;
import com.system.bookish.domain.Trecho;
import com.system.bookish.domain.Usuario;
import com.system.bookish.domain.enums.Categoria;
import com.system.bookish.domain.enums.CategoriaTrecho;

@SpringBootApplication
public class BookishSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookishSystemApplication.class, args);
		
	
	}

}
