package lesson10.hw1;

public class Homework1 {

    public static void main(String[] args) {

        String docNum = args[0];

        System.out.println(SuperPurerStringParser.firstTwoBlocks(docNum));
        System.out.println(SuperPurerStringParser.replaceYYYtostars(docNum));
        System.out.println(SuperPurerStringParser.onlyLetters(docNum));
        System.out.println(SuperPurerStringParser.letters(docNum));
        System.out.println(SuperPurerStringParser.isContainsABC(docNum));
        System.out.println(SuperPurerStringParser.isStartsWith555(docNum));
        System.out.println(SuperPurerStringParser.isEndsWith1A2B(docNum));
    }
}
