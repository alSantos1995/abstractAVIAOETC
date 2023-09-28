import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Teste as classes anteriores criando um array do tipo Transporte. Guarde neste array um avião, um
//        balão, um carro e uma bicicleta
//
Balao balao = new Balao("rafa", 2, true, 10);
Carro carro = new Carro("nuno", 3, true);
Bicicleta bike = new Bicicleta("leo", 1, true);
        Aviao aviao = new Aviao("F16-Lander", 20,true,4);
        ArrayList<Transporte> transportes = new ArrayList<>();
        transportes.add(balao);
        transportes.add(carro);
        transportes.add(bike);
        transportes.add(aviao);
        System.out.println(transportes.toString());


        Transporte[] transportess = new Transporte[4];
        transportess[0] = balao;
        transportess[1] =carro;
        transportess[2]= bike;
        transportess[3] = aviao;
        for(Transporte transporte : transportess)
        {
            System.out.println(transporte.toString());
        }
        TransporteAereo[] transportesAereo = new TransporteAereo[2];
        transportesAereo[0] = balao;
        transportesAereo[1] = aviao;
        TransporteTerrestre[] transportesTerrestres = new TransporteTerrestre[2];
        transportesTerrestres[0] = carro;
        transportesTerrestres[1] = bike;
        for(Transporte transporte : transportess)
        {
            System.out.println(transporte.toString());
        }

//        Mande descer os transportes aéreos e estacionar os transportes terrestres.
//• Verifique se todos estão parados.
//• Abasteça só os Motorizados
balao.subir(0,52.2);
        balao.descer(52.2,5);
aviao.subir(0,200);
        aviao.descer(200,200);
        System.out.println("---------------------------------");
        for(TransporteAereo transporteA : transportesAereo)
        {
            System.out.println(transporteA.toString());
        }
        carro.estacionar();
        bike.estacionar();
            System.out.println("---------------------------------");
            for(TransporteTerrestre transporteT : transportesTerrestres)
            {
                    System.out.println(transporteT.toString());
            }



    }

}