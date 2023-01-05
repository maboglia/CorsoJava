# Queue - Coda, pila

## Implementazione di Queue: LinkedList

```java
        Queue<Integer> q
            = new LinkedList<>();
 
        // Adds elements {0, 1, 2, 3, 4} to
        // the queue
        for (int i = 0; i < 5; i++)
            q.add(i);
 
        // Display contents of the queue.
        System.out.println("Elements of queue " + q);
 
        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);
 
        System.out.println(q);
 
        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);
 
        // Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue-"+ size);

```

---

## Implementazione di Queue: PriorityQueue

Esempio di Queue.

```java
Queue<String> coda = new PriorityQueue<>();

//puoi aggiungere elementi  con add() e con offer()

for (int i=0; i<50; i++) {
 coda.offer("Stringa #" + i);
}

//puoi rimuovere con remove()


//con peek() ricevo l'elemento manon lo rimuovo

//con poll() lo rimuovo

while (!coda.isEmpty()) {
 System.out.println(coda.poll());
}
```

La PriorityQueue è una coda che estrae gli elementi secondo la priorità assegnata.

---

## Implementazione di Queue: Deque

Deque è un'interfaccia che estende le funzionalità di Queue

```java
Deque<String> deque
            = new LinkedList<String>();
  
        // We can add elements to the queue
        // in various ways
  
        // Add at the last
        deque.add("Element 1 (Tail)");
  
        // Add at the first
        deque.addFirst("Element 2 (Head)");
  
        // Add at the last
        deque.addLast("Element 3 (Tail)");
  
        // Add at the first
        deque.push("Element 4 (Head)");
  
        // Add at the last
        deque.offer("Element 5 (Tail)");
  
        // Add at the first
        deque.offerFirst("Element 6 (Head)");
  
        System.out.println(deque + "\n");
  
        // We can remove the first element
        // or the last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing "
                           + "first and last: "
                           + deque);
```

---

```java
        // Initializing a deque
        Deque<String> dq = new ArrayDeque<String>();
 
        // add() method to insert
        dq.add("One");
 
        // addFirst inserts at the front
        dq.addFirst("Two");
 
        // addLast inserts at the back
        dq.addLast("Three");
 
        // print elements to the console
        System.out.println("ArrayDeque : " + dq);
 
        // remove element as a stack from top/front
        System.out.println(dq.pop());
 
        // remove element as a queue from front
        System.out.println(dq.poll());
 
        // remove element from front
        System.out.println(dq.pollFirst());
 
        // remove element from back
        System.out.println(dq.pollLast());
```
