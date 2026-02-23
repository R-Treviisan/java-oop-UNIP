package aula04.Exercicio4_1_completo.entities;

public class Aluno {
    private String ra;
    private String nome;
    private String curso;
    private String disciplina;
    private Notas notas;

    public Aluno(String ra, String nome, String curso, String disciplina) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "---- DADOS DO ALUNO ----\n"
                + "Aluno: " + nome + " (" + ra + ") \n"
                + "Curso: " + curso + "\n"
                + "Disciplina: " + disciplina + "\n"
                + "Media: " + notas.getMedia();
    }
}
