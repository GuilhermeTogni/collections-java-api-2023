package SET.Pesquisa;

import java.util.Objects;

public class Contato {

    //atributos
    private String nomeContato;
    private int numeroTelefone;

    public Contato(String nomeContato, int numeroTelefone) {
        this.nomeContato = nomeContato;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNomeContato(), contato.getNomeContato());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNomeContato());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nomeContato='" + nomeContato + '\'' +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}
