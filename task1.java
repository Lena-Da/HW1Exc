import java.util.Arrays;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

public class task1{
    public static void main(String[] args) {
        int[] array = {4, 10, 3};
        int[] array2 = {1, 11};
        System.out.println(Arrays.toString(diffElem(array, array2)));
    }

    public static int[] diffElem(int[] array, int[] array2){
        int[] res = new int[array.length];
        if(array.length != array2.length){
            System.out.println("Разная длина массивов");
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = array[i] - array2[i];
        }
        return res;
    }
}