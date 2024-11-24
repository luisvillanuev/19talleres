import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto
    public Libro() {
        this.titulo = "Título Desconocido";
        this.autor = "Autor Desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro [Título=" + titulo + ", Autor=" + autor + ", Número de páginas=" + numeroPaginas + "]";
    }
}

class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "000000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorro";
    }

    // Constructor parametrizado con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Número de Cuenta=" + numeroCuenta + ", Saldo=" + saldo + ", Tipo de Cuenta=" + tipoCuenta + "]";
    }
}

class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.curso = "No asignado";
    }

    // Constructor con dos parámetros (nombre y edad)
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No asignado";
    }

    // Constructor con todos los parámetros
    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + nombre + ", Edad=" + edad + ", Curso=" + curso + "]";
    }
}

public class ProyectoIntegrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar detalles del Libro
        System.out.println("Ingrese los detalles del Libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Autor: ");
        String autorLibro = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int paginasLibro = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        Libro libro = new Libro(tituloLibro, autorLibro, paginasLibro);

        // Ingresar detalles de la Cuenta Bancaria
        System.out.println("\nIngrese los detalles de la Cuenta Bancaria:");
        System.out.print("Número de Cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldoCuenta = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Tipo de Cuenta: ");
        String tipoCuenta = scanner.nextLine();
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, saldoCuenta, tipoCuenta);

        // Ingresar detalles del Estudiante
        System.out.println("\nIngrese los detalles del Estudiante:");
        System.out.print("Nombre: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Edad: ");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Curso: ");
        String cursoEstudiante = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);

        // Mostrar detalles de los objetos utilizando toString()
        System.out.println("\nDetalles ingresados:");
        System.out.println(libro);
        System.out.println(cuentaBancaria);
        System.out.println(estudiante);

        scanner.close();
    }
}