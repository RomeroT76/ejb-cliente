# Proyecto de Gestor de Usuarios

Este proyecto es una aplicación de escritorio desarrollada en Java que permite gestionar usuarios mediante una interfaz gráfica. Utiliza una arquitectura basada en EJB (Enterprise JavaBeans) para conectarse a servicios remotos y seguir el patrón de diseño MVC (Modelo-Vista-Controlador).

## Características

- Registro de usuarios con información básica: cédula, nombre, correo y rol.
- Listado de usuarios almacenados.
- Interfaz gráfica creada con Swing.
- Implementación de EJBs para el manejo remoto de servicios.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- **`cliente`:**
  - `Main.java`: Punto de entrada de la aplicación. Se encarga de inicializar el servicio remoto y lanzar la interfaz.

- **`controller`:**
  - `AgregarBTController.java`: Controlador para manejar los eventos del botón de agregar usuario.
  - `ListBTController.java`: Controlador para manejar el listado de usuarios.

- **`model`:**
  - `User.java`: Clase que representa a un usuario con atributos como cédula, nombre, correo y rol.
  - `JListModel.java`: Modelo utilizado para manejar la lista de usuarios en la interfaz gráfica.

- **`service`:**
  - `UserServiceRemote.java`: Interfaz remota para crear y listar usuarios.

- **`views`:**
  - `UserGUI.java`: Interfaz gráfica que permite la interacción del usuario con el sistema.

## Requisitos del Sistema

- **JDK:** Versión 8 o superior.
- **Servidor de Aplicaciones:** WildFly o cualquier servidor compatible con EJBs.
- **Dependencias:**
  - Jakarta EE para las especificaciones de EJB.

## Instrucciones de Ejecución

1. **Configuración del Servidor:**
   - Configure un servidor compatible con EJB y asegúrese de desplegar el servicio remoto necesario.

2. **Compilación del Proyecto:**
   - Compile el proyecto utilizando un IDE como IntelliJ IDEA o Eclipse, o con una herramienta de construcción como Maven o Gradle.

3. **Ejecución:**
   - Ejecute la clase `Main.java` para iniciar la aplicación.

## Uso de la Aplicación

1. **Registro de Usuarios:**
   - Ingrese los datos del usuario en los campos correspondientes.
   - Presione el botón "Agregar" para registrar al usuario.

2. **Listado de Usuarios:**
   - Presione el botón "Listar" para visualizar todos los usuarios registrados en el sistema.

## Autor

Este proyecto fue desarrollado como parte de un sistema de gestión de usuarios para propósitos educativos en la materia de Sistemas Distribuidos.
