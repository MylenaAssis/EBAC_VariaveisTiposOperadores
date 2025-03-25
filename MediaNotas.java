public class MediaNotas {
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;


    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1= nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;}
}
