# Información del proyecto

## Arranque del proyecto

```code
./mvnw spring-boot:run
```

# Rutas rest

## Métodos GET

### Obtener todos los elementos

```code
http://localhost:8090/api-rest/v1/books/
```

### Obtener un elemento

```code
http://localhost:8090/api-rest/v1/books/1
```

## Métodos POST

### Añadir un elemento


```code
http://localhost:8090/api-rest/v1/books/
```

En el body

```code
{
    "title": "El Quijote",
    "price": 19.99,
    "publishDate": "1605-01-16"
}
```

Recuerden el content type.

## Métodos delete

## Eliminar un elemento

```code
http://localhost:8090/api-rest/v1/books/
```

## Añadir documentación de la api-rest

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.1.0</version>
</dependency>
```

### Fichero de configuración

Hay que añadir dentro del fichero de configuración la propiedad:

```code
springdoc.api-docs.path=/api-docs
```
en caso de no estar definida será

```code
http://localhost:8090/api-rest/v3/api-docs
```

### Verificación de funcionamiento

````code
http://localhost:8090/api-rest/swagger-ui/index.html
````
