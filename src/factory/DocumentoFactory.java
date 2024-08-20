package factory;

import model.Documento;

public interface DocumentoFactory {

  Documento criarDocumento(String numero);

}