package newstime.controle;

import newstime.entidade.BuscaLivro;
import newstime.entidade.Livro;

/**
 *
 * @author Fábio M.
 */
public class BuscaControle {
    
    
    
    /**
     * Vai enviar os parametros para buscar um livro atravez do objeto
     * buscalivro e retornar o livro se caso encontrado
     * @param buscaLivro
     * @return 
     */
    public BuscaLivro buscaLivro(BuscaLivro buscaLivro){
        return buscaLivro;
    }
    
    /**
     * Vai retornar o livro q foi encontrado
     * no buscalivro
     * @return 
     */
    public Livro mostraLivro(){
        Livro l1 = new Livro();//para não dar erro
        return l1;//para não dar erro
    }
}
