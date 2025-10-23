import java.util.ArrayList;
import java.util.List;

public class Floresta {

    public List<Arvore> arvores = new ArrayList<>();
    private TreeFactory novaArvore = new TreeFactory();

    public Arvore plantarArvore(double x, double y, String nome, String color, String texture) {

        TypeArvore tipo = novaArvore.getTreeType(nome, color, texture);
        Arvore arvore = new Arvore(x, y, tipo);
        System.out.print(arvore);
        arvores.add(arvore);

        return arvore;
    }

    public void desenhar() {
        for (Arvore arvore : arvores) {
            arvore.desenhar();
        }
    }

}
