
public class Main {
    public static void main(String[] args) {
        Figuras2D circulo = new Circulo(6);
        Figuras2D quadrado = new Quadrado(4);
        RepositorioFiguras2D figuras2D = new RepositorioFiguras2D();
        figuras2D.adicionaFigura(circulo);
        figuras2D.adicionaFigura(quadrado);
        System.out.println(figuras2D.getTipo(1));
        System.out.println(figuras2D);

    }
}