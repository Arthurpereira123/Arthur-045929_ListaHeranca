package aparelhos.teste;

public class Telefone extends Aparelhos {
    public String Tipo;
    
    public Telefone (String TipoComunicacao, String Marca, String Tipo){
        super (TipoComunicacao, Marca);
        setTipo (Tipo);
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    
}
