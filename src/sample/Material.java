package sample;

public enum Material {
    BRICK("кирпич"),
    WOOD("дерево"),
    CONCRETE("бетон");

    private String name;

    Material(String name) {
        this.name = name;
    }

    public static Material getByName(String name) {
        for (Material material : Material.values()) {
            return material.name.equals(name) ? material : null;
        }
        return null;
    }
}
