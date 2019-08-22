public class FigureReverse {
    static Integer figureReverse(Integer n, int start, int end){
        int result = 0;
        if(start>end){
            int a = (int) (n / Math.pow(10.0, start)) % 10;
            int b = (int) (n % Math.pow(10.0, end+1)) / 10;
            int x = a;
            a = b;
            b = x;
            figureReverse(n, start-1, end+1);
            return result;
        }else{
            return result;
        }
    }
}
