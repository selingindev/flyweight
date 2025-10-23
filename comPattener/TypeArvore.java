import java.util.Objects;

public class TypeArvore {
    private String name;
    private String color;
    private String texture;

    public TypeArvore(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void desenhar(double x, double y) {
        // poderia desenhar em alguma lugar especifico da tela
        //aq eu so print seu x e y msm

        System.out.println(x);
        System.out.println(y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof TypeArvore))
            return false;
        TypeArvore that = (TypeArvore) o;
        return name.equals(that.name) &&
                color.equals(that.color) &&
                texture.equals(that.texture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, texture);
    }
}
