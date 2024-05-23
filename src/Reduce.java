public class Reduce {
    public static void main(String[] args) {

    }

    public static void reduce(int n) {
        int steps = 0;
        while (n > 0){
            if (n % 2 == 0) {
                n = n / 2;
            }else{
                n -= 1;
            }
        }
    }
}
