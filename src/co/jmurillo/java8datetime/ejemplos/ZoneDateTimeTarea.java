package co.jmurillo.java8datetime.ejemplos;

import java.time.*;

public class ZoneDateTimeTarea {
    public static void main(String[] args) {
        //Obtener la Fecha y Hora Actual en una Zona Específica
        ZonedDateTime ahoraEnMadrid = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        System.out.println("Fecha y hora actual en Madrid: " + ahoraEnMadrid);

        ZonedDateTime ahoraEnNy = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Fecha y hora actual en NY" + ahoraEnNy);

        //Convertir de LocalDateTime a ZonedDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println("Fecha y hora en Tokio: " + zonedDateTime);


        /*Cálculo de Duración Usa Duration para medir la diferencia en términos de horas, minutos o segundos.
        * */
        ZonedDateTime inicio = ZonedDateTime.of(2025, 1, 5, 17,53,0,0, ZoneId.of("America/New_York"));
        ZonedDateTime fin = ZonedDateTime.of(2025, 1, 5,0,0,0,0, ZoneId.of("Europe/Madrid"));

        Duration duration = Duration.between(inicio, fin);
        System.out.println("Duración en horas: " + duration.toHours());
        System.out.println("Duración en minutos: " + duration.toMinutes());

        //Cálculo de Períodos Usa Period para medir la diferencia en términos de días, meses o años.
        ZonedDateTime fechaInicio = ZonedDateTime.of(2024, 1, 1, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));
        ZonedDateTime fechaFin = ZonedDateTime.of(2025, 1, 1, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));

        Period periodo = Period.between(fechaInicio.toLocalDate(), fechaFin.toLocalDate());
        System.out.println("Años: " + periodo.getYears());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Dias: " + periodo.getDays());
    }
}