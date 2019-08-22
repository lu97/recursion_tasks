public class Position {
   private String value;
   private boolean isUse;
   private boolean isBlock;
   private Integer i;
   private Integer j;
   boolean isEmpty = false;
    public Position(String value, Integer i, Integer j){
        this.value = value;
        this.i = i;
        this.j = j;
        isUse = false;
        isBlock = false;
        isEmpty = false;
    }
    public Position( String value){
        this.value = value;
    }

    public Position(boolean logic){
        this.isEmpty = logic;
        this.value = "";
    }
    public Position(Position position){
        this.value = position.getValue();
        this.i = position.getI();
        this.j = position.getJ();
        isUse = false;
        isBlock = true;
    }


    public String getValue() {
        return value;
    }
    public void setUse(boolean use) {
        this.isUse = use;
    }
    public void setBlock(boolean start) {
        this.isBlock = start;
    }
    public boolean getUse(){
        return isUse;
    }
    public  boolean getBlock(){
        return isBlock;
    }

    public Integer getI() {
        return i;
    }
    public Integer getJ() {
        return j;
    }

    @Override
    public String toString() {
        return value + " " + i + " " + j;
    }
}
