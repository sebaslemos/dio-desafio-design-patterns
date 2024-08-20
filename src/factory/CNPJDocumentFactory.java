package factory;

import model.CNPJ;
import model.Documento;

public class CNPJDocumentFactory implements DocumentoFactory {
  @Override
  public Documento criarDocumento(String numero) {
    return new CNPJ(numero);
  }

}
