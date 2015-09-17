/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebida;

/**
 *
 * @author UTFPR
 */
public abstract class Bebida {

    private String nome = "Desconhecido";

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract float custo();
}
