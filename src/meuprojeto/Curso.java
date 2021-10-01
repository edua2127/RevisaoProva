package meuprojeto;

public class Curso {
    private long idCurso;
    private String nome;
    private boolean ativo;

    public Curso() {
    }

    public Curso(long idCurso, String nome, boolean ativo) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.ativo = ativo;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void ativaCurso(){
        this.ativo = true;
    }

    public void desativaCurso(){
        this.ativo = false;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", nome='" + nome + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
