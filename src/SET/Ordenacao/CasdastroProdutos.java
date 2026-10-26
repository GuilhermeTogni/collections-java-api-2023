package SET.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CasdastroProdutos {
    //atributos
    private Set<Produto> produtoSet;

    public CasdastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo,nome,preco,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> exibirProdutosPorNome = new TreeSet<>(produtoSet);
        return exibirProdutosPorNome;
    }

    public Set<Produto> exibirProdutosPreco(){
        Set<Produto> exibirProdutosPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return exibirProdutosPreco;
    }

}
