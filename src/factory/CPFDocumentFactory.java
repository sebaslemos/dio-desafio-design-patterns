package factory;

import model.CPF;
import model.Documento;

public class CPFDocumentFactory implements DocumentoFactory {
  @Override
  public Documento criarDocumento(String numero) {
    return new CPF(numero);
  }

}
