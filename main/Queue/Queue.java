package Queue;

public class Queue {
    private int[] arr;
    private int size;
    private int rear;

    // Constructor to initialize the queue with a given size
    public Queue(int n) {
        this.arr = new int[n];
        this.size = n;
        this.rear = -1;  // rear starts at -1 indicating empty queue
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return rear == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Add an element to the queue (enqueue operation)
    public void add(int data) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    // Remove an element from the queue (dequeue operation)
    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int front = arr[0];  // Always remove from front (FIFO)

        // Shift all elements one position forward
        for(int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    // Peek at the front element without removing it
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);  // Create a queue of size 5

        // Add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Queue elements:");
        // Process and display all elements
        while(!q.isEmpty()) {
            System.out.println(q.peek());  // View the front element
            q.remove();                    // Remove the front element
        }
    }
}