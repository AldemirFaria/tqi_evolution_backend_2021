package br.com.tqi.analisecredito.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tb_loginagente")
public class LoginAgente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLoginAgente;
    private String emailAgente;
    private String usuarioAgente;
    private String senhaAgente;

    public LoginAgente() {
    }

    public Long getIdLoginAgente() {
        return idLoginAgente;
    }

    public void setIdLoginAgente(Long idLoginAgente) {
        this.idLoginAgente = idLoginAgente;
    }

    public String getEmailAgente() {
        return emailAgente;
    }

    public void setEmailAgente(String emailAgente) {
        this.emailAgente = emailAgente;
    }

    public String getUsuarioAgente() {
        return usuarioAgente;
    }

    public void setUsuarioAgente(String usuarioAgente) {
        this.usuarioAgente = usuarioAgente;
    }

    public String getSenhaAgente() {
        return senhaAgente;
    }

    public void setSenhaAgente(String senhaAgente) {
        this.senhaAgente = senhaAgente;
    }
}
