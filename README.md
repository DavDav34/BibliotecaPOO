# 🏛️ POO y Herencia en Sistemas de Biblioteca 🏛️
<p align="justify">
Esta práctica tiene como propósito introducir al estudiante en la creación de sistemas con estructuras orientadas a objetos, aplicando conceptos de herencia, polimorfismo y encapsulamiento en Java. A través del diseño de una biblioteca, se busca modelar entidades compartidas y especializadas mediante jerarquías de clases.
</p>

---

## 📖 Sistema de Biblioteca
<p align="justify">
El estudiante desarrollará una aplicación en Java que simule el comportamiento de una biblioteca que administra libros y revistas, permitiendo a los usuarios consultar, prestar y devolver estos recursos.

### ¬ Aspectos fundamentales:
- Reutilización de código: Clase abstracta RecursoBibliografico, base para libros y revistas.
- Herencia: Las clases Libro y Revista heredan de RecursoBibliografico.
- Polimorfismo: Cada recurso implementa su versión del método mostrarDetalle().
- Encapsulamiento: Acceso protegido a atributos como el estado del préstamo.
- Gestión de Usuarios: Clase Usuario gestiona préstamos y devoluciones.

### ¬ Evolución del diseño
- Diseño orientado a objetos: Clases modeladas con atributos y métodos.
- Separación de responsabilidades: Cada clase con funciones claras.
- Manejo de disponibilidad: Validaciones para evitar múltiples préstamos.
</p>

---
## 🌐 Comparativa: estructura orientada a objetos vs estructura lineal
Característica                | Lineal                        | POO
-----------------------------|-------------------------------|-------------------------------
Manejo de datos              | Arrays con condicionales      | Clases con atributos
Expansión del sistema        | Difícil                       | Simple con subclases
Lectura del código           | Repetitivo                    | Modular y claro
Reutilización                | Escasa                        | Alta por herencia/polimorfismo
---

## 💰 Proceso de desarrollo propuesto
1. Crear las clases: RecursoBibliografico, Libro, Revista, Usuario.
2. Implementar mostrarDetalle() con polimorfismo.
3. Menú interactivo para visualizar, prestar y devolver recursos.
4. Uso de Git para control de versiones.
5. Organización con Microsoft Planner.

## 📖 Ejecución del Sistema de Gestión Bibliotecaria
###  1. Menú Principal
El sistema despliega un menú con las siguientes opciones:
1. Mostrar recursos disponibles
2. Registrar un préstamo
3. Registrar una devolución
4. Mostrar préstamos activos
5. Salir
El usuario debe ingresar una opción numérica para continuar.

![1](https://github.com/user-attachments/assets/c2cce7c9-d073-4108-95c3-3e8d3cf2a5dd)

### 2. Mostrar Recursos Disponibles
<p align="justify">
Cuando se selecciona la opción 1, el sistema lista todos los recursos (libros y revistas) registrados en la biblioteca, junto con su estado actual (Disponible o Prestado), ISBN o ISSN, y detalles como autor o número de ejemplares.

![2](https://github.com/user-attachments/assets/f9bf6e1c-4787-4067-a595-64bb16cb06f4)

### 3. Registrar un Préstamo
Al seleccionar la opción 2, el sistema solicita el ID del usuario y el ID del recurso que se desea prestar (por ejemplo, el ISBN de un libro). Si el recurso está disponible, se cambia su estado a 'Prestado' y se confirma la operación.

![3](https://github.com/user-attachments/assets/d60253fc-d9b2-4edf-847c-a91fd96a9a16)

### 4. Cambios en el Estado del Recurso
Después de realizar un préstamo, si se vuelve a consultar la lista de recursos (opción 1), se puede observar que el recurso prestado ha cambiado su estado a 'Prestado'.

![4](https://github.com/user-attachments/assets/8ddf5d69-3b21-43ed-99d5-5960327df556)

### 5. Registrar una Devolución
Seleccionando la opción 3, el usuario puede devolver un recurso previamente prestado. El sistema valida que el recurso esté prestado antes de marcarlo como 'Disponible' nuevamente.

![5](https://github.com/user-attachments/assets/3eff949f-7d08-475b-b0a7-77f354cd2b22)

### 6. Mostrar Préstamos Activos
Con la opción 4, el sistema muestra todos los recursos que están actualmente prestados, incluyendo la información del usuario que los solicitó.

![6](https://github.com/user-attachments/assets/39ab15f8-05be-4568-9899-f8400421ded5)
</p>

---

## 📖 Reflexión final
<p align="justify">
Esta práctica permitió aplicar de manera concreta los principios de la programación orientada a objetos, como herencia, polimorfismo y encapsulamiento, en el desarrollo de un sistema funcional para la gestión bibliotecaria. A través del diseño modular y el uso de clases especializadas, se comprendió la importancia de organizar el código de forma clara y reutilizable.
Además, la implementación de funciones como préstamos y devoluciones fortaleció la lógica de validación y el manejo de estados, aspectos fundamentales en sistemas reales. 
El uso de herramientas como GitHub y Planner complementó la experiencia, simulando un entorno profesional de desarrollo. En conjunto, esta actividad no solo reforzó conocimientos técnicos en Java, sino que también promovió buenas prácticas de diseño, planificación y estructura, preparando al estudiante para retos de mayor complejidad en proyectos futuros.
</p>

### ¬ Enlaces
🔗[Repositorio en GitHub](https://github.com/DavDav34/BibliotecaPOO.git)
🔗[Planner](https://planner.cloud.microsoft/f94bf4d9-8097-4794-adf6-a5466ca28563/Home/PlanViews/FHaGeQWBNkyh1oismmWYF2QAEPFo?Type=PlanLink&Channel=Link&CreatedTime=638816701271480000)
