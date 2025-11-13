package semPattener;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ArvoreNP {
    private String name;
    private String color;
    private String texture;
    private double x;
    private double y;
    private Image image;

    public ArvoreNP(String name, String color, String texture, double x, double y) {
        this.name = name;
        this.texture = texture;
        this.color = color;
        this.x = x;
        this.y = y;
        this.image = new ImageIcon("images/" + texture).getImage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Image getImage() {

        this.image = new ImageIcon("images/" + texture).getImage();
        return this.image;
    }
}