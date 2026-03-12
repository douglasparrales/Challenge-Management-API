🏆 Challenge API – Gestión de Retos






API REST desarrollada con Spring Boot que permite a los usuarios crear retos, inscribirse y completarlos para ganar puntos.

Este proyecto fue desarrollado como reto personal de aprendizaje durante 2 semanas, con el objetivo de practicar desarrollo backend profesional, arquitectura de APIs y manejo de base de datos.

🚀 Tecnologías

Java 17

Spring Boot

Spring Data JPA

Hibernate

PostgreSQL

Maven

Lombok

🧠 Objetivo del proyecto

Practicar conceptos clave del desarrollo backend:

diseño de API REST

arquitectura por capas

persistencia con JPA

modelado de entidades y relaciones

reglas de negocio

manejo de excepciones

🏗 Arquitectura

El proyecto sigue una arquitectura típica de aplicaciones backend.

Controller
↓
Service
↓
Repository
↓
Database
Capas del proyecto

Controller

Maneja las peticiones HTTP

Expone los endpoints de la API

Service

Contiene la lógica de negocio

Valida reglas del sistema

Repository

Acceso a la base de datos usando JPA

Entity

Representa las tablas de la base de datos

DTO

Objetos utilizados para transferir datos entre cliente y servidor

📊 Modelo de datos
Usuario
Usuario
- id
- username
- email
- password
- puntosTotales
- fechaRegistro
  Reto
  Reto
- id
- titulo
- descripcion
- puntos
- fechaInicio
- fechaFin
- creador
  Inscripción
  Inscripcion
- id
- usuario
- reto
- fechaInscripcion
- completado

Relaciones implementadas usando Hibernate y Spring Data JPA.

🌐 Endpoints
Usuarios
Método	Endpoint	Descripción
POST	/usuarios	Registrar usuario
GET	/usuarios/{id}	Obtener perfil
GET	/usuarios/ranking	Ranking por puntos
Retos
Método	Endpoint	Descripción
POST	/retos	Crear reto
GET	/retos	Listar retos
GET	/retos/{id}	Detalle de reto
Inscripciones
Método	Endpoint	Descripción
POST	/retos/{retoId}/inscribirse/{usuarioId}	Inscribirse a un reto
PUT	/retos/{retoId}/completar/{usuarioId}	Completar un reto
⚙️ Reglas de negocio

Un usuario no puede inscribirse dos veces al mismo reto.

Un usuario no puede completar un reto si no está inscrito.

Al completar un reto se suman puntos al usuario.

No se puede inscribir a retos fuera de fecha.

📦 Estructura del proyecto
src
└─ main
└─ java
└─ com.gestion_retos
├─ controller
├─ service
├─ repository
├─ model
├─ dto
└─ exception
└─ mapper
└─ payload
▶️ Cómo ejecutar el proyecto
1️⃣ Clonar repositorio
git clone https://github.com/tu-usuario/tu-repositorio.git
2️⃣ Entrar al proyecto
cd tu-repositorio
3️⃣ Ejecutar aplicación
mvn spring-boot:run

La API se ejecutará en:

http://localhost:8080
🧪 Ejemplo de request

Crear usuario:

POST /usuarios
{
"username": "juan123",
"email": "juan@email.com",
"password": "123456"
}
📚 Aprendizajes

Durante este proyecto practiqué:

Desarrollo de APIs REST

Arquitectura backend

Modelado de relaciones con JPA

Manejo de excepciones

Separación de responsabilidades

Lógica de negocio en servicios

🔮 Posibles mejoras

Autenticación con JWT

Seguridad con Spring Security

Documentación con Swagger UI

Tests con JUnit

Paginación de resultados

Dockerización del proyecto

👨‍💻 Autor

Proyecto desarrollado como práctica para mejorar habilidades en backend con Spring Boot.