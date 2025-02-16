public class Circulo implements Figuras2D{

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String getTipo() {
        return "Circulo";
    }

    @Override
    public double calculaArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double calculaPerimetro() {
        return 2* Math.PI * raio ;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
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
