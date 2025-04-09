public class Carro {
    String modeloDOCarro;
    int anoDOCarro;
    String corDoCarro;
    int anoAtual;
    int idade;

    void exibirFichaTecnica () {
        System.out.println("\nModelo do carro: " + modeloDOCarro);
        System.out.println("Ano do carro: " + anoDOCarro);
        System.out.println("A cor do carro: " + corDoCarro);
        idade = anoAtual - anoDOCarro;
        System.out.println("Idade do carro: " + idade);
    }
}
