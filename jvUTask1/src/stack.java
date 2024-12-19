public class stack {

    private class node {
        int data;
        node next;

        node(int _data) {
            this.data = _data;
            this.next = null;
        }

        node(int _data, node _next) {
            this.data = _data;
            this.next = _next;
        }
    }

    private node head;

    public stack() { head = null; }

    public boolean isEmpty() { return head == null; }

    public void push (int data) { head = new node(data, head); }

    public int peek() {
        if (!isEmpty()) return head.data;
        else throw new EmptyStackExeption("Стек не содержит элементов.");
    }

    public int pop () {
        if (head != null) {
            node t = head;
            head = head.next;
            return t.data;
        }
        else throw new EmptyStackExeption("Стек не содержит элементов.");
    }
}
