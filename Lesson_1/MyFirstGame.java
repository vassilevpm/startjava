public class MyFirstGame {
    public static void main(String[] args) {
        int startNum = 0;
        int endNum = 100;
        int myNum = 0;
        int compNum = 49;
        while(myNum != compNum) {
            myNum += (endNum - startNum) / 2;
            if(myNum > compNum) {
                System.out.println("число " + myNum + " больше того, что загадал компьютер");
                endNum = myNum;
                myNum = startNum;
            } else if(myNum < compNum) {
                System.out.println("число " + myNum + " меньше того, что загадал компьютер");
                startNum = myNum;
            }
        }
        System.out.println("Вы победили!");
    }
}