
package GetSetters;

/**
 *
 * @author karin
 */
public class Usuario {
    private int id; 
    private String Cargo;
    private String nome; 
    private String usuario;
    private String senha;
    
    public Usuario(int id, String nome, String Cargo, String usuario, String senha) {
        this.id = id;
        this.nome = nome;
        this.Cargo = Cargo;
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

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
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
