package formatters;

import model.Documento;

public abstract class Formatador {

  protected Formatador proximo;

  public Formatador(Formatador proximo) {
    this.proximo = proximo;
  }

  public abstract String formata(Documento documento);

}
