public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Calculadora calculadora1 = new Calculadora();
        Musica musica1 = new Musica();
        Carro carro1 = new Carro();
        Aluno aluno1 = new Aluno();

        pessoa1.mensagem = "Olá, mundo!";
        calculadora1.fazerCalculo(5);

        musica1.titulo = "Na Ilha Grande";
        musica1.artista = "Ninha";
        musica1.anoLancamento = 2006;
        musica1.avaliar(8);
        musica1.avaliar(7);
        musica1.avaliar(10);

        carro1.modeloDOCarro = "HB20S";
        carro1.anoDOCarro = 2019;
        carro1.corDoCarro = "Sand";
        carro1.anoAtual = 2025;

        aluno1.nomeDoAluno = "Fabricio Bastos";
        aluno1.idadeDOAluno = 43;
        aluno1.cursoDoAluno = "Java Orientação a Objetos Alura-ONE";

        System.out.println(pessoa1.exibeMensagem());
        System.out.printf("O dobro de %d é %d.", calculadora1.valor01, calculadora1.total);
        musica1.exibeFichaTecnica();
        System.out.printf("A média da avaliação da música: %.1f", musica1.mediaAvaliacao());
        carro1.exibirFichaTecnica();
        aluno1.exibirFichaAluno();
    }
}