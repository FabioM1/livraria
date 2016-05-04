package newstime.controle;

import newstime.entidade.Carrinho;
import newstime.entidade.ItemPedido;
import newstime.entidade.Livro;

/**
 *
 * @author Fábio M.
 */
public class GerenciaControle {
    
    
    
    
    /**
     * Apenas seleciona um item
     * @return 
     */
    public boolean selecionaItem(){
        return false;
    }
    
    /**
     * Adiciona o item selecionado ao carrinho
     */
    public void addItem(){
        
    }
    
    
    /**
     * Para modificar o item que já esteje no carrinho
     */
    public void modificaItem(){
        
    }
    
    
    /**
     * Onde será mostrado o carrinho
     * >>>>>>>>>Temporario<<<<<<<<<<<<
     * 
     * @return 
     */
    public Carrinho mostraCarrinho(){
        Carrinho c1 = new Carrinho();//para não dar erro
        return c1;//para não dar erro
    }
    
    
    /**
     * Onde será mostrado os livros
     * >>>>>>>>>Temporario<<<<<<<<<<<<
     * 
     * @return 
     */
    public Livro mostraLivros(){
        Livro l1 = new Livro();//para não dar erro
        return l1;//para não dar erro
    }
    
    /**
     * Onde será mostrado os Itens do pedido atual
     * >>>>>>>>>Temporario<<<<<<<<<<<<
     * 
     * @return 
     */
    public ItemPedido mostraItemPedido(){
        ItemPedido iP1 = new ItemPedido();//para não dar erro
        return iP1;//para não dar erro
    }
    
    
}
