package co.jmurillo.java8datetime.ejemplos;

import java.time.LocalDate;

public class EjemploLocalDate {
    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate hoy = LocalDate.now();
        System.out.println("fecha actual = " + hoy);

        // Crear una fecha específica
        LocalDate fechaEspecifica = LocalDate.of(2024, 12, 14);
        System.out.println("fecha Especifica = " + fechaEspecifica);

        // Obtener partes de la fecha
        System.out.println("Año: " + hoy.getYear());
        System.out.println("mes: " + hoy.getMonth());
        System.out.println("Dia del año: " + hoy.getDayOfYear());
        System.out.println("Dia del mes: " + hoy.getDayOfMonth());
        System.out.println("Dia de la semana: " + hoy.getDayOfWeek());

        System.out.println("Era: " + hoy.getEra());
    }
}
