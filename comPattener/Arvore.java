public class Arvore {
      public double x;
      public double y;
      public TypeArvore type;

      public Arvore(double x, double y, TypeArvore type) {
        this.x = x;
        this.y = y;
        this.type = type;
      }

      void desenhar(){
        type.desenhar(x, y);
      }

}
