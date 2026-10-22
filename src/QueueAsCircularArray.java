import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueAsCircularArray<T> {
    //Attributes
    private T[] arr;
    private int front , rear , capacity , size;

    @SuppressWarnings("Unchecked")
    QueueAsCircularArray(int capacity){
      this.capacity=capacity;
      this.front=-1;
      this.rear=-1;
      this.size=0;
      this.arr=(T[]) new Object[capacity];
    }

    public void enqueue(T val) throws IndexOutOfBoundsException {
        if(size==capacity){
            throw new IndexOutOfBoundsException("The Queue is full!");
        }
        if(size==0){
            front=0;
        }
            rear=(rear+1)%capacity;
            arr[rear]=val;
            size++;
    }

    public T dequeue() throws NoSuchElementException {
        if(size==0){
            throw new NoSuchElementException("The Queue is empty!");
        }
        T valTest=arr[front];
        if(front==rear){
            front=rear=-1;
            size--;
        }
        else {
            front = (front + 1) % capacity;
            size--;
        }
        return valTest;
    }

    public void getHead(){
        System.out.println( arr[front]);
    }


    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==capacity;
    }

    @Override
    public String toString(){
        String s="[";
        for (int i = 0; i<size; i++) {
            s += arr[i];
            if ((i+1) != size) {
                s += ", ";
            }
        }
        return s+"]";
    }
}
