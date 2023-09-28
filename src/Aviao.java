public class Aviao extends TransporteAereo implements Motorizado {

//    Crie uma classe Avião que herde da classe TransporteAereo.
//    Defina para esta classe o atributo
//    número de motores

    private int nrMotores;

    @Override
    public String toString() {
        return "Aviao{" +
                "altitude=" + altitude +

                ", name='" + name + '\'' +
                ", nr=" + nr +
                ", moving=" + moving +
                '}';
    }

    public Aviao(String name, int nr, boolean moving, int nrMotores) {
        super(name, nr, moving);
        this.nrMotores = nrMotores;
    }


    @Override
    public double subir(double altitude, double metros) {
        return setAltitude(altitude+metros);
    }

    @Override
    public double descer(double altitude, double metros) {
        if(altitude <= 0){return parado();}
        else
        return setAltitude(altitude-metros);

    }    public double parado() {
        if(altitude <= 0){moving = false; return 0 ;}
        else
            moving = true; return 1;

    }

}
