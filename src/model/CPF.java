package model;

public class CPF implements Documento {

  private String number;

  public CPF(String number) {
    this.number = number;
  }

  @Override
  public String getNumber() {
    return number;
  }

}
