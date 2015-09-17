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
public class Leite extends Bebida {
    
    public Leite() {
        setNome("Leite ");
    }
    
    @Override
    public float custo() {
        return 1.40f;
    }
    
}
