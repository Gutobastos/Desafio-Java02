public class Calculadora {
    int valor01;
    int calcular;
    int total;

    void exibeValor () {
        System.out.println("Valor informado: " + valor01);
    }
    void fazerCalculo (int numero) {
        calcular += numero;
        total = numero * numero;
    }
    int exibirResultado() {
        return total;
    }
}
