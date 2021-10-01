package meuprojeto;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private long idUniversidade;
    private String nome;
    private List<Curso> Cursos = new ArrayList<Curso>();

    public Universidade() {
    }

    public Universidade(long idUniversidade, String nome, List<Curso> cursos) {
        this.idUniversidade = idUniversidade;
        this.nome = nome;
        Cursos = cursos;
    }

    public Universidade(long idUniversidade, String nome) {
        this.idUniversidade = idUniversidade;
        this.nome = nome;
    }

    public long getIdUniversidade() {
        return idUniversidade;
    }

    public void setIdUniversidade(long idUniversidade) {
        this.idUniversidade = idUniversidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return Cursos;
    }

    public void setCursos(List<Curso> cursos) {
        Cursos = cursos;
    }

    @Override
    public String toString() {
        return "Universidade{" +
                "idUniversidade=" + idUniversidade +
                ", nome='" + nome + '\'' +
                ", Cursos=" + Cursos +
                '}';
    }
}
