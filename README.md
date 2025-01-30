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

## Pruebas de extremo a extremo ##

Pruebas del navegador 

Probamos que nuestro servicio este funcionando correctamente

```bash
http://localhost:35000/
```

## Pruebas de Estilo de Codificacion ##

Con el siguiente comando realizamos las pruebas de estilo de codificación son aquellas que verifican que el código sigue las convenciones y buenas prácticas del equipo o la comunidad

```bash
mvn checkstyle:check
```

![Image](https://github.com/user-attachments/assets/6c5a4c16-9c71-463d-9629-59f5c976213a)


## 📄 Licencia
Este proyecto está bajo la licencia [LICENSE](LICENSE). ¡Siéntete libre de contribuir! 😊

