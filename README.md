# Servidor Web Distribuido en Java

Este proyecto implementa un **servidor web distribuido** en Java, capaz de manejar múltiples solicitudes de clientes y distribuir la carga entre varios servidores.

## 📌 Características
- Manejo de múltiples conexiones concurrentes.
- Balanceo de carga entre servidores.
- Uso de **Sockets** en Java para la comunicación cliente-servidor.
- Soporte para **HTTP GET** y **HTTP POST**.
- Registro de logs de solicitudes.

## 🛠️ Requisitos
- **Java 11 o superior**
- **Git**

## 🚀 Instalación y Ejecución
### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/Juanse2347/servidor-web-java.git
cd servidor-web-java
```

### 2️⃣ Compilar el proyecto con Maven
```bash
mvn clean package
```

### 3️⃣ Ejecutar el servidor
```bash
java -jar target/servidor-web.jar
```

### 4️⃣ Probar con un navegador o `curl`
```bash
curl http://localhost:8080/
```

## 🏗️ Arquitectura
El servidor sigue un modelo **cliente-servidor distribuido** con balanceo de carga:
1. **Servidor principal**: Recibe solicitudes y las redirige a los servidores de aplicación.
2. **Servidores secundarios**: Procesan las solicitudes y devuelven las respuestas.
3. **Clientes**: Envían solicitudes HTTP.

```
Cliente --> Servidor Principal --> Servidores Secundarios
```

## 📜 Configuración
Puedes modificar la configuración en el archivo `config.properties`:
```properties
server.port=8080
server.maxThreads=100
server.logFile=logs/server.log
```

## 🔍 Pruebas
Para probar el servidor:
```bash
curl -X GET http://localhost:8080/test
```

Puedes ejecutar pruebas con JUnit:
```bash
mvn test
```

## 📄 Licencia
Este proyecto está bajo la licencia [LICENSE](LICENSE). ¡Siéntete libre de contribuir! 😊

