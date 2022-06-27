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
        int linkToFirst;
        int linkToSecond;
        int linkToThird;
        linkToFirst = first;
        linkToSecond =  second;
        linkToThird = third;
        first =15;
        second =6;
        third =4;
        System.out.print(first+"\n"+second+"\n"+third+"\n"+linkToFirst+"\n"+linkToSecond+"\n"+linkToThird+"\n");

    }
}
