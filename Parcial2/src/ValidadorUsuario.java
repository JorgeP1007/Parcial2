import java.util.regex.Pattern;

public class ValidadorUsuario {

    public boolean validarNombre(String nombre) {
        String regex = "^[a-zA-Z\\s]+$"; // Solo letras y espacios
        return Pattern.matches(regex, nombre);
    }

    public boolean validarCorreoElectronico(String correoElectronico) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"; // Formato estándar de email
        return Pattern.matches(regex, correoElectronico);
    }

    public boolean validarContrasena(String contrasena) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$";
        // Mínimo 8 caracteres, al menos 1 letra mayúscula, 1 letra minúscula, 1 número, 1 carácter especial
        return Pattern.matches(regex, contrasena);
    }
}

