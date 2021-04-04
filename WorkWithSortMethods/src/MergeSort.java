public class MergeSort {

    private static int a[];

    private static void merge(int left, int middle, int right){
        int p1 = middle - left + 1; // начало левой части
        int p2 = right - middle; // начало правой части
        int x1 = 0, x2 = 0;

        int k = left;

        int [] l = new int[p1];
        int [] r = new int[p2];

        for (int i = 0; i < p1; i ++){
            l[i] = a[left + i];
        }
        for (int i = 0; i < p2; i ++){
            r[i] = a[middle + 1 + i];
        }

        while (x1 < p1 && x2 < p2){
            if (l[x1] <= r[x2]){
                a[k] = l[x1];
                x1 ++;
            } else {
                a[k] = r[x2];
                x2 ++;
            }
            k ++;
        }

        while (x1 < p1){
            a[k] = l[x1];
            k ++;
            x1 ++;
        }

        while (x2 < p2){
            a[k] = r[x2];
            k ++;
            x2 ++;
        }

    }
    private static void mergeSort(int left, int right){
        if(left < right){
            int middle = (left + right) / 2; // нахождение середины
            mergeSort(left, middle); // делим элементы левой стороны на части
            mergeSort(middle + 1, right); // делим элементы правой стороны на части
            merge(left, middle, right); // объединение частей
        }
    }

    public static void main(String[] args) {
        a = new int[]{6, 58, 63, 14, 256, 3, 1, 10, 21, 40, 11};
        mergeSort(0, a.length - 1);
        for (int i: a){
            System.out.print(i + " ");
        }
    }
}
