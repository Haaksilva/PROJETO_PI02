
package DTO;

/**
 *
 * @author karin
 */
public class Usuario {
        private int id_usr;
        private int id_cargo;
        private String nome; 
        private String usuario;
        private String senha;

    public Usuario(int id_usr, int id_cargo, String nome, String usuario, String senha) {
        this.id_usr = id_usr;
        this.id_cargo = id_cargo;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
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
     * @return the id_cargo
     */
    public int getId_cargo() {
        return id_cargo;
    }

    /**
     * @param id_cargo the id_cargo to set
     */
    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
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
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
        
    
}
