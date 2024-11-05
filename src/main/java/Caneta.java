public class Caneta {
    String modelo;
    String cor;
    float ponta; /* Números com ponto flutuante */
    int carga; /* Números inteiros */
    boolean tampada;

    void rabiscar(){

        if(tampada){
            System.out.println("Erro!! A caneta esta tampada!");
        }else {
            System.out.println("Pode rabiscar");
        }
    }

    void tampar(){
        tampada = true;
        System.out.println("Caneta tampada");
    }

    void destampar(){
        tampada = false;
        System.out.println("Caneta destampada");
    }

    void estado(){
        System.out.println("Esta caneta é do modelo: " + modelo);
        System.out.println("Esta caneta tem a cor: " + cor);
        System.out.println("Esta caneta tem a ponta: " + ponta);
        System.out.println("Esta caneta esta com a carga em: " + carga + "%");
        System.out.println("A caneta esta tampada? " + tampada);
    }
}
