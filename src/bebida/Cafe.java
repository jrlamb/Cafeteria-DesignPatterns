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
public class Cafe extends Bebida {    
    
    public Cafe() {
        setNome("Café ");
    }
    
    @Override
    public float custo() {
        return 1.50f;
    }
    
}
