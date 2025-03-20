public class TesteBicicleta {

    public static void main(String[] args) {

        Bicicleta caloi = new Bicicleta();
        caloi.nome = "Caloi";
        caloi.modelo = "Elite 30";
        caloi.marcha = 6;

        Bicicleta monark = new Bicicleta();
        monark.nome = "Monark";
        monark.modelo = "Barra Circular";
        monark.marcha = 5;

        caloi.imprimir();
        monark.imprimir();

    }

}
