public class Quadrado implements Figuras2D{

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getTipo() {
        return "Quadrado";
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }

    public int compareTo(Figuras2D o) {
        if(this.calculaArea() == o.calculaArea())
            return 0;
        if(this.calculaArea() < o.calculaArea())
            return -1;
        return 1;
    }
}
