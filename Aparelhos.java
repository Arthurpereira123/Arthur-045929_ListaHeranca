package aparelhos.teste;

public class Aparelhos {
    protected String TipoComunicacao;
    protected String Marca;
    
    public Aparelhos(String TipoComunicacao, String Marca){
        this.TipoComunicacao = TipoComunicacao;
        this.Marca = Marca;
    }

    public String getTipoComunicacao() {
        return TipoComunicacao;
    }

    public void setTipoComunicacao(String TipoComunicacao) {
        this.TipoComunicacao = TipoComunicacao;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public Aparelhos(){
        
    }
}
