package pessoas;

public class Pessoas {
    
    private char genero;
    private double altura;
     
    public Pessoas(char genero, double altura) {
        this.genero = genero;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    @Override
    public String toString(){
        return this.altura + "," + this.genero;
    }

}
