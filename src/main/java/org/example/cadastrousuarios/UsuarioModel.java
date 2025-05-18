package org.example.cadastrousuarios;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
// Ele transforma uma classe em uma entidade no BD


@Entity
@Table(name = "tb_cadastro")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private int telefone;


    public UsuarioModel(int idade, String nome, String email, int telefone) {
        this.idade = idade;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public UsuarioModel() {
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
