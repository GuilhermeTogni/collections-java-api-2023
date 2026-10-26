package SET.Ordenacao;

import java.lang.reflect.GenericArrayType;
import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota){
        alunoSet.add(new Aluno(nome,matricula,nota));
    }

    public void removerAluno(long matricula){
        Aluno removerAluno = null;
        for(Aluno c : alunoSet){
            if(c.getMatricula() == matricula) {
                removerAluno = c;
                break;
            }
        }
        alunoSet.remove(removerAluno);
    }

    public void exibirAlunoPorNome(String nome){

    }

}
