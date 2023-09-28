public abstract class TransporteTerrestre extends Transporte {
    public TransporteTerrestre(String name, int nr, boolean moving) {
        super(name, nr, moving);
    }

//    Acrescente a esta classe o método estacionar

    public abstract boolean estacionar();

    @Override
    public String toString() {
        return "TransporteTerrestre{" +
                "name='" + name + '\'' +
                ", nr=" + nr +
                ", velocity=" + velocity +
                ", moving=" + moving +
                '}';
    }
}
