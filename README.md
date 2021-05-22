# ConectECi


## 2021-1 Ciclos de Vida del Desarrollo de Software (CVDS)


## Molano Chacón Crhystian Camilo – Ruiz Santa Cristian Camilo 


## Product Owner: Julian Mauricio Velasco Briceño


## Descripción del Producto


### Descripción General 


La Plataforma de ConectECI, es una herramienta que genera un entorno de comunicación y ayuda dentro de la comunidad de estudiantes de la Escuela Colombiana de Ingeniería Julio Garavito. El sistema permite que los estudiantes puedan expresar las necesidades que tengan o puedan tener de algún elemento para poder desarrollar sus actividades de forma correcta y la urgencia relacionada a cada necesidad que registre para que asílos demáspuedan ver quétan rápidose necesita el elementopara el estudianteque publicó la solicitud de dicho elemento, de esta manera los demás miembros de la comunidad podrán facilitar estos elementos a quienes lo necesiten. De igual manera los miembros de la comunidad pueden ofrecer o publicar diferentes elementos que sean de interés para los estudiantes de la comunidad sin que exista alguna solicitud previa específicamente a ese elemento que se quiere publicar.

### Manual de Usuario 


Inicialmente el estudiante debe registrarse en la la plataforma e iniciar sesion con su usuario y contraseña. Al entrar encontrará 4 opciones que puede realizar. 


La primera opción le permitirá al estudiante crear una nueva categoría para así poder ofrecer un producto que considere que sea de interés para otros estudiantes en la comunidad. Al entrar en esta opción el estudiante deberá registrar el nombre de la categoría y su descripción, al momento de crearla su estado pasará automáticamente a “Activo" y quedará publicado y visible para los que estén buscando ese u otro elemento similar en la plataforma. 


La segunda opción le permitirá al estudiante actualizar alguna de las categorías ingresadas previamente, ya sea actualizar su nombre, descripción o su estado, dado que ya no esté disponible el elemento que se publicó inicialmente o que considere que su nombre o descripción no son correctos u óptimos para facilitar tanto la búsqueda como el encuentro del elemento por parte de los estudiantes que lo necesiten.


En la tercera opción el estudiante podrá registrar una nueva necesidad sobre un elemento que considere le es necesario para desarrollar sus actividades académicas de manera correcta, rápida y eficiente, en este caso el estudiante también podrá añadir una urgencia, que corresponde a la urgencia con la que necesita obtener el elemento, ya sea que pueda esperar o que necesite disponer de él lo antes posible.


Finalmente en la cuarta opción el estudiante podrá actualizar una necesidad que se haya registrado previamente y que considere que se deba cambiar la información de su publicación para obtener mejores ofertas y/o respuestas a su necesidad o ya sea que haya decidido cambiar la urgencia con la que necesita disponer del elemento.

###Diagrama de clases

![](/img/diagram.png)

### Descripción de la Arquitectura y Stack de Tecnologías 


Actualmente contamos con la capa de presentación y la capa de servicio las cuales para su diseño utilizamos, PrimeFaces para los diseños de botones, cuadros de texto, ventamas emergentes y otros objetos que se muestran en la página web de la plataforma. También usamos Guice para toda la parte de la inyección de las dependencias denecesarias en el código para su correcto funcionamiento y el de sus componentes. Finalmente como tecnología utilizada tenemos PostgreSQL que lo utilizamos para todo el tema del manejo de la base de datos, su actualización, diseño y modificación, tanto la base de datos del producto como sus componentes.


### Funciones Importantes

 
Lo primero que encontraremos es el inicio de sesion 


![](/img/inicio.png)


una vez se haya registrado el usuario entrara al menú principal donde encontraremos las siguientes opciones: 


![](/img/menu.png)


si tocamso la opcion de crear categoria nos muestra la siguiente interfaz


![](/img/crearCategoria.png)


![](/img/crearCategoria.jpeg)


una vez se llena los datos le damos a crear votandonos como resultado categoria creada



si volvemos al menu y le damos actualizar categoria nos mostrara todas las categorias creadas las cuales podemos actualizar


![](/img/actualizarCategoria.png)


![](/img/actualizarCategoria1.png)


por ultimo tenemos la opcion de crear necesidad la cual nos da el catalogo de categorias donde seleccionamos una y creamos la nueva necesidad


![](/img/crearNecesidad.png)


![](/img/crearNecesidad1.png)


###Enlace a la aplicación en Heroku


https://proyect-conect-eci2021.herokuapp.com/


### Descripción del proceso 


Somos Crhystian Molano Chacón y Cristian Ruiz Santa. La metodología que usamos para el desarrollo de este producto fue básicamente la metodología de la programación a par y a pesar de que durante las dos primeras semanas del desarrollo tuvimos algunos problemas con el tema de el ajuste de los integrantes del grupo, logramos superarlos y empezar con el desarrollo del producto y así empezar a trabajar en la entrega del primer sprint
