////Q1,array sum
import java.util.Scanner;
public static  void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter size of array:");
//    int n = sc.nextInt();
//    int [] arr = new int[n];
//    int sum = 0;
//
//    System.out.println("Enter array elements:");
//    for(int i=0;i<n;i++){
//        arr[i]=sc.nextInt();
//        sum+=arr[i];
//    }
//    System.out.println("Sum = " + sum);


//Q2,find biggest element;
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter size of array");
//    int n = sc.nextInt();
//    int[] arr = new int[n];
//
//    System.out.println("Enter array elements");
//    for (int i = 0; i < n; i++) {
//        arr[i] = sc.nextInt();
//    }
//
//    int max = arr[0];
//    for (int i = 1; i < n; i++) {
//        if (arr[i] > max) {
//            max = arr[i];
//        }
//    }
//    System.out.println("Max array elements:" + max);
//


//Q3. Count Even and Odd Numbers
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();
    int [] arr = new int[n];
    int even = 0;
    int odd = 0;

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        if(arr[i]%2==0)
            even++;
        else
            odd++;
    }
    System.out.println("Even:" + even);
    System.out.println("Odd:" + odd);



















}
