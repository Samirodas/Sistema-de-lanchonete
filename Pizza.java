import java.util.Date;

public class Pizza extends Produto {
  private String tipoPizza;
  private String tipoBorda;
  private String tipoMolho;

  public String getTipoPizza() {
    return tipoPizza;
  }

  public void setTipoPizza(String tipoPizza) {
    this.tipoPizza = tipoPizza;
  }

  public String getTipoBorda() {
    return tipoBorda;
  }

  public void setTipoBorda(String tipoBorda) {
    this.tipoBorda = tipoBorda;
  }

  public String getTipoMolho() {
    return tipoMolho;
  }

  public void setTipoMolho(String tipoMolho) {
    this.tipoMolho = tipoMolho;
  }

  public Pizza(double preco, Date dataValidade, double peso, String recheio, String borda, String molho) {
    super(preco, dataValidade, peso, "Pizza"); 
    this.tipoPizza = recheio;
    this.tipoBorda = borda;
    this.tipoMolho = molho;
  }
}