public class CustomerService {
    String[] queue;
    int size;
    int front;
    int rear;
    int count;

    // Constructor
    public CustomerService(int capacity) {
        queue = new String[capacity];
        size = capacity;
        front = 0;
        rear = 0;
        count = 0;
    }

    // Add customer to the queue
    public void addCustomer(String name) {
        if (count == size) {
            System.out.println("Queue is full. Cannot add " + name);
        } else {
            queue[rear] = name;
            rear++;
            count++;
            System.out.println("Added: " + name);
        }
    }

    // Serve customer from the queue
    public void serveCustomer() {
        if (count == 0) {
            System.out.println("No customers to serve");
        } else {
            System.out.println("Serving " + queue[front]);
            front++;
            count--;
        }
    }
}

