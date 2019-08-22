public class StringReverse {
    /*Метод, реализующий рекурсивный разворот строки*/
    public static void reverse(String str, int start, int end){
        String[] str1 = str.split("");
        if(start >= end){
            for (String ch: str1) {
                System.out.print(ch);
            }
        } else{
            String x = str1[start];
            str1[start] = str1[end];
            str1[end] = x;
            String now = "";
            for (String ch: str1) {
                now+=ch;
            }
            reverse(now, start+1, end-1);
        }
    }
}
