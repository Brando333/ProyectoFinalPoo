package utileria;

public class UtileriaException extends Exception {

  //Lanza una excepcion con un mensaje del error  
  public UtileriaException(String message) {
    super(message);
  }

  //solo lanza la excepcion
  public UtileriaException() {
  }

}
