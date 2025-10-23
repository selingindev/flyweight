import java.util.ArrayList;
import java.util.List;

public class TreeFactory {

    private List<TypeArvore> typeTrees = new ArrayList<>();

    public TypeArvore getTreeType(String name, String color, String texture) {
        TypeArvore typeTree = new TypeArvore(name, color, texture);

        if (!typeTrees.contains(typeTree)) {
            typeTrees.add(typeTree);
        }

        return typeTree;
    }

}