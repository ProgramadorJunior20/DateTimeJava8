package co.jmurillo.java8datetime.ejemplos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar al usuario la fecha de nacimiento
        System.out.println("Por favor, ingresa tu fecha de nacimiento en el formato dd-MM-yyyy:");
        String fechaDeNacimientoStr = scanner.nextLine();

        // 2. Crear un formateador para convertir el String en LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {

            // 3. Convertir la cadena a LocalDate
            LocalDate fechaNacimiento = LocalDate.parse(fechaDeNacimientoStr, formatter);
            System.out.println("Fecha de nacimiento convertida: " + fechaNacimiento);

            // 4. Obtener la fecha actual
            LocalDate fechaActual = LocalDate.now();
            System.out.println("Fecha Actual: " + fechaActual);

            // 5. Calcular la edad usando Period
            Period edad = Period.between(fechaNacimiento, fechaActual);
            System.out.println("Tu edad es: " + edad.getYears() + " años.");

        } catch (Exception e){
            System.out.println("Formato de fecha inválido. Por favor, utiliza el formato dd-MM-yyyy.");
        }
    }
}
