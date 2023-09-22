import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class clazz {
    public static void main(String[] args) {
        arr();
//     Scanner input = new Scanner(System.in);
//        System.out.println("nhập cạnh 1");
//        int a = input.nextInt();
//        System.out.println("nhập cạnh 2");
//        int b = input.nextInt();
//        System.out.println("nhập cạnh 3");
//        int c = input.nextInt();
//        if (a == b && a != c){
//            System.out.println(" tam giác cân");
//        } else if (a == b && a == c) {
//            System.out.println("tam giác đều");
//        } else if ((a != b && b != c) && (c != a)) {
//            System.out.println("tam giác thường");
//        }
//        b2
//        Scanner input = new Scanner(System.in);
//        double diem = input.nextDouble();
//        if (diem < 5){
//            System.out.println(" học sinh ngu");
//        } else if (diem < 8) {
//            System.out.println(" học sinh khá");
//        } else if (diem > 8) {
//            System.out.println(" học sinh khôn ");
//        }
////        b3
//        Scanner input = new Scanner(System.in);
//        System.out.println(" nhập a");
//        int a = input.nextInt();
//        System.out.println(" nhập b ");
//        int b = input.nextInt();
//        for (int i = a; i < b; i++) {
//            int tem = (int)Math.sqrt(i);
//            if (tem*tem == i ){
//                System.out.println("số chính phương là"+ i);
//            }
//        }
//        b4
//        Scanner input = new Scanner(System.in);
//        System.out.println(" nhập x");
//        int x = input.nextInt();
//        System.out.println(" nhập y ");
//        int y = input.nextInt();
//        int a = 0;
//        for (int i = x; i <=y; i++) {
//             a += (i*i);
//        }
//        System.out.println(" tổng các số bình phương x đến y là"+ a);
//        b5.1
//        Scanner input = new Scanner(System.in);
//        System.out.println(" nhập n");
//        int n = input.nextInt();
//        int s = 0;
//        for (int i = 1; i < n; i++) {
//            s += i*(i+1);
//        }
//        System.out.println("s là"+s);
//        5.2
//        Scanner input = new Scanner(System.in);
//        System.out.println(" nhập n");
//        int n = input.nextInt();
//        double s = 0;
//        for (int i = 1; i < n; i++) {
//            s += (2*i+1)/(2*i+2);
//        }
//        System.out.println("s là" + s);
//        5.3
//        Scanner input = new Scanner(System.in);
//        System.out.println(" nhập n");
//        int n = input.nextInt();
//        int sum = 100;
//        for (int i = 1; i < n; i++) {
//            sum += i*(i +1)/(n+1)*(n+2);
//        }
//        System.out.println(" tồng là" + sum);
//        6.1
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập a");
//        int a = input.nextInt();
//        for (int i = 1; i <= a; i++) {
//            if(a % i == 0){
//                System.out.println("ước của a là" + i);
//            }
//        }
//        6.1.2
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập a");
//        int a = input.nextInt();
//        for (int i = a; i <100; i++) {
//            if (i % a == 0){
//                System.out.println("bội số của a là" + i);
//            }
//        }
//        6.2.1
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập a");
//        int a = input.nextInt();
//        int max = 0;
//        for (int i = 1; i < a; i++) {
//            if ((a % i == 0 && i % 2 != 0)){
//                max = i;
//            }
//        }System.out.println("max là" + max);
//        6.2.2
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập a");
//        int a = input.nextInt();
//        int min = 0;
//        for (int i = 100; i >= a; i--) {
//            if (i % a == 0 && i % 2 == 0) {
//                min = i;
//            }
//        }
//        System.out.println(min);
//        6.3
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập a");
//        int a = input.nextInt();
//        System.out.println("nhập b");
//        int b = input.nextInt();
//        System.out.println(ucln(a,b));

//        if (a > b){
//            min = b;
//        }
//        else {
//            min = a;
//        }
//        for (int i = min; i > 0; i--) {
//            if ((min % i == 0 && a % i == 0) ){
//                max = i;
//                break;
//            }
//
//        }
//        System.out.println(max);


    }
//    public static int ucln(int a, int b){
//        int ucl = 1;
//        for (int i = 1; i < a && i < b; i++) {
//            if (a % i == 0 && b % i == 0){
//                ucl = i;
//            }
//        }return ucl;

    //        public static void bubbleSort(){
//        int[] numbers = new int[]{4,2,6,0,9};
//        for (int i = 1; i <numbers.length ; i++) {
//            for (int j = 0; j < numbers.length-1; j++) {
//                if (numbers[j] > numbers[j +1]){
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j +1];
//                    numbers[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//    public static void selectionSort(){
//        int[] numbers = new int[]{4,2,6,0,9};
//        for (int i = 0; i < numbers.length; i++) {
//            int minIndex = i;
//            for (int j = i++; j < numbers.length; j++) {
//                if (numbers[j] < numbers[minIndex]){
//                    minIndex = j;
//                }
//
//            }
//        }
//    public static void selectionSort() {
//        int[] numbers = new int[]{4, 2, 6, 0, 9};
//        for (int i = 1; i < numbers.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (numbers[j] < numbers[j - 1]) {
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j - 1];
//                    numbers[j - 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//    b9.1
//    public static void Money (){
//        int money1 = 5000;
//        int money2 = 2000;
//        int money3 = 1000;
//        int sumMoney = 20000;
//        int count = 0;
//        for (int i = 0; i < sumMoney/money1; i++) {
//            for (int j = 0; j < sumMoney/money2; j++) {
//                for (int k = 0; k < sumMoney/money3; k++) {
//                    if ((i * money1) + (j * money2) + (k * money3) == 20000){
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//    public static List<Integer> Plan() {
//        int[] Arr = {5000, 2000, 1000};
//        double SumMoney = 20000;
//        List<Integer> newArr = new ArrayList<Integer>();
//        for (int i = 0; i < Arr.length; i++) {
//            double x = SumMoney / Arr[i];
//            if (SumMoney % Arr[i] == 0) {
//                if (x > 1) {
//                    x = x - 1;
//                }
//            } else {
//                x = Math.floor(x);
//            }
//            newArr.add((int) x);
//            SumMoney = SumMoney - x * Arr[i];
//        }
//        return newArr;
//    9.3
//    public static void abc(){
//        Scanner input = new Scanner(System.in);
//        System.out.println(" nhập a");
//        int a = input.nextInt();
//        System.out.println("nhập b");
//        int b = input.nextInt();
//        System.out.println("nhập c");
//       int c = input.nextInt();
//        int[] arr = new int[]{a,b,c};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                for (int k = 0; k < arr.length; k++) {
//                    if (arr[i] != arr[j] && arr[j]!= arr[k] && arr[i]!=arr[k]){
//                        System.out.println(""+arr[i]+arr[j]+arr[k]);
//                    }
//                }
//            }
//        }
//    10.1
//    public static void abc() {
//        Scanner input = new Scanner(System.in);
//        System.out.println(" nhập a");
//        int a = input.nextInt();
//        System.out.println("nhập b");
//        int b = input.nextInt();
//        System.out.println("nhập c");
//        int c = input.nextInt();
//        int[] arr = new int[]{a, b, c};
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                for (int k = 0; k < arr.length; k++) {
//                    System.out.println(""+arr[i]+arr[j]+arr[k]);
////                    if (arr[i] != arr[j] && arr[i]!= arr[k] && arr[j] != arr[k]){
////
////                    }
//                }
//            }
//        }
//    11
//    public static void arr(){
//        int[] array = {3,4,7,3,8,5,14,6};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < array[i+1]){
//                System.out.println(array[i+1]);
//            }
//        }

    //    b12
//    public static void arr() {
//        int sumc = 0;
//        int suml = 0;
//        int[] array = {3, 4, 27, 3, 8, 5, 14, 6};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                suml += array[i];
//            } else{
//                sumc += array[i];
//            }
//        }
//        if (suml < sumc) {
//            System.out.println("tổng lẻ nhỏ hơn tổng chẵn");
//        } else if (suml>sumc){
//            System.out.println(" tổng phần tử lẻ lớn hơn tổng chẵn");
//        }
//    13.2
//    public static void arr() {
//        int max = 0;
//        int max2 = 0;
//        int[] Array = {3, 4, 27, 3, 8, 5, 14, 6};
//        for (int i = 0; i < Array.length; i++) {
//            if (max < Array[i]){
//                max = Array[i];
//            } else if (max2 < Array[i] && max2 < max) {
//                max2 = Array[i];
//            }
//        }
//        System.out.println(max2);
//    13.3
        public static void arr() {
        int max = 0;
        int[][] Array = {{5,8,9,4,12},{3, 8, 5, 14, 6}};
            for (int i = 0; i <Array.length; i++) {
                for (int j = 0; j < Array[i].length; j++) {
                    if (Array[i][j] > max){
                        max = Array[i][j];
                    }
                }
            }
            System.out.println(max);
//     15
//
    }
}


