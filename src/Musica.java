public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    double numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }
    void avaliar( double nota) {
        avaliacao += nota;
        numAvaliacoes ++;
    }
    double mediaAvaliacao (){
        return avaliacao / numAvaliacoes;
    }
}