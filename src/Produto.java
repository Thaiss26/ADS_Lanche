public class Produto {

    private String descricao;
    private Double valor;
    private Integer quantidade;

    Produto(){}

    public Produto (String descricao, Double valor, Integer quantidade){
        super();
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void setDescricao (String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setValor (Double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return valor;
    }

    public void setQuantidade (Integer quantidade){
        this.quantidade = quantidade;
    }

    public Integer getQuantidade(){
        return quantidade;
    }

}