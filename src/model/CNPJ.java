package model;

public class CNPJ implements Documento {

  private String number;

  public CNPJ(String number) {
    this.number = number;
  }

  @Override
  public String getNumber() {
    return number;
  }

}
