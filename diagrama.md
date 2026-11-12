@startuml
abstract class Productos{
- id: int
- nombre: String
- id: precio 
- id: stock
+ Productos(int: id, nombre: String, precio: int, stock: int)
}

class Videojuegos{
+ Videojuegos(int: id, nombre: String, precio: int, stock: int)
+ Videojuegos_I(): ArrayList<Productos>    
}


class Figuras{
+ Figuras(int: id, nombre: String, precio: int, stock: int)
+ Figuras_I(): ArrayList<Productos>
    
}


class Consolas{
+ Consolas(int: id, nombre: String, precio: int, stock: int)
+ Consolas_I(): ArrayList<Productos>
    
}

class Carrito{
+ AñadirP(): ArrayList<Productos>
}

class Inventario{
+ Inventario: ArrayList<Productos>
}

Productos <|-- Videojuegos
Productos <|-- Consolas
Productos <|-- Figuras
Inventario <|-- Carrito
Inventario *--Videojuegos
Inventario *-- Figuras 
Inventario *-- Consolas


@enduml

