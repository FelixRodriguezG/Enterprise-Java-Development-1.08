# 📦 Enterprise-Java-Development-1.08

Bienvenido al repositorio del ejercicio **Enterprise Java Development 1.08**, parte del módulo de Java del Bootcamp de Ironhack. Este lab está compuesto por varios mini-proyectos enfocados en consolidar los conocimientos de Programación Orientada a Objetos (POO), manipulación de datos con `BigDecimal`, uso de clases abstractas, herencia, e implementación de interfaces.


## 📁 Estructura del proyecto

```markdown
📦 src/
 ┣ 📁 main/
 ┃ ┣ 📁 java/
 ┃ ┃ ┣ 📁 carinventory/
 ┃ ┃ ┃ ┣ Car.java
 ┃ ┃ ┃ ┣ Sedan.java
 ┃ ┃ ┃ ┣ UtilityVehicle.java
 ┃ ┃ ┃ ┗ Truck.java
 ┃ ┃ ┣ BigDecimalUtils.java
 ┃ ┃ ┗ 📁 videostreaming/
 ┃ ┃   ┣ Video.java
 ┃ ┃   ┣ Movie.java
 ┃ ┃   ┗ Series.java
 ┃ ┗ 📁 resources/
 ┣ 📁 test/
 ┃ ┣ 📁 java/
 ┃ ┗ 📁 resources/
 ┣ pom.xml
 ┗ README.md
```


## 🧮 BigDecimal Operations

### ✅ Requisitos:

1. **Redondeo a centésimas:**  
   Método que recibe un `BigDecimal` y retorna un `double` redondeado a dos decimales.  
   Ejemplo: `4.2545` → `4.25`

2. **Cambio de signo y redondeo a décimas:**  
   Método que invierte el signo del número y lo redondea a una décima.  
   Ejemplo: `1.2345` → `-1.2`, `-45.67` → `45.7`

📄 **Archivo:** `BigDecimalUtils.java`

---

## 🚗 Car Inventory System

Se modela un sistema de inventario de vehículos usando clases abstractas y herencia.

### 🔧 Clase abstracta: `Car`
- Propiedades: `vinNumber`, `make`, `model`, `mileage`
- Método: `getInfo()` retorna información legible.

### 🚘 Subclases:
- `Sedan`
- `UtilityVehicle` → propiedad extra: `fourWheelDrive` (boolean)
- `Truck` → propiedad extra: `towingCapacity` (double)

📄 **Paquete:** `carinventory`

---

## 🎬 Video Streaming Service

Sistema básico de contenido en streaming que distingue entre películas y series.

### 🔧 Clase abstracta: `Video`
- Propiedades: `title`, `duration`
- Método: `
