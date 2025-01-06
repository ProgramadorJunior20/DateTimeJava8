package co.jmurillo.java8datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjemploLocalTime {
    public static void main(String[] args) {
        // Diferentes formas de crear un LocalTime

        // 1. Obtener la hora actual
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora Actual: " + horaActual);

        // 2. Crear una hora específica (hora, minuto)
        LocalTime medioDia = LocalTime.of(12, 0);
        System.out.println("medioDia = " + medioDia);

        // 3. Crear hora específica (hora, minuto, segundo)
        LocalTime horaConSegundos = LocalTime.of(12, 30, 15);
        System.out.println("Hora con segundos: " + horaConSegundos);

        // 4. Crear hora específica (hora, minuto, segundo, nanosegundo)
        LocalTime horaPrecisa = LocalTime.of(12, 30, 15, 500000000);
        System.out.println("Hora precisa: " + horaPrecisa);

        // Operaciones con LocalTime
        LocalTime hora = LocalTime.of(22, 13);

        // Sumar tiempo
        LocalTime dosTresHorasDespues = hora.plusHours(2);
        System.out.println("dos Tres Horas Después = " + dosTresHorasDespues);

        // Restar tiempo
        LocalTime treintaMinutosAntes = hora.minusMinutes(30);
        System.out.println("treinta Minutos Antes = " + treintaMinutosAntes);

        // Formatear la hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String horaFormateada = hora.format(formatter);
        System.out.println("hora Formateada = " + horaFormateada);

        // Comparaciones
        LocalTime hora1 = LocalTime.of(22, 22);
        LocalTime hora2 = LocalTime.of(23, 30);

        boolean antes = hora1.isBefore(hora2);
        boolean depues = hora2.isAfter(hora1);
        System.out.println("¿hora 1 es antes de hora2?: " + antes);
        System.out.println("¿Hora 2 es despues de hora 1? : " + depues);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
