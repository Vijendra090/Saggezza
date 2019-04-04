package amazon;

public class BinaryHeap {
    int[] arr;
    int hSize;      //no of element in the heap
    int capacity;   //max no of element allowed in the heap

    BinaryHeap(int capacity){
        arr = new int[capacity];
        this.capacity=capacity;
        hSize=0;
    }

    int parent(int i){
        return (i-1)/2;
    }

    int left(int i){
        return (2*i+1);
    }

    int right(int i){
        return (2*i+2);
    }

    void reSizeHeap(BinaryHeap heap, int n){
        heap.capacity= 2*n;
        int[] temp = new int[n];

        for(int i=0;i<heap.hSize;i++)
            temp[i]= heap.arr[i];
    }

    void maxHeapify(BinaryHeap heap, int i){

    }

    void buildHeap(BinaryHeap heap, int[] a, int n){
        if(n> heap.capacity)
            reSizeHeap(heap,n);
        for(int i=0; i<n; i++)
            heap.arr[i]= a[i];
        for(int i=(n/2); i>=0;i--)
            maxHeapify(heap,i);
    }

}
