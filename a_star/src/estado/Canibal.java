/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

/**
 *
 * @author cinquenta
 */
public class Canibal {
     String nome;

    public Canibal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Canibal{" + "nome=" + nome + '}';
    }
    
    
}
