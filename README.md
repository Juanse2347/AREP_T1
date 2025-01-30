# Servidor Web Distribuido en Java

En este taller vamos a explorar la arquitectura de las aplicaciones distribuidas. Concretamente, exploraremos la arquitectura de  los servidores web y el protocolo http sobre el que están soportados.

## 📌 Características
- Uso de **Sockets** en Java para la comunicación cliente-servidor.
- Soporte para **HTTP GET** y **HTTP POST**.
- Registro de logs de solicitudes.

## 🛠️ Requisitos
- **Java 11 o superior**
- **Git**

## 🚀 Instalación y Ejecución
### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/Juanse2347/AREP_T1
cd AREP_T1
```

### 2️⃣ Compilar el proyecto con Maven
```bash
mvn clean install
```

![Image](https://github.com/user-attachments/assets/7c0ff0fd-1c54-48ba-8dff-be8ea9682f7b)


### 3️⃣ Ejecutar el servidor
```bash
mvn exec:java -Dexec.mainClass="co.edu.eci.arep.HttpServer"
```

![Image](https://github.com/user-attachments/assets/18d51442-87b0-44c4-93b2-b85a90dd0a7e)


### 4️⃣ Probar con un navegador o `curl`
```bash
curl http://localhost:35000/
```

![Image](https://github.com/user-attachments/assets/1cfe8477-8de1-4dd7-961c-7f2fd3057542)


## 🔍 Pruebas

Puedes ejecutar pruebas con JUnit:
```bash
mvn test
```

![Image](https://github.com/user-attachments/assets/5a05d04f-05c6-48f2-9a22-636fec2176d1)

## 🔍 Pruebas de extremo a extremo ##

Pruebas del navegador 

Probamos que nuestro servicio este funcionando correctamente

```bash
http://localhost:35000/
```

## 🔍 Pruebas de Estilo de Codificacion ##

Con el siguiente comando realizamos las pruebas de estilo de codificación son aquellas que verifican que el código sigue las convenciones y buenas prácticas del equipo o la comunidad

```bash
mvn checkstyle:check
```

![Image](https://github.com/user-attachments/assets/6c5a4c16-9c71-463d-9629-59f5c976213a)

## 🔍 Probando el REST ##

Vamos a comprobar los endpoints de nuestra API

```bash
curl -X GET "http://localhost:35000/app/hello?name=Sebas"
```

Esperamos lo siguiente:

![Image](https://github.com/user-attachments/assets/d39a131a-0c46-4156-8599-95d7d5fb59f5)

Vamos a registrar un usuarion

```bash
curl -X POST -d "name=Sebas" http://localhost:35000/app/hello
```

Esperamos lo siguiente:

![Image](https://github.com/user-attachments/assets/ccf6b67a-9e74-49e2-87aa-fb6dc66b472e)


## 🔍 Pruebas automatizadas ##

Este proyecto incluye pruebas automatizadas para garantizar su correcto funcionamiento. Ejecuta los tests con:

```bash
cd src
javac -cp .:/path/to/junit-4.12.jar co/edu/eci/arep/HttpServerTest.java
```

## :office: Desplieqgue ##

Vamos a ejecutar el servidor como un proceso en segundo plano o configurar un servicio systemd, de la siguiente manera:

```bash
mvn exec:java -Dexec.mainClass="co.edu.eci.arep.HttpSever"
```

## Construido con ## 

 - Java - Lenguaje principal utilizado
 - Maven - Para la gestión de dependencias y automatización
 - JUnit - Para pruebas automatizadas

## Contribuciones ##

Lea [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) para obtener detalles sobre nuestro código de conducta y el proceso para enviarnos solicitudes de extracción.

## Control de Versiones ##

Usamos [SemVer](http://semver.org/) para controlar las versiones.

## Autor ##

* **Juan Sebastian Sanchez** - *Trabajo Inicial* - [Juanse2347](https://github.com/Juanse2347)


## 📄 Licencia
Este proyecto está bajo la licencia [LICENSE](LICENSE). ¡Siéntete libre de contribuir! 😊


## Expresiones de Gratitud ##

- Inspiracion
- Compromiso

