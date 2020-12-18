package Questão3;

public class TesteEstoqueMain{
  public static void main(String[] args) {
    Produto produto01 = new Produto(01, "Teclado");
    Produto produto02 = new Produto(02, "Mouse");

    Estoque estoque01 = new Estoque( produto01, 20, 15);
    Estoque estoque02 = new Estoque( produto02, 30, 10);

    // dando baixa no estoque01
    estoque01.darBaixa(10);

    //reposição de unidades no estoque02
    estoque02.reporEstoque(19);

    //relatorio dos estoques
    estoque01.relatorio();
    estoque02.relatorio();

    //mudar o nome do produto01
    produto01.mudarNome("Teclado Virtual");

    // relatorio do estoque responsavel pelo produto02
    estoque02.relatorio();


}
}