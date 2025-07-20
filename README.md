# IntArrayList vs IntVector

## 📚 Descripción d
La interfaz intList define los métodos básicos que deben implementar todas las listas de enteros: add(int number) y get(int id).
Esto permite que cualquier clase que implemente la interfaz pueda ser utilizada de forma intercambiable, garantizando que tendrá esas operaciones esenciales.

Las clases IntArrayList y IntVector heredan de AbstractIntList, que a su vez implementa la interfaz intList.
Así, ambas clases cumplen el contrato de la interfaz y pueden usarse donde se requiera una lista de enteros, pero cada una gestiona el crecimiento del arreglo interno de manera diferente según su implementación de resize().

Resumen de la estructura:
intList (interfaz): define los métodos esenciales.
AbstractIntList (clase abstracta): implementa la interfaz y provee la lógica común.
IntArrayList y IntVector: extienden la clase abstracta y personalizan el método de redimensionamiento

## 🚀 Características
- `IntArrayList`: El método resize() aumenta el tamaño del arreglo interno en un 50% cada vez que se llena. Esto permite ahorrar memoria cuando el crecimiento de la lista es gradual.
- `IntVector`: El método resize() duplica el tamaño del arreglo interno cada vez que se llena. Esto mejora el rendimiento en inserciones masivas, ya que reduce la cantidad de redimensionamientos necesarios.

## 🛠️ Cuando usar cada clase
Usa `IntArrayList` si buscas eficiencia en memoria y el crecimiento es moderado.
Usa `IntVector` si necesitas mejor rendimiento en inserciones frecuentes y el tamaño puede crecer mucho.

Ejemplo 1: Uso de `IntArrayList` (crecimiento moderado, ahorro de memoria)
```Java
IntArrayList lista = new IntArrayList();
for (int i = 0; i < 20; i++) {
lista.add(i);
}
System.out.println("Tamaño interno de IntArrayList: " + lista.getData().length);
System.out.println("Elementos: " + lista.size());
```
_Nota: Ideal cuando el crecimiento es gradual y se busca eficiencia en memoria._

Ejemplo 2: Uso de IntVector (crecimiento rápido, mejor rendimiento en inserciones masivas)

```Java
IntVector vector = new IntVector();
for (int i = 0; i < 40; i++) {
    vector.add(i);
}
System.out.println("Tamaño interno de IntVector: " + vector.getData().length);
System.out.println("Elementos: " + vector.size());
```
_Nota: Ideal cuando se espera que la lista crezca mucho o muy rápido._
