import java.util.Scanner;

// Algorithms and Data Structures
// BBBBBBBBBBBYBYYYYBBBBBBBBBB

// Tinkoff
// BYBYBYB

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        String s = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        String b = scanner2.nextLine();
        int a = searchForBadWords(s,b);
        System.out.println(a);
    }
    public static int searchForBadWords( String s, String b) {
        int lowerBound = 0;
        int count = 0;
        String[] words = s.split(" ");
        int upperBound = words[0].length();
        String[] c = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            c[i] = b.substring(lowerBound, upperBound);
            lowerBound = lowerBound + words[i].length();
            count++;
            if (count < words.length) upperBound = upperBound + words[i + 1].length();
            else break;
        }
        int search = 0;
        for (int i = 0; i < words.length; i++) {
            char[] characterArray = c[i].toCharArray();
            if (characterArray[i] == characterArray[i + 1])
                search++;
           }
        return search;
    }
}