import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" massivin uzunlugu: ");
        int n= sc.nextInt();
        System.out.println("massivin elementleri: ");
        int [] arr= new int[n];
        for (int i=0; i<arr.length; i++){
            arr [i]= sc.nextInt();
            System.out.println("arr["+i+"]= "+arr[i]);

        }


change(arr);

    }
    public static void change(int []array){
        for (int i=0; i<array.length; i++){
            System.out.println("arr["+i+"]="+array[i]);;
            for (int j=array.length-1; j>=0; j++){
                
                array[j]=array[i];
                //   arr[i]=arr[j];
                System.out.println(array[j]);
            }
        }
    }

}