public class Usuario {
    private String nombre;
    private String correoElectronico;
    private String contrasena;

    public Usuario(String nombre, String correoElectronico, String contrasena) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Correo Electrónico: " + correoElectronico;
    }
}
