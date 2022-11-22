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
public class vendaModel {
        private int id_venda;
        private int id_usr;
        private int usr_id;
        private int id_cliente;
        private int excluido;
        private Date data_venda;
        private double valor_total;

    public vendaModel(int id_venda, int id_usr, int usr_id, int id_cliente, int excluido, Date data_venda, double valor_total) {
        this.id_venda = id_venda;
        this.id_usr = id_usr;
        this.usr_id = usr_id;
        this.id_cliente = id_cliente;
        this.excluido = excluido;
        this.data_venda = data_venda;
        this.valor_total = valor_total;
    }

    /**
     * @return the id_venda
     */
    public int getId_venda() {
        return id_venda;
    }

    /**
     * @param id_venda the id_venda to set
     */
    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
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
     * @return the usr_id
     */
    public int getUsr_id() {
        return usr_id;
    }

    /**
     * @param usr_id the usr_id to set
     */
    public void setUsr_id(int usr_id) {
        this.usr_id = usr_id;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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
     * @return the data_venda
     */
    public Date getData_venda() {
        return data_venda;
    }

    /**
     * @param data_venda the data_venda to set
     */
    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    /**
     * @return the valor_total
     */
    public double getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    
}
