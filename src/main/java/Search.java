public class Search {

    /*Метод, реализующий поиск букв в таблице по правилам кросворда*/
    public static boolean search(Position word, int k, String[] letters){
        boolean top = false,  right = false, bottom = false,  left = false;
        Position leftWord;
        Position rightWord;
        Position topWord;
        Position bottomWord;
        if(k == letters.length-1){
            main.cout++;
            main.isHave = true;
            return true;
        } else{
        if(word.getI() == 0){
            topWord = new Position(true);
        } else{
            topWord = main.crossword[word.getI()-1][word.getJ()];
        }
        if(word.getI()== main.m-1){
            bottomWord = new Position(true);
        } else{
            bottomWord = main.crossword[word.getI()+1][word.getJ()];
        }
        if(word.getJ() == 0){
            leftWord = new Position(true);
        } else{
            leftWord = main.crossword[word.getI()][word.getJ()-1];
        }
        if(word.getJ() == main.n-1){
            rightWord = new Position(true);
        } else {
           rightWord =  main.crossword[word.getI()][word.getJ()+1];
        }
        if(rightWord.getValue().equals(letters[k+1])){
            right = true;
        }
        if(leftWord.getValue().equals(letters[k+1])){
            left = true;
        }
        if(topWord.getValue().equals(letters[k+1])){
            top = true;
        }
        if(bottomWord.getValue().equals(letters[k+1])){
            bottom = true;
        }
        if(bottom || top || left || right) {
            if(top && !topWord.isEmpty && !topWord.getUse()){
                topWord.setUse(true);
                search(topWord, k+1, letters);
            }
            if(right && !rightWord.isEmpty && !rightWord.getUse()){
                rightWord.setUse(true);
                search(rightWord, k+1, letters);
            }
            if(bottom && !bottomWord.isEmpty  && !bottomWord.getUse()){
                bottomWord.setUse(true);
                search(bottomWord, k+1, letters);
            }
            if(left && !leftWord.isEmpty  && !leftWord.getUse()){
                leftWord.setUse(true);
                search(leftWord, k+1, letters);
            }
        }
            return false;
        }
    }
}
