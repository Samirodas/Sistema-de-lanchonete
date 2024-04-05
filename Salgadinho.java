import java.util.Date;

public class Salgadinho extends Produto {
  private String tipoSalgadinho;
  private String tipoMassa;
  private String tipoRecheio;

  public String getTipoSalgadinho() {
    return tipoSalgadinho;
  }

  public void setTipoSalgadinho(String tipoSalgadinho) {
    this.tipoSalgadinho = tipoSalgadinho;
  }

  public String getTipoMassa() {
    return tipoMassa;
  }

  public void setTipoMassa(String tipoMassa) {
    this.tipoMassa = tipoMassa;
  }

  public String getTipoRecheio() {
    return tipoRecheio;
  }

  public void setTipoRecheio(String tipoRecheio) {
    this.tipoRecheio = tipoRecheio;
  }

  public Salgadinho(double preco, Date dataValidade, double peso, String tipo, String massa, String recheio) {
    super(preco, dataValidade, peso, "Salgadinho"); 
    this.tipoSalgadinho = tipo;
    this.tipoMassa = massa;
    this.tipoRecheio = recheio;
  }

}