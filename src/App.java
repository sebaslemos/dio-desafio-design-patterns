import factory.CNPJDocumentFactory;
import factory.CPFDocumentFactory;
import factory.DocumentoFactory;
import formatters.CNPJFormatter;
import formatters.CPFFormatter;
import formatters.DefaultFormatter;
import formatters.Formatador;
import model.Documento;

public class App {
  public static void main(String[] args) throws Exception {
    // Chain of Responsibility
    Formatador formatador = new CPFFormatter(new CNPJFormatter(new DefaultFormatter()));

    // Usando a fábrica para criar documentos
    DocumentoFactory cpfFactory = new CPFDocumentFactory();
    DocumentoFactory cnpjFactory = new CNPJDocumentFactory();

    Documento cpf = cpfFactory.criarDocumento("12345678901");
    Documento cnpj = cnpjFactory.criarDocumento("12345678901234");

    System.out.println(formatador.formata(cpf));
    System.out.println(formatador.formata(cnpj));

  }
}
