package DTO;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author davi_
 */
public class clienteModel {
        private int id_Cliente; 
        private int id_usr;
        private String CPF;
        private String nome;
        private String telefone;
        private String email;
        private String sexo;
        private String estado_civil;
        private String endereco;
        private String usr_exclusao;
        private Date data_nascimento;
        private Date data_exclusao;

    public clienteModel(int id_Cliente, int id_usr, String CPF, String nome, String telefone, String email, String sexo, String estado_civil, String endereco, String usr_exclusao, Date data_nascimento, Date data_exclusao) {
        this.id_Cliente = id_Cliente;
        this.id_usr = id_usr;
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.endereco = endereco;
        this.usr_exclusao = usr_exclusao;
        this.data_nascimento = data_nascimento;
        this.data_exclusao = data_exclusao;
    }

    /**
     * @return the id_Cliente
     */
    public int getId_Cliente() {
        return id_Cliente;
    }

    /**
     * @param id_Cliente the id_Cliente to set
     */
    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    /**
     * @return the id_usr
     */
    public int getId_usr() {
        return id_usr;
    }

    /**
     * @param id_usr the id_usr to set
     */
    public void setId_usr(int id_usr) {
        this.id_usr = id_usr;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
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
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the estado_civil
     */
    public String getEstado_civil() {
        return estado_civil;
    }

    /**
     * @param estado_civil the estado_civil to set
     */
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
     * @return the data_nascimento
     */
    public Date getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
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
