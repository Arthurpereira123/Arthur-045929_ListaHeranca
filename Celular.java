package aparelhos.teste;
   

public class Celular extends Aparelhos  {
   public String Cor;
public Celular(String Cor, String TipoComunicacao, String Marca){
     super(TipoComunicacao, Marca);
     setCor(Cor);
}

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
    public Celular(){
        
    }
}
    

