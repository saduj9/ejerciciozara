# ejerciciozara
ejercicio de prueba
Ejercicio de Consulta de Precios - Documentación
Este ejercicio consiste en construir una aplicación/servicio en Spring Boot que proporcione un endpoint REST para consultar precios. A continuación se detallan los pasos para utilizar y ejecutar el proyecto.

# Requisitos previos
Java Development Kit (JDK) 8 o superior instalado.
Maven instalado.
IDE de desarrollo (por ejemplo, IntelliJ IDEA o Eclipse).

# Paso 1: Clonar el repositorio
Clone este repositorio en su máquina local utilizando el siguiente comando:
git clone https://github.com/saduj9/ejerciciozara.git

# Paso 2: Importar el proyecto
Abra su IDE de desarrollo y importe el proyecto como un proyecto Maven existente.

# Paso 3: Configurar la base de datos H2
Este proyecto utiliza una base de datos en memoria H2. No se requiere ninguna configuración adicional, ya que la base de datos se configurará automáticamente al ejecutar la aplicación.

# Paso 4: Ejecutar la aplicación
Ejecute la aplicación desde su IDE o utilice el siguiente comando en la línea de comandos dentro del directorio del proyecto:
mvn spring-boot:run

# Paso 5: Probar el endpoint REST
Una vez que la aplicación esté en ejecución, puede probar el endpoint REST para consultar precios. Utilice una herramienta como Postman o cURL para enviar una solicitud HTTP GET a la siguiente URL:
http://localhost:8080/precios

La solicitud debe incluir los siguientes parámetros de consulta:
cadenaId: El identificador de la cadena.
productoId: El identificador del producto.
fecha: La fecha de aplicación en el formato 'yyyy-MM-dd'.
# Importante!!!Aunque el proyecto ya viene con las pruebas incluidas solo yiene que correr la aplicacion que se encuentra en la siguiente ruta: ejerciciozara\src\main\java\com\h2\ejerciciozara\ejerciciozara\EjerciciozaraApplication.java
# los tests se encuentran en la siguiente ruta: ejerciciozara\src\test\java\com\h2\ejerciciozara\ejerciciozara\PriceControllerTests.java


La respuesta será un objeto JSON que contiene la información del producto, cadena, tarifa aplicable, fechas de aplicación y precio final.

¡Eso es todo! Ahora puedes utilizar y probar el endpoint REST de consulta de precios en tu aplicación Spring Boot.
