import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static  Position[][] crossword;
    static Integer m;
    static Integer n;
    static String[] letters;
    static String word;
    static boolean isHave = false;
    static int cout = 0;
    public static void main(String[] args) {

        /* Проект с методами, реализующими некоторые рекурсивные алгоритмы */
        /*
        Тест для решения задачи "проверка наличия слова в двумерной таблице по закнонам кросворда"
        ******************************* НАЧАЛО СОЗДАНИЯ РАНДОМНОГО ДВУМЕРНОГО МАССИВА, ВВОДА ЕГО ПАРАМЕТОРВ И ИСКОМОГО СЛОВА *****************************************************
        String[]  variants = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
        String[] table = {
                "ф", "б", "т", "т", "а",
                "е", "а", "а", "а", "ф",
                "р", "а", "б", "а", "р",
                "и", "а", "а", "а", "е",
                "ф", "у", "л", "у", "т",
        };
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        int k = 0;
        crossword = new Position[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //crossword[i][j] = new Position(variants[rnd(0, 25)], i, j);
                crossword[i][j] = new Position(table[k], i, j);
                k++;
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(crossword[i][j].getValue() + " ");
            }
            System.out.print("\n");
        }
        Scanner w = new Scanner(System.in);
        word = w.next();
        letters = word.split("");
        System.out.println(word);
        ******************************** КОНЕЦ СОЗДАНИЯ РАНДОМНОГО ДВУМЕРНОГО МАССИВА, ВВОДА ЕГО ПАРАМЕТОРВ И ИСКОМОГО СЛОВА ******************************************************

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(crossword[i][j].getValue().equals(letters[0])){
                    crossword[i][j].setUse(true);
                    Search.search(crossword[i][j], 0, letters);
                }
            }
        }
        if(isHave){
            System.out.println("Слово " + main.word + " есть в таблице, оно встречается " + cout + " раз(а)");
        } else{
            System.out.println("Словa " + main.word + " нет в таблице");
        }
        */
        /* Тест для разворота слова рекурсией
       String word = "Транквилизатор";
       StringReverse.reverse(word, 0, word.length()-1);*/
        /* Тест для поиска чисел Фиббоначи
        int n = 8;
        System.out.println(Fibonachi.fib(n));*/
        /* Тест для демонстрации работы быстрой стортировки Хоара
       Integer[] mass = {30, 1, 15, 8, 6, 65, 81, 55};
       int size = mass.length;
       QuickSort.quickSort(mass, 0, size-1);*/
        int n = 2578;
        System.out.println(FigureReverse.figureReverse(n, 3,0));

    }
    public static Integer rnd(int min, int max){
        max -=min;
        return (int)(Math.random()* ++max)+min;
    }

}
