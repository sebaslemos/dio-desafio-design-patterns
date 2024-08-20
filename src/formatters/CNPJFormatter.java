package formatters;

import model.Documento;

public class CNPJFormatter extends Formatador {

  public CNPJFormatter(Formatador proximo) {
    super(proximo);
  }

  @Override
  public String formata(Documento documento) {
    String numero = documento.getNumber();
    if (numero.length() == 14) {
      return numero.substring(0, 2) + "." + numero.substring(2, 5) + "." + numero.substring(5, 8) + "/"
          + numero.substring(8, 12) + "-" + numero.substring(12, 14);
    }
    return proximo.formata(documento);
  }

}
