package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
//USAREMOS LA INTERFACE PARA OBTENER LOS MÉTODOS DE BÚSQUEDA, EDICIÓN, ELIMINAR... (find, save, delete...)
 interface RepositorioEmpleado extends JpaRepository<Empleado, Long>{

}

/*
Esta interfaz extiende JpaRepository de Spring Data JPA, especificando el tipo de dominio como empleado y el tipo de identificación como largo. 
Esta interfaz, aunque vacía en la superficie, presenta un impacto dado que admite:

 - Creando nuevas instancias

 - Actualizando los existentes.

 - Borrando

 - Encontrar (uno, todos, por propiedades simples o complejas)


La solución de repositorio de Spring Data hace posible eludir detalles específicos del almacén de datos y, en cambio, resolver la mayoría
de los problemas utilizando terminología específica del dominio.

Lo creas o no, esto es suficiente para lanzar una aplicación! Una aplicación Spring Boot es, como mínimo, un punto de entrada principal
de vacío estático público y la anotación @SpringBootApplication. Esto le dice a Spring Boot que ayude, siempre que sea posible.

*/