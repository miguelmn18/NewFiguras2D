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
    public Figuras2D getArea (int posicao){
        figuras.get(posicao);
        return

    }

    public Figuras2D getPerimetro (int posicao){

    }

    public Figuras2D getTipo (){
        figuras
    }
}
