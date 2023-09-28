public abstract class TransporteAereo extends Transporte {
//    Defina o atributo altitude actual e acrescente os métodos subir e descer.
//    Estes métodos recebem
//    como parâmetro o número de metros a subir ou a descer.

    public double altitude;
    public double metros;

    public double getAltitude() {
        return altitude;
    }

    public double setAltitude(double altitude) {
        this.altitude = altitude;
        return altitude;
    }

    @Override
    public String toString() {
        return "TransporteAereo{" +
                "altitude=" + altitude +
                ", metros=" + metros +
                ", name='" + name + '\'' +
                ", nr=" + nr +
                ", velocity=" + velocity +
                ", moving=" + moving +
                '}';
    }

    public TransporteAereo(String name, int nr, boolean moving) {
        super(name, nr, moving);
    }


    public abstract double subir(double altitude, double metros);
    public abstract double descer(double altitude,double metros);


}
