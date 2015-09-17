/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import bebida.Bebida;
import java.util.ArrayList;
import pagamento.Dinheiro;
import pagamento.Pagamento;
import state.Aberto;

/**
 *
 * @author UTFPR
 */
public class Pedido {

    ArrayList<Bebida> bebidas;

    private Status estado;
    //private Pagamento pagamento;
    
    public void pagar(Pagamento p){
      estado.pagar(p);
    }

    public Pedido() {
        this.bebidas = new ArrayList();
        this.estado = new Aberto(this);
    }

    public void abrirPedido() {
        estado.abrirPedido();
    }

    public float calcularValorPedido() {
        float total = 0;

        for (Bebida bebida : bebidas) {
            total += bebida.custo();
        }
        return total;
    }

    public void fecharPedido() {  
        
        //vamos delegar para quem tem essa implementação
        estado.fecharPedido();
    }

    public Status getEstado() {
        return estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void addItem(Bebida b) {
        estado.addItem(b);
        System.out.println("Valor do seu pedido: " 
                + calcularValorPedido());
    }
}
