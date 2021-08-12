package exceptions;

public class DNIFormatException extends FormatException {

  //Constructor para lanzar la excepcion con un mensaje
  public DNIFormatException(String message) {
    super(message);
  }

  //Constructor para solo lanzar excepcion 
  public DNIFormatException() {
  }

}
