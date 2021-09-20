package com.system.bookish.exceptions;

public class LivroNaoEncontradoException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

public LivroNaoEncontradoException(String msg) {
this.msg=msg;
	 
}

}
