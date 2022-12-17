
public class This {
    int i = 10;

    public void demo(int i) {
        this.i = i;
        System.out.println(i);
    }

    public static void main(String args[]) {
        This t = new This();
        t.demo(20);

    }
}
