package Clases;

public class vusuario {
    public String nombre;
    public String apellido; 
    public String nom_usuario;
    public String contrasenia;
    public String tipo;
    public String correo_usuario;
    public vusuario() {
    }

    public vusuario(String nombre, String apellido, String nom_usuario, String contrasenia, String tipo,String correo_usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nom_usuario = nom_usuario;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
        this.correo_usuario=correo_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }
    
}
