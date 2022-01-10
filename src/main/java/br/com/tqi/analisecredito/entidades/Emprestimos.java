package br.com.tqi.analisecredito.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_emprestimos")
public class Emprestimos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprestimo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigoEmprestimo;
    private Double valorEmprestimo;
    private Long numeroParcelas;
    private Date dataCarencia;
    private String statusPedido;
    private Double taxaEmprestimo;

    @ManyToOne
    @JoinColumn(name = "idLoginCliente")
    private LoginCliente loginCliente;
    @ManyToOne
    @JoinColumn(name = "idLoginAgente")
    private LoginAgente loginAgente;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private CadastroClientes cadastroClientes;

    public Emprestimos() {
    }

    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getCodigoEmprestimo() {
        return codigoEmprestimo;
    }

    public void setCodigoEmprestimo(String codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }

    public Double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(Double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public Long getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Long numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Date getDataCarencia() {
        return dataCarencia;
    }

    public void setDataCarencia(Date dataCarencia) {
        this.dataCarencia = dataCarencia;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Double getTaxaEmprestimo() {
        return taxaEmprestimo;
    }

    public void setTaxaEmprestimo(Double taxaEmprestimo) {
        this.taxaEmprestimo = taxaEmprestimo;
    }

    public LoginCliente getLoginCliente() {
        return loginCliente;
    }

    public void setLoginCliente(LoginCliente loginCliente) {
        this.loginCliente = loginCliente;
    }

    public LoginAgente getLoginAgente() {
        return loginAgente;
    }

    public void setLoginAgente(LoginAgente loginAgente) {
        this.loginAgente = loginAgente;
    }

    public CadastroClientes getCadastroClientes() {
        return cadastroClientes;
    }

    public void setCadastroClientes(CadastroClientes cadastroClientes) {
        this.cadastroClientes = cadastroClientes;
    }
}
