/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author davi_
 */
public class produtoModel {
        private int id_produto;
        private int id_categoria;
        private int qtde; 
        private int excluido;
        private double valor;
        private String nome;
        private String descricao;
        private String usr_id;
        private String usr_exclusao;
        private Date data_exclusao;

    public produtoModel(int id_produto, int id_categoria, int qtde, int excluido, double valor, String nome, String descricao, String usr_id, String usr_exclusao, Date data_exclusao) {
        this.id_produto = id_produto;
        this.id_categoria = id_categoria;
        this.qtde = qtde;
        this.excluido = excluido;
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
        this.usr_id = usr_id;
        this.usr_exclusao = usr_exclusao;
        this.data_exclusao = data_exclusao;
    }

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the id_categoria
     */
    public int getId_categoria() {
        return id_categoria;
    }

    /**
     * @param id_categoria the id_categoria to set
     */
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    /**
     * @return the qtde
     */
    public int getQtde() {
        return qtde;
    }

    /**
     * @param qtde the qtde to set
     */
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * @return the excluido
     */
    public int getExcluido() {
        return excluido;
    }

    /**
     * @param excluido the excluido to set
     */
    public void setExcluido(int excluido) {
        this.excluido = excluido;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the usr_id
     */
    public String getUsr_id() {
        return usr_id;
    }

    /**
     * @param usr_id the usr_id to set
     */
    public void setUsr_id(String usr_id) {
        this.usr_id = usr_id;
    }

    /**
     * @return the usr_exclusao
     */
    public String getUsr_exclusao() {
        return usr_exclusao;
    }

    /**
     * @param usr_exclusao the usr_exclusao to set
     */
    public void setUsr_exclusao(String usr_exclusao) {
        this.usr_exclusao = usr_exclusao;
    }

    /**
     * @return the data_exclusao
     */
    public Date getData_exclusao() {
        return data_exclusao;
    }

    /**
     * @param data_exclusao the data_exclusao to set
     */
    public void setData_exclusao(Date data_exclusao) {
        this.data_exclusao = data_exclusao;
    }
        
        
        
}
