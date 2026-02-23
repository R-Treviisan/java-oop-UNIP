package aula04.Exercicio4_1_completo.entities;

public class Notas {
    private Integer nota1;
    private Integer nota2;
    private Integer nota3;
    private Integer nota4;


    public Notas(){

    }

    public Notas(Integer nota1, Integer nota2, Integer nota3, Integer nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public Integer getNota1() {
        return nota1;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public Integer getNota3() {
        return nota3;
    }

    public void setNota3(Integer nota3) {
        this.nota3 = nota3;
    }

    public Integer getNota4() {
        return nota4;
    }

    public void setNota4(Integer nota4) {
        this.nota4 = nota4;
    }

    public Integer getMedia(){
        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;
    }
}
