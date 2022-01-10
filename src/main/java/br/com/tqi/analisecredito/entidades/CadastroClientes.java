package br.com.tqi.analisecredito.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tb_cadastroclientes")
public class CadastroClientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String nomeCliente;
    private String cpf;
    private String rg;
    private String cidade;
    private String estado;
    private String cep;
    private String rua;
    private Long numeroCasa;
    private Double rendaCliente;

    @OneToOne
    @JoinColumn(name = "idLoginCliente")
    private LoginCliente loginCliente;

    public LoginCliente getLoginCliente() {
        return loginCliente;
    }

    public CadastroClientes() {
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Long getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Long numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public Double getRendaCliente() {
        return rendaCliente;
    }

    public void setRendaCliente(Double rendaCliente) {
        this.rendaCliente = rendaCliente;
    }
}
