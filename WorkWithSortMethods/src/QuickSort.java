public class QuickSort {

    static int [] a;

    private static void quickSort(int left, int right){
        int i = left;
        int j = right;
        int pointer = QuickSort.a[(left + right) / 2];

        while (i < j){
            while (a[i] < pointer){
                i ++;
            }
            while (a[j] > pointer){
                j --;
            }
            if (i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i ++;
                j --;
            }
        }
        if (left < j){
            quickSort(left, j);
        }
        if (i < right){
            quickSort(i, right);
        }
    }

    public static void main(String[] args) {
        QuickSort.a = new int[]{23, 4, 1, 0, 22, 90, 34, 100, 324, 3, 6, 7, 8, 9};
        quickSort(0, a.length - 1);
        for(int i: a){
            System.out.print(i + " ");
        }
    }
}
