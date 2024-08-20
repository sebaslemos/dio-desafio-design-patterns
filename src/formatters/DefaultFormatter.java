package formatters;

import model.Documento;

public class DefaultFormatter extends Formatador {

  public DefaultFormatter() {
    super(null);
  }

  @Override
  public String formata(Documento documento) {
    return documento.getNumber();
  }

}
