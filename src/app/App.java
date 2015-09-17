/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import bebida.*;
import decorator.*;
import pagamento.Dinheiro;
import pagamento.Pagamento;
import pedido.*;

/**
 *
 * @author UTFPR
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        cafe = new Chantilly(cafe);

        // ja vou criar o pedido e a forma de pagamento
        Pedido p = new Pedido();
        Pagamento pagamento = new Dinheiro();
        
        p.addItem(cafe);

        System.out.println("--> Fechando o pedido:");
        p.fecharPedido();

        p.addItem(cafe);
        
        System.out.println("--> Abrindo o pedido novamente:");
        p.abrirPedido();
        p.addItem(cafe);
        
        p.fecharPedido();
        p.pagar(pagamento);

    }

}
