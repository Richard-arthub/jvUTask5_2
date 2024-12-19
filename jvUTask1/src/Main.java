public class Main {
    public static void main(String[] args) {
        stack<Integer> S = new stack<Integer>();
        for (int i = 0; i < 8; i++) {
            S.push(i);
        }

        System.out.println(S.peek());

        for (int i = 0; i < 8; i++) {
            System.out.println(S.pop());
        };
    }
}