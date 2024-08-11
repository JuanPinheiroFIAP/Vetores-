import Funcao.*;
public class Main {

    public static void main(String[] args) {
        //Cria uma coleção de itens com capacidade para 3 itens
        itemCollection colecao = new itemCollection(3);

        //Cria alguns itens de exemplo
        colecao.adicionarItem(new Item(1, 3.14159));
        colecao.adicionarItem(new Item(2, 2.71828));
        System.out.println("Criando exemplos");
        colecao.listarItem();

        //Adiciona itens válidos à coleção
        Item item1 = new Item(3,2.1);
        colecao.adicionarItem(item1);
        System.out.println("Adicionando Itens");
        colecao.listarItem();

        //Busca um item existente
        System.out.println("Busca Itens");
        colecao.buscarItem(2.1);

        //Atualiza um item
        colecao.atualizarItem(1, 10.8);
        System.out.println("Atualizando Itens");
        colecao.listarItem();

        //Remove um item (deve ser removido logicamente, deixando null)
        colecao.removerItem(1, null);
        System.out.println("Removendo Itens");
        colecao.listarItem();
    }
}