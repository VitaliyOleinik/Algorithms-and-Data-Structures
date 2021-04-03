public class QuickSort {

    static int [] a;

    private static void quickSort(int left, int right){
        int i = left; // левая граница
        int j = right; // правая граница
        int pointer = QuickSort.a[(left + right) / 2]; // опорная точка

        while (i < j){
            while (a[i] < pointer){ // если число левой границы меньше опорной точки, то берем следующую границу (++)
                i ++;
            }
            while (a[j] > pointer){ // если число правлй границы больше опорной точки, то берем следующую границу (--)
                j --;
            }
            if (i <= j){ // проверка на столкновение границ, если true, то меняем местами a[i] и a[j]
                int temp = a[i]; // создаем временную переменную для перестановки местами чисел
                a[i] = a[j];
                a[j] = temp;
                i ++;
                j --;
            }
        }
        if (left < j){ // работа с левой частью
            quickSort(left, j); // запуск метода рекурсивно для левой части
        }
        if (i < right){ // работа с правой частью
            quickSort(i, right); // запуск метода рекурсивно для правой части
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
