public class Factorial {
    public static int fac(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
