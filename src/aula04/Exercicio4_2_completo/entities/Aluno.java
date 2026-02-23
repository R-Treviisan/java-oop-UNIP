package aula04.Exercicio4_2_completo.entities;

public class Aluno {
    private String nome;
    private String ra;
    private String curso;
    private String disciplina;
    private String faltas;
    private Integer totalFaltas;


    public Aluno(String nome, String ra, String curso, String disciplina) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
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

    public Integer getTotalFaltas() {
        return totalFaltas;
    }

    public void setTotalFaltas(Integer totalFaltas) {
        this.totalFaltas = totalFaltas;
    }

    public String setFaltas() {
        int totalFaltas = getTotalFaltas();

        if (totalFaltas == 0) {
            return "Aluno com frequência máxima: Nº " + getTotalFaltas() + " de faltas";
        } else if (totalFaltas <= 4) {
            return "Aluno com frequência boa Nº " + getTotalFaltas() + " de faltas";
        } else if (totalFaltas <= 8) {
            return "Aluno com frequência regular Nº " + getTotalFaltas() + " de faltas";
        } else if (totalFaltas <= 12) {
            return "Aluno com frequência média Nº " + getTotalFaltas() + " de faltas";
        } else if (totalFaltas <= 18) {
            return "Aluno com frequência ruim Nº " + getTotalFaltas() + " de faltas";
        } else if (totalFaltas <= 20) {
            return "Aluno com frequência péssima Nº " + getTotalFaltas() + " de faltas";
        } else {
            return "Aluno sem presença!";
        }

    }

    public String toString() {

        return "---- DADOS DO ALUNO ----"
                + " \n"
                + "Aluno: " + nome + " (" + ra + ") \n"
                + "Curso: " + curso + "\n"
                + "Disciplina: " + disciplina + "\n"
                + "Frequencia: " + setFaltas();
    }
}
