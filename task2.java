//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class task2 {
    public static void main(String[] args) {
        met1(9,0);

        met2("r");

        int[] arr = {1,2};
        met3(arr);
        
    }

    public static int met1(int a, int b){
        return a/b;
    }

    public static int met2(String str){
        return Integer.parseInt(str);
    }

    public static int met3(int[] arr){
        return arr[3];
    }
}
