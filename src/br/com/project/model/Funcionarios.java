
package br.com.project.model;

/**
 *
 * @author Flavio Flavio
 */
public class Funcionarios extends Clientes {
    
    private String senha;
    private String cargo;
    private String nivel_acesso;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }

   
    
}
