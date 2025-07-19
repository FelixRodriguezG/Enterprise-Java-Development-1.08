# 📦 Enterprise-Java-Development-1.08

Bienvenido al repositorio del ejercicio **Enterprise Java Development 1.08**, parte del módulo de Java del Bootcamp de Ironhack. Este proyecto contiene mini-aplicaciones para practicar Programación Orientada a Objetos (POO), uso de `BigDecimal`, herencia, clases abstractas e interfaces.

## 🧮 Utilidades con BigDecimal

### Funcionalidades:

1. **Redondeo a centésimas:**  
   Método que recibe un `BigDecimal` y retorna un `double` redondeado a dos decimales.  
   Ejemplo: `4.2545` → `4.25`

2. **Cambio de signo y redondeo a décimas:**  
   Método que invierte el signo del número y lo redondea a una décima.  
   Ejemplo: `1.2345` → `-1.2`, `-45.67` → `45.7`

📄 **Archivo:** `src/main/java/utils/BigDecimalUtils.java`

---

## 🚗 Sistema de Inventario de Vehículos

Modela un sistema de inventario usando clases abstractas y herencia.

- **Clase abstracta:** `Car`  
  Propiedades: `vinNumber`, `make`, `model`, `mileage`  
  Método: `getInfo()`

- **Subclases:**  
  - `Sedan`
  - `UtilityVehicle` (propiedad extra: `fourWheelDrive`)
  - `Truck` (propiedad extra: `towingCapacity`)

📄 **Ubicación:**  
`src/main/java/car/inventory/system/model/Car.java`  
`src/main/java/car/inventory/system/factory/`

---

## 🎬 Servicio de Streaming de Video

Sistema básico para gestionar películas y series.

- **Clase base:** `Video`  
  Propiedades: `title`, `duration`  
  Método: `getInfo()`

- **Subclases:**  
  - `Movie` (propiedad extra: `rating`)
  - `TvSeries` (propiedad extra: `episodes`)

📄 **Ubicación:**  
`src/main/java/video/streaming/service/model/Video.java`  
`src/main/java/video/streaming/service/content/`

---

## ▶️ Ejecución

- **Car Inventory:**  
  Ejecutar `car.inventory.system.Main` para ver ejemplos de uso y manipulación de vehículos.

- **Video Streaming:**  
  Ejecutar `video.streaming.service.Main` para ver ejemplos de películas y series.

---

## 📝 Notas

- El proyecto sigue una estructura modular y separa claramente los dominios de cada mini-aplicación.
- Se recomienda revisar cada clase para entender la implementación de la herencia y el uso de métodos sobrescritos.
