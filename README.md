# Proyecto: Exploración de la API Date and Time en Java 8

## Descripción

Este proyecto está diseñado para explorar y comprender a fondo la API `java.time` introducida en Java 8, la cual ofrece herramientas modernas, eficientes e inmutables para el manejo de fechas y tiempos. A través de ejemplos prácticos y ejercicios, el objetivo es adquirir un entendimiento sólido de las principales clases y sus usos, aplicando buenas prácticas de programación.

## Objetivos

1. Aprender a trabajar con las principales clases de la API Date and Time:
   - `LocalDate`
   - `LocalTime`
   - `LocalDateTime`
   - `ZonedDateTime`
   - `Duration` y `Period`
2. Practicar el manejo de fechas y tiempos en diferentes formatos y zonas horarias.
3. Implementar ejercicios prácticos que refuercen la comprensión de los conceptos clave.
4. Aplicar buenas prácticas de desarrollo relacionadas con fechas y tiempos.

## Requisitos Previos

- Conocimientos básicos de Java.
- Familiaridad con conceptos como objetos inmutables y manejo de excepciones.
- Entorno de desarrollo configurado con JDK 8 o superior.

## Instalación

1. Clonar este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/tu_usuario/java8-datetime.git
   ```
2. Abrir el proyecto en tu IDE preferido (Eclipse, IntelliJ IDEA, VS Code, etc.).
3. Asegúrate de tener configurado JDK 8 o superior.

## Estructura del Proyecto

```
/
|-- src
|   |-- co 
|       |-- jmurillo
|           |-- java8detetime/ejemplos
|               |-- tarea.java
|               |-- ZoneDateTimeTarea.java
|               |-- ZoneDateTimeTarea2.java
|-- README.md
```

### Principales Archivos

- **tarea.java**: Calcula la edad de una persona basada en su fecha de nacimiento.
- **`ZoneDateTimeTarea.java`**: Trabaja con fechas y tiempos en zonas horarias diferentes (ej. cálculo de horarios de vuelos).
- **ZoneDateTimeTarea2.java**: Explora las diferencias entre `Duration` y `Period`.

## Ejercicios y Ejemplos

1. **Cálculo de Edad**

   - Entrada: Fecha de nacimiento en formato `dd-MM-yyyy`.
   - Salida: Edad en años.

2. **Cálculo de Hora de Llegada de un Vuelo**

   - Entrada: Hora de salida, duración del vuelo, zonas horarias de origen y destino.
   - Salida: Hora de llegada en la zona horaria del destino.

3. **Cálculo de Duraciones y Períodos**

   - Diferencia entre dos fechas.
   - Representación de intervalos en días, meses o años.

## Tecnologías Usadas

- Java 8
- API `java.time`

## Buenas Prácticas

- Siempre usar objetos inmutables como los proporcionados por `java.time`.
- Trabajar con `ZoneId` para evitar errores en cálculos de zonas horarias.
- Manejo adecuado de excepciones al convertir cadenas a fechas.

## Contribuciones

Si deseas contribuir a este proyecto, crea un fork y envía un pull request con tus mejoras o nuevos ejercicios.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más información.

by: Jeferson Murillo and ChatGPT
