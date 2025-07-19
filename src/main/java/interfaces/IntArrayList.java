package interfaces;

public class IntArrayList extends AbstractIntList{
    public IntArrayList() {
        super(10);
    }
    @Override
    protected void resize(){
        int newSize = getData().length + getData().length / 2;
        int[] newData = new int[newSize];
        // Copia los elementos del arreglo original al nuevo arreglo.
        // getData(): retorna data, el arreglo fuente.
        // 0: índice inicial en el arreglo fuente.
        // newData: arreglo destino.
        // 0: índice inicial en el arreglo destino.
        // size(): devuelve count que representa la cantidad de elementos a copiar.
        System.arraycopy(getData(), 0, newData, 0, size());
        setData(newData);

    }
}
