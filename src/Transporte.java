public abstract class Transporte {
     String name;
     int nr;
     int velocity;

    boolean moving;


    public Transporte(String name, int nr, boolean moving) {
        this.name = name;
        this.nr = nr;
        this.moving = moving;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "name='" + name + '\'' +
                ", nr=" + nr +
                ", moving=" + moving +
                '}';
    }
}
