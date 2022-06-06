# Ampliacion Entornos de Desarrollo

Se desea diseñar y codificar una aplicacion para la administracion de contactos y notas por usuario registrado. El acceso a la aplicacion será a partir de contraseña. 
Los contactos   deberán   contar con el   nombre,   apellido,   correo electronico, direccion y telefono, pudiendose extender a un breve comentario   
(opcional). En caso de los usuarios registrados, deben contar con otro atributo que sería un nick o apodo. Se podrán crear tantos contactos como se quiera y 
al seleccionar sobre uno de ellos, se podrá modificar sus datos o eliminarlo completamente. Los contactos se administran a partir de una serie de libretas de contactos. 
Un usuario puede crear y eliminar tantas libretas de contacto como quiera, cuya mision es la de agrupar contactos.
- Contará con otra parte para crear   anotaciones.   Cada   nota   debe contar con un asunto
(breve descripcion), la fecha de creacion (no modificable), la fecha de la ultima actualizacion y una descripcion con el texto que se quiera.
Una nota podrá modificarse y automáticamente en el campo fecha de ultima actualizacion, deberá actualizarse. Las notas tambien se pueden eliminar.
- La aplicacion deberá tener 3 perfiles de usuario:
    - Usuario	Registrado.	Podrán	gestionar	sus	contactos	y	notas.	La descripcion
de sus campos el nombre, apellidos, direccion de correo electronico, password y nick o apodos
    - Usuario anonimo.   Solo	podrá	gestionar notas,   pero	en	ningun	caso podrá ver
notas de usuarios registrados. Existe un solo usuario anonimo para todos aquellos que quieran utilizar la aplicacion.
    - Usuario administrador. Solo podrá gestionar la parte de usuarios como modificar   sus
datos,   crear   nuevos   usuarios   registrados   o administradores   y eliminarlos. Tambien podrá activar/desactivar la cuenta anonima. En ningun caso, podrá ver la clave de los usuarios que hay   en   el   sistema.   Como   campos,   serán   los   comunes a un usuario registrado excepto el apodo o nick y sí un campo con la fecha de la ultima conexion.
    - Para futuros cambios, se plantea que un administrador pueda cambiar la cuenta de un
usuario registrado a usuario administrador.
Se pide:
- Validación de requisitos (documento con el resumen de qué requerimientos hay que conseguir)
- Análisis
    - Diagrama de casos de uso
    - Diagrama de secuencia
- Diseño
    - Diagrama de clases
- Implementación de las clases y voluntariamente un pequeño main para interactuar con la aplicación a traves de la consola, sin interfaz gráfica
    - Mediante IntelliJ
    - Documentación con javadoc (se generarán los archivos y se subirán a github)
- Seguimiento en github
    - Toda la documentación de los apartados anteriores
