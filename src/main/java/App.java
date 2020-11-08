public class App {
    public static void main(String[] args) {
        int a = 119;
        int b = 290;
        System.out.println(sum(a, b));
        System.out.println(div(a, b));
    }
    public static int sum(int first, int second){
        return first + second;
    }
    public static int div(int first, int second){
        return first - second;
    }
}
