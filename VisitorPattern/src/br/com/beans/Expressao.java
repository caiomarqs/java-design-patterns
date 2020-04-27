package br.com.beans;

import br.com.visitor.Visitor;

//Aqui é adicionado o metodo aceita que ele vai ser responsavel de passar o vistor para as classes, que vao aceitar ou n o vistor
public interface Expressao {
	int avalia();
	void aceita(Visitor imporessora);
}
