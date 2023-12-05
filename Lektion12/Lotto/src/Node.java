public class Node {

    final int number;

    Node next = null;

    public Node(int number) {
        this.number = number;
    }

    public void add(Node n) {
       if(next == null) {

         next = n;
       } else {
         next.add(n);
       }
    }

    public Node insert(Node n) {
        if(this.number < n.number) {
            if(next == null) {
                next = n;
                return this;
            }
            next = next.insert(n);
            return this;
        } else {
            n.next = this;
            return n;
        }
    }

    public Node delete(Node n) {
        if (this.number == n.number) {
            return next;
        }
        next = next.delete(n);
        return this;
    }

    public void print() {
        System.out.println(number);
        if(next != null) next.print();
    }

    public Node ziehen() {
        if (Math.random() < (1.0 / 49.0)) {
            return this;
        } else {
            if(next != null) {
                return next.ziehen();
            } else {
                return null;
            }
        }
    }
}