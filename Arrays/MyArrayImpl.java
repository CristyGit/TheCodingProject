// This class is an non working example on how arrays works in 
// the background
class MyArrayImpl {
    private int size = 0;
    private Object[] data;

    MyArrayImpl() {
        this.size = 0;
        this.data = new Object[10];
        // items = new Object[DEFAULT_CAPACITY];
    }

    public Object get(int index) {
        return this.data[index];
    }

    public void addLast(int item) {
        this.data[this.size] = item;
        this.size++;
    }

    public Object deleteLast() {
        Object lastEle = this.data[this.size - 1];
        this.delete(this.size - 1);
        this.size--;
        return lastEle;
    }

    public void add(int index, int item) {
        this.size++;
        //Fix
        shiftEleRight(index, item);
    }

     public void shiftEleRight(int index, int item) {
    //     // 1 3 4
    //     // 1 2 3 4
    //     for (int i = index; i < this.length; i++) {
    //         int temp = this.data[index];
    //         this.data[index] = item;
    //         this.data[index+1] = temp;
    //     }
     }

    public void delete(int index) {
        Object item = this.data[index];
        this.shiftEleLeft(index);
    }

    public void shiftEleLeft(int index) {
        for (int i = index; i < this.size; i++) {
            this.data[i] = this.data[i+1];
        }
        // Fix
        //this.delete(this.size - 1);
        this.size--;
    }
}