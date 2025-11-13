import java.util.ArrayList;
import java.util.List;

public class TreeFactory {

    private List<TypeArvore> typeTrees = new ArrayList<>();

    public TypeArvore getTreeType(String name, String color, String texture) {
        // procura se já existe um tipo igual
        for (TypeArvore type : typeTrees) {
            if (type.equals(new TypeArvore(name, color, texture))) {
                return type; 
            }
        }
        TypeArvore newType = new TypeArvore(name, color, texture);
        typeTrees.add(newType);
        return newType;
    }
}
