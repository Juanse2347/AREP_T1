# Servidor Web Distribuido en Java

En este taller vamos a explorar la arquitectura de las aplicaciones distribuidas. Concretamente, exploraremos la arquitectura de  los servidores web y el protocolo http sobre el que están soportados.

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
git clone https://github.com/Juanse2347/AREP_T1
cd AREP_T1
```

### 2️⃣ Compilar el proyecto con Maven
```bash
mvn clean install
```

### 3️⃣ Ejecutar el servidor
```bash
mvn exec:java -Dexec.mainClass="co.edu.eci.arep.HttpServer"
```

### 4️⃣ Probar con un navegador o `curl`
```bash
curl http://localhost:35000/
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

![Image](https://github.com/user-attachments/assets/5a05d04f-05c6-48f2-9a22-636fec2176d1)

## 📄 Licencia
Este proyecto está bajo la licencia [LICENSE](LICENSE). ¡Siéntete libre de contribuir! 😊

