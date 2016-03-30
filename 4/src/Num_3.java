/**
 *
 * @author ies1541b on 02.03.2016
 * 
 * Создать метод, который будет сортировать указанный массив
 * по возрастанию любым известным вам способом.
 */
public class Num_3 {
    
      public static void Sort(int A[]) {
          int a;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j < A.length; j++){
                if (A[i] > A[j]){
                    a=A[i];
                    A[i]=A[j];
                    A[j]=a;    
                }
            }
        }            
    }

    
    public static void main(String[] args) {
        int[] A = {0, 4, 5, 1, 7, 3, 8, 2, 6, 9};

        System.out.println("Неотсортированный массив:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();

        Sort(A);

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
