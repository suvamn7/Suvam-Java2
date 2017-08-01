package queue;

import java.util.NoSuchElementException;

class Queue {

    private class Node {

        double price;
        Node next;
    }
    private Node head = null;
    private Node tail = null;

    public boolean isempty() {
        return (head == null);
    }

    public void insert(double newprice) {
        Node n = new Node();
        n.price = newprice;
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }
        public double remove() {

            if (head== null){
                throw new NoSuchElementException();
            }
            else if (head== tail) {
                double tmp = head.price;
                head= null;
                tail= null;
                return tmp;
               }
            else { 
                double tmp = head.price;
                head= head.next;
                return tmp;
            }
            
            
        }
        
        public double peek() {
          if (head== null){
              throw new NoSuchElementException();
          }
            return head.price;
        }
        
        
    

}
