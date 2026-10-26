package SET.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite ){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadePorCodigo (int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " dentro de  Set de Convidados!");

        conjuntoConvidados.adicionarConvidado("Conviaddo 1", 1234);
        conjuntoConvidados.adicionarConvidado("Conviaddo 2", 1235);
        conjuntoConvidados.adicionarConvidado("Conviaddo 3", 1235);
        conjuntoConvidados.adicionarConvidado("Conviaddo 4", 1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " dentro de  Set de Convidados!");

        conjuntoConvidados.removerConvidadePorCodigo(1234);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " dentro de  Set de Convidados!");


    }
}

