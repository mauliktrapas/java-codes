public class QueueTest {

    public static void main(String[] args) {
        QueueLinkedList<Integer> q = new QueueLinkedList();
	java.util.Scanner sc = new java.util.Scanner(System.in);
	for (int i=0; i<4; i++)    // Take 4 integers
            q.Enqueue(sc.nextInt());
        for (int i=0; i<5; i++)    // Dequeue one extra
            System.out.println(q.dequeue());
        QueueStack<Integer> q1 = new QueueStack();
        for (int i=0; i<4; i++)
            q1.enqueue(sc.nextInt());
        for (int i=0; i<5; i++)
            System.out.println(q1.dequeue());
    }
}
