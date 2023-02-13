public class Fruits {
    private String name;
    private String color;
    private String vitamin;

    public Fruits(String name, String color, String vitamin) {
        this.name = name;
        this.color = color;
        this.vitamin = vitamin;
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

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", vitamin='" + vitamin + '\'' +
                '}';
    }
}
