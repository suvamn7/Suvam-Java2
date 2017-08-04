S/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dllist;

import java.util.NoSuchElementException;

public class Dllist {

    public enum position {

        FIRST, PREVIOUS, FOLLOWING, LAST
    };

    private class node {

        String item;
        node prev;
        node next;
    }

    private node first = null;
    private node current = null;
    private node last = null;
    private int currentPosition = 0;

    public void setPosition(position pos) {
        switch (pos) {

        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public String getItem() throws NoSuchElementException {
        if (current == null) {
            throw new NoSuchElementException();
        } else {
            return current.item;
        }
    }

    public int getPosition() throws NoSuchElementException {
        if (first == null) {
            throw new NoSuchElementException();
        } else {
            return currentPosition;
        }
    }

    public void delete() throws NoSuchElementException {

        if (first == null) {
            throw new NoSuchElementException();
        } else if (first == last) {
            first = null;
            last = null;
            current = null;

        } else if (current == first) {
            first = first.next;
            first.prev = null;
            current = first;

        } else if (current == last) {
            last = last.prev;
            last.next = null;
            current = last;

        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current = current.next;
        }

    }

    public void insert(String item, position pos) throws IllegalArgumentException {

        node n = new node();
        n.item = item;
        switch (pos) {
            case FIRST: {
                if (isEmpty() == true) {
                    last = n;
                    current = null;
                    break;

                }
            

            }
            case PREVIOUS: {
                first.prev= n;
                n.next= first;
                first= n;
                break;
                       
          }
            case LAST: {
                last.next=n;
                n.prev=last;
                last=n;
                break;
                        
            }
                

        }

    }

    public void traverse() {
        node tmp = first;
        while (true) {
            if (tmp == null) {
                break;
            } else if (tmp != null) {
                System.out.println(tmp.item);
                tmp = tmp.next;
            }

        }

    }

    public void traverse2() {
        node tmp = last;
        while (true) {
            if (tmp == null) {
                break;
            } else if (tmp != null) {
                System.out.println(tmp.item);
                tmp = tmp.prev;

            }
        }
    }
}
