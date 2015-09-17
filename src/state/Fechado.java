/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import bebida.Bebida;
import pagamento.Pagamento;
import pedido.*;

/**
 *
 * @author UTFPR
 */
public class Fechado extends Status {

    Pedido p;
    Pagamento pgto;

    public Fechado(Pedido p) {
        this.p = p;
    }
    
    public void pagar(Pagamento p){
       pgto = p;  
       pgto.pagar();
    }

    @Override
    public void addItem(Bebida b) {
        System.out.println("Seu pedido está fechado. Não "
                + "é possível adicionar mais nada");
    }

    @Override
    public void fecharPedido() {
               
        System.out.println("Este pedido já foi fechado, "
                + "você não pode fecha-lo novamente");
    }

    @Override
    public void abrirPedido() {
        System.out.println("Ok, vamos reabrir o seu pedido ... ");
        p.setEstado(new Aberto(p));
    }

}
