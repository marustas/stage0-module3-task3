package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first;
        int second;
        int third;
        first = 1;
        second = 10;
        third = 100;
        System.out.print(first+"\n"+second+"\n"+third+"\n");
        first =15;
        second =6;
        third =4;
        int linkToFirst = first;
        int linkToSecond =  second;
        int linkToThird = third;
        System.out.print(first+"\n"+second+"\n"+third+"\n"+linkToFirst+"\n"+linkToSecond+"\n"+linkToThird+"\n");

    }
}
