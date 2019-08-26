package aparelhos.teste;

public class Computador extends Aparelhos {
    public String Modelo;
    
    public Computador (String Modelo, String TipoComunicacao, String Marca){
        super (TipoComunicacao, Marca);
        setModelo(Modelo);
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
}
