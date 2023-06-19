package gui.project.practice;

public class codetest00 {

    private int a = 3;
    private int b = 7;
    private String name = "홍길동";

    public codetest00() {
        In i1 = new In();
        i1.na();
    }

    public class In {

        int sum() {
            return a * b + 3;
        }

        void na() {
            System.out.println(name + sum());
        }
    }

    public static void main(String[] args) {
        new codetest00();
    }
}
