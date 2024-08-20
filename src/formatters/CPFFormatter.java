package formatters;

import model.Documento;

public class CPFFormatter extends Formatador {

  public CPFFormatter(Formatador proximo) {
    super(proximo);
  }

  @Override
  public String formata(Documento documento) {
    String numero = documento.getNumber();
    if (numero.length() == 11) {
      return numero.substring(0, 3) + "." + numero.substring(3, 6) + "." + numero.substring(6, 9) + "-"
          + numero.substring(9, 11);
    }
    return proximo.formata(documento);
  }

}
