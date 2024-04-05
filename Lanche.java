import java.util.Date;

public class Lanche extends Produto {
  private String tipoPao;
  private String tipoRecheio;
  private String tipoMolho;

  public String getTipoPao() {
    return tipoPao;
  }

  public void setTipoPao(String tipoPao) {
    this.tipoPao = tipoPao;
  }

  public String getTipoRecheio() {
    return tipoRecheio;
  }

  public void setTipoRecheio(String tipoRecheio) {
    this.tipoRecheio = tipoRecheio;
  }

  public String getTipoMolho() {
    return tipoMolho;
  }

  public void setTipoMolho(String tipoMolho) {
    this.tipoMolho = tipoMolho;
  }

  public Lanche(double preco, Date dataValidade, double peso, String tipoPao, String recheio, String molho) {
    super(preco, dataValidade, peso, "Lanche");      this.tipoPao = tipoPao;
    this.tipoRecheio = recheio;
    this.tipoMolho = molho;
  }
}