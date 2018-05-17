package sample;

public class Wall {
    private int length;
    private int width;
    private int height;
    private Material material;

    public Wall(int length, int width, int height, Material material) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
