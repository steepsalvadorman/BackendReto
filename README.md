### README ###
PASOS PARA UTILIZAR EL API Y NOTAS

1. Primero debemos detener instalado MySQL o Docker con Mysql como contenedor ejecutado
2. Es importante cargar base de datos con informacion, si no arrojara null. Esto es asi porque no hay mucho tiempo para las excepciones
3. El usuario y contraseña de la conexion es root, admin
4. Esta API de personas tiene documentacion en SWAGGER muy basica. No tiene seguridad. La URL es la siguiente http://localhost:8080/swagger-ui/index.html#/
5. Solo se tiene una tabla creada con Spring Data JPA. La mayoria de campos son String debido a que le dejaria la responsabilidad al frontend de convertir los datos si es necesario.
