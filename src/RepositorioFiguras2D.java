import java.util.List;

public class RepositorioFiguras2D {
    List<Figuras2D> figuras;

    public List <Figuras2D> adicionaFigura (Figuras2D figura){
      figuras.add(figura);
      return figuras;
    }
    public Figuras2D removeFigura (int posicao){
        return figuras.remove(posicao);
    }
    public double getArea (int posicao){
        verificaPosicao(posicao);
        return figuras.get(posicao).calculaArea();


    }

    public double getPerimetro (int posicao){
        verificaPosicao(posicao);
        return figuras.get(posicao).calculaPerimetro();

    }

    public String getTipo (int posicao){
        verificaPosicao(posicao);
        return figuras.get(posicao).getTipo();

    }

    public String verificaPosicao (int posicao){
        if(posicao < 0 || posicao > figuras.size()){
            return "Está posição não existe";
        } return " ";
    }

    @Override
    public String toString() {
        return "RepositorioFiguras2D{" +
                "figuras=" + figuras +
                '}';
    }
}
