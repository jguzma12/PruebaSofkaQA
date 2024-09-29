# Proyecto de Automatización E2E - Flujo de Compra en Saucedemo #



## Descripción

Este proyecto realiza una prueba funcional automatizada (E2E) del flujo de compra en la página web [Saucedemo](https://www.saucedemo.com/). La prueba automatiza los siguientes pasos:

1. Autenticarse con el usuario `standard_user` y la contraseña `secret_sauce`.
2. Agregar dos productos al carrito de compras.
3. Visualizar el carrito de compras.
4. Completar el formulario de compra.
5. Finalizar la compra y verificar la confirmación con el mensaje **"THANK YOU FOR YOUR ORDER"**.

## Estructura del Proyecto
src ├── main └── test ├── java │ └── co.com.certifications.sofka │ ├── interactions │ ├── runners │ ├── stepdefinitions │ ├── tasks │ └── userinterfaces └── resources ├── features └── serenity.conf
## Prerrequisitos ##

- IDE
- JDK 11 o superior
- Gradle 8.5



## Ejecución de Pruebas ##

### **Localmente**

Sigue estos pasos para ejecutar las pruebas localmente:

1. Clona este repositorio en tu máquina local.
2. Navega hasta el directorio del proyecto clonado.
3. Configura las variables de entorno en el archivo `env.properties` según sea necesario.
4. Abre una terminal en el directorio del proyecto.
5. Ejecuta los siguientes comandos:

#### **Ejecutar Todos los Runners**

```bash
./gradlew clean test
```

#### **Ejecutar Runner Especifico**

```bash
gradle clean test --tests nombreClaseRunner -Dproperties=serenity.conf -Dfile.encoding=UTF-8 aggregate
```
### **Generar y visualizar los reportes**
cd target/site/serenity
open index.html



