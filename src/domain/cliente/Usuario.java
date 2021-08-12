package domain.cliente;

public abstract class Usuario {


  /*Atributos*/
  private String nombre;
  private String dni;
  private String usuario;
  private String contrasenia;

  /*Constructor*/
  public Usuario(String nombre, String dni, String usuario, String contrasenia) {
    this.nombre = nombre;
    this.dni = dni;
    this.usuario = usuario;
    this.contrasenia = contrasenia;
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

  public String getContrasenia() {
    return contrasenia;
  }

  public void setContrasenia(String contrasenia) {
    this.contrasenia = contrasenia;
  }

  /*toString*/
  @Override
  public String toString() {
    return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", usuario=" + usuario + ", contraseña=" + contrasenia + '}';
  }

}
