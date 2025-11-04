class program31 {
    int front = 0, rear = -1, size = 5;
    int[] q = new int[size];

    void enqueue(int x) {
        if (rear == size - 1)
            System.out.println("Queue Overflow");
        else
            q[++rear] = x;
    }

    void dequeue() {
        if (front > rear)
            System.out.println("Queue Underflow");
        else
            System.out.println("Dequeued: " + q[front++]);
    }

    void display() {
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++)
            System.out.print(q[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        program31 qu = new program31();
        qu.enqueue(1);
        qu.enqueue(2);
        qu.enqueue(3);
        qu.display();
        qu.dequeue();
        qu.display();
    }
}
