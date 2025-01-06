package co.jmurillo.java8datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        // 1. Diferentes formas de crear LocalDateTime

        // Obtener fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + ahora);

        // Crear fecha y hora específica
        LocalDateTime fechaHoraEspecifica = LocalDateTime.of(2024, 12, 15, 10, 2);
        System.out.println("Fecha y hora específica: " + fechaHoraEspecifica);

        // Fecha y hora con segundos y nanosegundos
        LocalDateTime fechaHoraPrecisa = LocalDateTime.of(2024, 12, 15, 10, 5, 45, 123456789);
        System.out.println("Fecha y hora precisa: " + fechaHoraPrecisa);

        // 2. Operaciones con LocalDateTime
        LocalDateTime fechaBase = LocalDateTime.now();

        // Sumar Tiempo
        LocalDateTime futuro = fechaBase
                .plusYears(0)
                .plusMonths(2)
                .plusDays(6)
                .plusHours(1)
                .plusMinutes(10);
        System.out.println("Fecha futura = " + futuro);

        // Restar tiempo
        LocalDateTime pasado = fechaBase
                .minusYears(1)
                .minusMonths(10);
        System.out.println("Fecha pasada = " + pasado);

        // 3. Formateo personalizado
        DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        String fechaFormateada = fechaBase.format(formatoPersonalizado);
        System.out.println("fecha Formateada = " + fechaFormateada);

        // 4. Obtener componentes individuales
        System.out.println("Año: " + fechaBase.getYear());
        System.out.println("Mes: " + fechaBase.getMonth());
        System.out.println("Dia: " + fechaBase.getDayOfMonth());
        System.out.println("Hora: " + fechaBase.getHour());
        System.out.println("Minutos: " + fechaBase.getMinute());
        System.out.println("Segundos: " + fechaBase.getSecond());

        // 5. Comparaciones
        LocalDateTime fecha1 = LocalDateTime.of(2024, 1, 1, 12, 0);
        LocalDateTime fecha2 = LocalDateTime.of(2024, 12, 31, 23, 59);

        boolean esAntes = fecha1.isBefore(fecha2);
        boolean esDespues = fecha1.isAfter(fecha2);
        boolean esIgual = fecha1.equals(fecha2);

        System.out.println("¿Fecha1 es antes que Fecha2? " + esAntes);
        System.out.println("¿Fecha1 es después que Fecha2? " + esDespues);
        System.out.println("¿Son iguales? "  + esIgual);

    }
}
