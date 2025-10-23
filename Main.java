import java.util.ArrayList;
import java.util.List;

import semPattener.Arvore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Arvore> arvores = new ArrayList<>();
        arvores.clear();
   

            for (int i = 0; i <= 10000000; i++) {
                double x = Math.random();
                double y = Math.random();

                Arvore arvoreCarvalho = new Arvore("Carvalho", "Marrom clara", "textureCarvalho.jpg", x, y);
                System.out.print(arvoreCarvalho);
                arvores.add(arvoreCarvalho);
        

        }

    }
}
