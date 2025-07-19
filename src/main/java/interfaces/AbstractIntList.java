package interfaces;

public abstract class AbstractIntList implements intList{
    protected int[] data;
    protected int count;

    public AbstractIntList(int initialSize) {
        this.data = new int[initialSize];
        this.count = 0;
    }

    public void add(int number){
        if(count == data.length){
            resize();
        }
        data[count++] = number;
    }

    public int get(int id){
        if (id < 0 || id >=count){
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return data[id];
    }

    public int size() {
        return count;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // Método que las subclases deben implementar
    protected abstract void resize();
}
