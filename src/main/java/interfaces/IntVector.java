package interfaces;

public class IntVector extends AbstractIntList{
    public IntVector() {
        super(20);
    }

    @Override
    protected void resize() {
        int newSize = getData().length * 2; // doble de tamaño
        int[] newData = new int[newSize];
        // Copia los elementos del arreglo original al nuevo arreglo.
        System.arraycopy(getData(), 0, newData, 0, size());
        setData(newData);
    }
}
