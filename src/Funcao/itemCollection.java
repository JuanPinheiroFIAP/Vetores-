package Funcao;

public class itemCollection {
    private Funcao.Item[] list;
    private int count;

    public itemCollection(int Tamanho){
        list = new Funcao.Item[Tamanho];
        count = 0;
    }

    public void adicionarItem(Funcao.Item newItem){
        if (count < list.length) {
            list[count++] = newItem;
        } else {
            System.out.println("Vetor está cheio!");
        }
    }
    public void buscarItem(double valor) {
        for (int i = 0; i < list.length; i++) {
            if (valor == list[i].getValor()) {
                System.out.println("O valor procurado esta no index:" + i);
                return;
            }
        }
    }

    public void atualizarItem(int Index, double Item){
        if (Index >= 0 && Index < list.length){
            list[Index].setValor(Item);
        }else{
            throw new IndexOutOfBoundsException("valor invalido!");
        }
    }

    public void removerItem(int Index, Funcao.Item Remover){
        if (Index >= 0 && Index < list.length){
            list[Index] = null;
        }else{
            throw new IndexOutOfBoundsException("valor invalido!");
        }
    }

    public void listarItem(){
        for (int i = 0; i < list.length; i++){
            System.out.println("Índice " + i + ": " + list[i]);
        }
        System.out.println("\n");
    }
}
