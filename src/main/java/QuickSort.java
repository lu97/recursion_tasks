public class QuickSort {
    /*Метод, реализующий быструю сортировку Хоара*/
    static void quickSort(Integer[] mass, int left, int right) {
        int center = (left + right) / 2;
        int base = mass[center];

        if(left>=right){
            return;
        }
        int i = left;
        int j = right;
        while (i < j){
            while (mass[i]<=base && i<center){
                i++;
            }
            while (mass[j]>=base && j>center){
                j--;
            }
            if(i<j){
                int x = mass[i];
                mass[i] = mass[j];
                mass[j] = x;
                if(i == center)
                    center = j;
                else if(j == center)
                        center = i;

            }
        }
        quickSort(mass, left, center);
        quickSort(mass, center+1, right);

        for (int k : mass) {
            System.out.print(k + " ");
        }
        System.out.println("\n");
    }

}
