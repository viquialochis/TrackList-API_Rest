# TrackList-API_Rest
Enunciado:
A continuación, describimos los requerimientos a desarrollar de forma previa para poder enforcarse:

1. Construir un proyecto de Spring boot que soporte, Spring data para conectarse a la base de 
    datos, Endpoints para dar respuesta a los requisitos aquí solicitados, Tests unitarios de estos 
    requisitos y la estructura interna vista en clase y acordada para la implementación.
    
a. Puede o no usar lombok para la definición de las entidades y/o los dtos.
b. Puede o no usar dtos y mapeos

2. Construir la estructura de endpoints CRUD (Crear, Obtener, Modificar y Borrar) para cada una de
    las siguientes tablas:

a. customer
b. invoice
c. invoice_items
d. track
e. playlist_track
f. playlist

3. Para cada una de estas tablas se solicita al menos, capa de acceso a datos (Repositorio), capa de 
    negocio (Servicio) y capa de Interfaz (Controlador), además evidentemente de la Entidad de 
    datos.

4. Tener en cuenta que la tabla playlist_track es una relación pura con lo que el requerimiento pasa 
    por poder agregar o eliminar tracks a la playlist.

5. Finalmente se requiere al menos los tests unitarios a nivel de Servicio para los métodos 
    implementados para las tablas mencionadas