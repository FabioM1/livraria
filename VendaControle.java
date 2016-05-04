package newstime.controle;

import newstime.entidade.Cliente;
import newstime.entidade.ItemPedido;
import newstime.entidade.Pedido;
import newstime.entidade.Venda;

/**
 * Controla todo o sistema de venda e pagamento
 * @author Fábio M.
 */
public class VendaControle {
    
    
    
    /**
     * Verifica todos os item do pedido
     * É enviado o itemPedido para a verificação
     * @param itemPedido
     * O objeto itemPedido é enviado 
     * @return 
     * 
     */
    public boolean verificaItensPedido(ItemPedido itemPedido){
        return false;
    }
    
    
    /**
     * Verifica o pedido como um todo e não itens individuais
     * É enviado o objeto pedido
     * @param pedido
     * @return 
     */
    public boolean verificaPedido (Pedido pedido){
        return false;
    }
    
    /**
     * Verifica se o cliente esta logado e quem é o cliente
     * @param cliente
     * @return 
     */
    public boolean verificaCliente (Cliente cliente){
        return false;
    }
    
    /**
     * Verifica se todos os itens da venda foram preenchidos
     * retorna verdadeiro caso SIM
     * @param venda
     * @return 
     */
    public boolean fazVenda(Venda venda){
        return false;
    }
    
    /**
     * É especificado o local de entrega
     * o padrão é o endereço que foi colocado no cadastro do usuario
     */
    public void localEntrega(){
        
    }
    
    
    /**
     * se o pagamento foi ou não realizado
     * @return 
     */
    public boolean realizaPagamento(){
        return false;
    }
}
