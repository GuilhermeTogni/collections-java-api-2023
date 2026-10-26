package LIST.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> LivroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList)
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    LivroPorAutor.add(l);
                }

        }

        return LivroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> LivroPorIntevalo = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    LivroPorIntevalo.add(l);
                }
            }

        }
        return LivroPorIntevalo;
    }
    public Livro pequisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "autor 4", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "autor 5", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pequisarPorTitulo("livro 1"));

    }
}
