public class ArrayQueue implements Queue {

    int first = 0;
    int last = 0;
    Object arr[] = new Object[10];


    void growArray() {
        Object[] arrcopy = new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            arrcopy[i] = arr[i];
        }
        arr = arrcopy;
    }
    public Object dequeue(){
        return arr[first++];

    }
    public void enqueue(Object item){
        if(last>= arr.length){
            growArray();
        }
        arr[last++] = item;

    }
    public boolean empty(){
        return first == last;

    }
}
