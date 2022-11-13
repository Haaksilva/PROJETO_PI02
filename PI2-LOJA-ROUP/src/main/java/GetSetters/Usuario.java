
package GetSetters;

/**
 *
 * @author karin
 */
public class Usuario {
    private int id; 
    private String tipo;
    private String nome; 
    private String usuario;
    private String senha;
    
    public Usuario(int id, String nome, String tipo, String usuario, String senha) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.usuario = usuario;
        this.senha = senha;
    }
     public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
