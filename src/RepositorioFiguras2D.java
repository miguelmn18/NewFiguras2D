import java.util.List;

public class RepositorioFiguras2D {
    List<Figuras2D> figuras;

    public Figuras2D adicionaFigura (Figuras2D figura){
      figuras.add(figura);
      return figura;
    }
    public Figuras2D removeFigura (int posicao){
        return figuras.remove(posicao);
    }
    public double getArea (int posicao){
        return figuras.get(posicao).calculaArea;

    }

    public double getPerimetro (int posicao){
        return figuras.get(posicao).calculaPerimetro;

    }

    public double getTipo (int posicao){
        return figuras.get(posicao).getTipo();
    }
}
