package OperaçõesBasicas;

public class Item {
    //atributo
    private String nome;
    private Double preco;
    private int quantidade;

    public Item(String nome , double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }


    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
