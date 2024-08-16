import java.util.ArrayList;
import java.util.List;

public class SistemaRegistro {
    private List<Usuario> usuarios;
    private ValidadorUsuario validador;

    public SistemaRegistro() {
        usuarios = new ArrayList<>();
        validador = new ValidadorUsuario();
    }

    public boolean registrarUsuario(String nombre, String correoElectronico, String contrasena) {
        if (!validador.validarNombre(nombre)) {
            System.out.println("Nombre inválido. Solo se permiten letras y espacios.");
            return false;
        }

        if (!validador.validarCorreoElectronico(correoElectronico)) {
            System.out.println("Correo electrónico inválido.");
            return false;
        }

        if (!validador.validarContrasena(contrasena)) {
            System.out.println("Contraseña inválida. Debe tener al menos 8 caracteres, " +
                    "incluyendo una letra mayúscula, una minúscula, un número y un carácter especial.");
            return false;
        }

        Usuario nuevoUsuario = new Usuario(nombre, correoElectronico, contrasena);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario registrado exitosamente: " + nuevoUsuario);
        return true;
    }

    public List<Usuario> obtenerUsuariosRegistrados() {
        return usuarios;
    }
}

