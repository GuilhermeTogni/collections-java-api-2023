package SET.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nomeContato, int numeroContato){
        contatoSet.add(new Contato(nomeContato, numeroContato));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNomeContato().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return  contatosPorNome;
    }

    public Contato atualizarNumeroContato (String nome, int novoNumero){
        Contato contatAtulaizado = null;
        for(Contato c : contatoSet){
            if(c.getNomeContato().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatAtulaizado =c;
                break;
            }
        }
        return contatAtulaizado;
    }
}
