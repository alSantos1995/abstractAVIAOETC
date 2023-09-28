public class Carro extends TransporteTerrestre implements Motorizado {
//    Crie uma classe Carro que herde da classe TransporteTerrestre.
//    Defina para esta classe o atributo
//    cilindrada e o método acelerar.

    private double cilindrada;

    public Carro(String name, int nr, boolean moving) {
        super(name, nr, moving);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name='" + name + '\'' +
                ", nr=" + nr +
                ", moving=" + moving +
                '}';
    }

    @Override
    public boolean estacionar() { return moving = false;

    }

    public boolean acelerar()
    {
        return moving = true;
    }
}
