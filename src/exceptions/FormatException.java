package exceptions;

public class FormatException extends Exception {

  //Constructor para lanzar la excepcion con un mensaje
  public FormatException(String message) {
    super(message);
  }

  //Constructor para solo lanzar la excepcion
  public FormatException() {
  }

}
