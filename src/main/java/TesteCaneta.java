public class TesteCaneta {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();

        caneta1.modelo = "Esferográfico";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;
        caneta1.tampada = true;

        caneta1.estado();

        if (caneta1.tampada) {
            caneta1.destampar();
        }
        caneta1.rabiscar();
        caneta1.tampar();


        System.out.println("-------------------------------------------------------------------------------------------");

        Caneta caneta2 = new Caneta();

        caneta2.modelo = "Hidrográfica";
        caneta2.cor = "Preta";
        caneta2.ponta = 1f;
        caneta2.carga = 20;
        caneta2.tampada = true;

        caneta2.estado();

        if (caneta2.tampada) {
            caneta2.destampar();
        }
        caneta2.rabiscar();
        caneta2.tampar();
    }
}
