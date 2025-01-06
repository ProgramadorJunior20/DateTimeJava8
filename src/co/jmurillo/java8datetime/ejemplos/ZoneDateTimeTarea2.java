package co.jmurillo.java8datetime.ejemplos;

import java.time.*;

public class ZoneDateTimeTarea2 {
    public static void main(String[] args) {
        //Ejercicio: Calcular la Hora de Llegada de un Vuelo
        // 1. Definir la hora de salida en Nueva York
        ZonedDateTime horaSalidaNY = ZonedDateTime.of(2025, 1, 5, 23, 30, 0, 0, ZoneId.of("America/New_York"));
        System.out.println("Hora de salida en Nueva York: " + horaSalidaNY);

        // 2. Duración del vuelo
        Duration durationVuelo = Duration.ofHours(7).plusMinutes(30);
        System.out.println("Duración del vuelo: " + durationVuelo.toHours() + " horas y " + durationVuelo.toMinutes() + " minutos.");

        // 3. Calcular la hora de llegada en Nueva York
        ZonedDateTime horaLlegadaNY = horaSalidaNY.plus(durationVuelo);
        System.out.println("Hora de llegada en Nueva York: " + horaLlegadaNY);

        // 4. Convertir la hora de llegada a la zona horaria de Madrid
        ZonedDateTime horaLlegadaMadrid = horaLlegadaNY.withZoneSameInstant(ZoneId.of("Europe/Madrid"));
        System.out.println("Hora de llegada en Madrid: " + horaLlegadaMadrid);
    }
}