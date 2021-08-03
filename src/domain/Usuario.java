package domain;

public class Usuario {


  /*Atributos*/
  private String nombre;
  private String dni;
  private String usuario;
  private String contraseña;

  /*Constructor*/
  public Usuario(String nombre, String dni, String usuario, String contraseña) {
    this.nombre = nombre;
    this.dni = dni;
    this.usuario = usuario;
    this.contraseña = contraseña;
  }

  /*Setters & Getters*/
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getContraseña() {
    return contraseña;
  }

  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
  }

  /*toString*/
  @Override
  public String toString() {
    return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", usuario=" + usuario + ", contraseña=" + contraseña + '}';
  }

}
