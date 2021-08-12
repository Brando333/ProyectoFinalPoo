package exceptions;

public class NombreFormatException extends FormatException {

  //Constructor para lanzar la excepcion con un mensaje
  public NombreFormatException(String message) {
    super(message);
  }

  //Constructor para solo lanzar la excepcion 
  public NombreFormatException() {
  }

}
