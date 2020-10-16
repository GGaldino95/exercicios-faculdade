package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// Atributos
	private String nome;
	private String email;
	private Date nascimento;
	
	// Construtor default
	public Cliente() {
	}
	
	// Construtor
	public Cliente(String nome, String email, Date nascimento) {
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Cliente: " + nome + " (" + sdf.format(nascimento) + ") - " + email;
	}
	
	
}
