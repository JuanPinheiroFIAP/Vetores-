package Funcao;

public class Item {
    private int Id;
    private double Valor;

    public Item(int Id, double Valor){
        this.Id = Id;
        this.Valor = Valor;
    }

    public void setId(int novoId){
        if (novoId < 0 || novoId > 150){
            throw new IllegalArgumentException("Valor inválido. Deve ser entre 0 e 150.");
        }else{
            this.Id = novoId;
        }
    }
    public int getId(){
        return Id;
    }

    public void setValor(double novoValor) {
        this.Valor = novoValor;
    }

    public double getValor(){
        return Valor;
    }

    @Override
    public String toString() {
        return "Item{" +
                "Id=" + Id +
                ", Valor=" + Valor +
                '}';
    }
}