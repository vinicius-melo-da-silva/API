package etec.sp.gov.br.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "Usuario")

public class Usuario {
    @Id

    @Column (name = "Id_Usuario")
    private Long Id;

    @Column (name = "Nome_Usuario")
    private String Nome;

    @Column (name = "Email_Usuario")
    private String Email;

    @Column (name = "Senha_Usuario")
    private String Senha;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
}
