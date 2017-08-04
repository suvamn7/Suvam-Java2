/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//memory for the rooms visited
//ability to revisit other rooms 

class stack {

    public room[] stack;
    public int size;

    stack() {
        stack = new room[100];
    }

    public void push(room d) {
        stack[size++] = d;
    }

    public room pop() {
        room temp = stack[size - 1];
        stack[size - 1] = null;
        size--;
        return temp;
    }

    public room peek() {
        return stack[size - 1];
    }

    public int size() {
        return size;
    }

}

class Option {

    String description;
    String tag;

}

class room {

    public ArrayList<String> description;
    public ArrayList<Option> options;
    String name;

    room() {
        description = new ArrayList();
        options = new ArrayList();

    }

    public void print() {
        System.out.println(name);
        for (String s : description) {
            System.out.println(s);
        }
        for (Option o : options) {
            //todo: Make it so it prints letter a: first option, letter b: second option, etc
            System.out.println(o.description);
            System.out.println(o.tag);
        }
    }

}

public class FinalProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<room> rooms = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader("test file"))) {

            String currentLine = reader.readLine();

            room r = new room();
            while (currentLine != null) {
                if (currentLine.equals("")) {
                    rooms.add(r);
                } else if (currentLine.charAt(0) == 'r') {
                    r = new room();
                    r.name = currentLine.substring(1, currentLine.length());

                } else if (currentLine.charAt(0) == 'd') {
                    r.description.add(currentLine.substring(1, currentLine.length()));
                } else if (currentLine.charAt(0) == 'o') {
                    Option o = new Option();
                    o.description = currentLine.substring(1, currentLine.length());
                    currentLine = reader.readLine();
                    o.tag = currentLine.substring(1, currentLine.length());
                    r.options.add(o);
                }

                currentLine = reader.readLine();
            }
            rooms.add(r);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stack s = new stack();
        s.push(rooms.get(0));
        //push first room onto stack
        //TODO: make a sort function, call it here

        while (true) {

            s.peek().print();
            String input = sc.nextLine();
            if (input.equals("a")) {
                Option destination;
                destination = s.peek().options.get(0);
                for (room r : rooms) {
                    if (r.name.equals(destination)) {
                        room d = r;
                        s.push(d);
                    }

                }
            } else if (input.equals("b")) {
                Option destination2;
                destination2 = s.peek().options.get(1);
                for (room c : rooms) {
                    if (c.name.equals(destination2)) {
                        room v = c;
                        s.push(v);
                    }
                }
            } else if (input.equals("c")) {
                Option destination3;
                destination3 = s.peek().options.get(2);
                for (room g : rooms) {
                    if (g.name.equals(destination3)) {
                        room b = g;
                        s.push(b);

                    }
                }
            } else if (input.equals("d")) {
                Option destination4;
                destination4 = s.peek().options.get(3);
                for (room w : rooms) {
                    if (w.name.equals(destination4)) {
                        room u = w;
                        s.push(u);

                    }
                }
            } else if (input.equals("e")) {
                Option destination5;
                destination5 = s.peek().options.get(4);
                for (room t : rooms) {
                    if (t.name.equals(destination5)) {
                        room h = t;
                        s.push(h);
                    }
                }
            } else if (input.equals("f")) {
                Option destination6;
                destination6 = s.peek().options.get(5);
                for (room m : rooms) {
                    if (m.name.equals(destination6)) {
                        room n = m;
                        s.push(n);
                    }
                }
            } else if (input.equals("g")) {
                Option destination7;
                destination7 = s.peek().options.get(6);
                for (room k : rooms) {
                    if (k.name.equals(destination7)) {
                        room j = k;
                        s.push(j);
                    }
                }
            } else if (input.equals("h")) {
                Option destination8;
                destination8 = s.peek().options.get(7);
                for (room x : rooms) {
                    if (x.name.equals(destination8)) {
                        room e = x;
                        s.push(e);
                    }
                }
            } else if (input.equals("i")) {
                Option destination9;
                destination9 = s.peek().options.get(8);
                for (room f : rooms) {
                    if (f.name.equals(destination9)) {
                        room a = f;
                        s.push(a);
                    }
                }
            } else if (input.equals("j")) {
                Option destination10;
                destination10 = s.peek().options.get(9);
                for (room q : rooms) {
                    if (q.name.equals(destination10)) {
                        room z = q;
                        s.push(z);
                    }
                }
            } else if (input.equals("k")) {
                Option destination11;
                destination11 = s.peek().options.get(10);
                for (room p : rooms) {
                    if (p.name.equals(destination11)) {
                        room l = p;
                        s.push(l);
                    }
                }
            } else if (input.equals("l")) {
                Option destination12;
                destination12 = s.peek().options.get(11);
                for (room R : rooms) {
                    if (R.name.equals(destination12)) {
                        room D = R;
                        s.push(D);
                    }
                }
            } else if (input.equals("r")) {
                s = new stack();
                s.push(rooms.get(0));
            } else if (input.equals("q")) {
                break;
            } else if (input.equals("y")) {
                for (room r : rooms) {
                    r.print();
                }
            } else if (input.equals("z")) {
                s.pop();

            }
        }

    }
}
