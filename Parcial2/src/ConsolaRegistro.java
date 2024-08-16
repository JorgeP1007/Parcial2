import java.util.Scanner;

public class ConsolaRegistro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaRegistro sistema = new SistemaRegistro();

        while (true) {
            System.out.println("=== Registro de Usuarios ===");
            System.out.print("Ingresa el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa el correo electrónico: ");
            String correo = scanner.nextLine();

            System.out.print("Ingresa la contraseña: ");
            String contrasena = scanner.nextLine();

            // Intentar registrar el usuario
            boolean registrado = sistema.registrarUsuario(nombre, correo, contrasena);

            if (registrado) {
                System.out.println("Usuario registrado correctamente.\n");
            } else {
                System.out.println("Error en el registro. Por favor, intente de nuevo.\n");
            }

            System.out.print("¿Deseas registrar otro usuario? (s/n): ");
            String continuar = scanner.nextLine();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\nUsuarios registrados:");
        for (Usuario usuario : sistema.obtenerUsuariosRegistrados()) {
            System.out.println(usuario);
        }

        scanner.close();
    }
}

