import java.util.ArrayList;
import java.util.List;

import semPattener.ArvoreNP;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Arvore> arvores = new ArrayList<>();
        List<ArvoreNP> arvoresNP = new ArrayList<>();
        Floresta floresta = new Floresta();

        arvores.clear();
        arvoresNP.clear();

          // do Pattener
          for (int i = 0; i < 1000000; i++) {
          double x = Math.random();
          double y = Math.random();
          floresta.plantarArvore(x, y, "Carvalho", "Verde", "CarvalhoTexture.jpg");
          floresta.plantarArvore(x, y, "Pinheiro", "Verde Escuro",
          "PinheiroTexture.jpg");
          }
          
          arvores = floresta.arvores;
          
          System.out.println("Árvores plantadas: " + arvores.size());
         
/*
        for (int i = 0; i < 2000000; i++) {
            double x = Math.random();
            double y = Math.random();

            ArvoreNP arvoreCarvalho = new ArvoreNP("Carvalho", "Marrom clara",
                    "textureCarvalho.jpg", x, y);
            System.out.print(arvoreCarvalho);
            arvoresNP
                    .add(arvoreCarvalho);
        }
        System.out.println("Árvores plantadas: " + arvoresNP.size());
     */}
        
}
