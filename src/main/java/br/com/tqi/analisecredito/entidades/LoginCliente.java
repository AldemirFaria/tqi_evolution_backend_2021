package br.com.tqi.analisecredito.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tb_logincliente")
public class LoginCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLoginCliente;
    private String emailCliente;
    private String usuarioCliente;
    private String senhaCliente;

    public LoginCliente() {
    }

    public Long getIdLoginCliente() {
        return idLoginCliente;
    }

    public void setIdLoginCliente(Long idLoginCliente) {
        this.idLoginCliente = idLoginCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getUsuarioCliente() {
        return usuarioCliente;
    }

    public void setUsuarioCliente(String usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }
}
