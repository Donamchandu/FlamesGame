import java.util.*;

public class FlamesOriginal {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First name:");
        String s1 = in.nextLine();
        System.out.println("Enter Second name:");
        String s2 = in.nextLine();
        System.out.println();

        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        StringBuilder sb1 = new StringBuilder(s1);// converting to string builder
        StringBuilder sb2 = new StringBuilder(s2);

        int m = sb1.length();
        int n = sb2.length();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sb1.charAt(i) == sb2.charAt(j)) {
                    sb1.replace(i, i + 1, "0");
                    sb2.replace(j, j + 1, "0");
                }
            }
        }

        int x1 = 0;
        int y1 = 0;
        String s3 = "";
        String s4 = "";
        s3 = sb1.toString();
        s4 = sb2.toString();
        System.out.println("First string after striking matched characters:");
        for (int i = 0; i < s3.length(); i++) { // length of string to remove 0 and find the length
            if (s3.charAt(i) != '0') {
                System.out.print(" " + s3.charAt(i));
                x1 += 1;

            }
        }
        System.out.println();

        // System.out.println("Length of First String after striking matched
        // characters:" + x1);
        System.out.println("Second string after striking matched characters:");
        for (int i = 0; i < s4.length(); i++) {
            if (s4.charAt(i) != '0') {
                System.out.print(" " + s4.charAt(i));
                y1 += 1;

            }
        }
        System.out.println();
        // System.out.println("Length of Second String after striking matched
        // characters: " + y1);
        System.out.println();
        int x = x1 + y1; // total length of remaining characters in both the strings
        // System.out.println("Total Length of both the strings is: " + x);
        // System.out.println();

        String flames = "FLAMES";
        StringBuilder sb3 = new StringBuilder(flames);

        char flameResult = 0;

        while (sb3.length() != 1) {
            int y = x % sb3.length();
            String temp;

            if (y != 0) {
                temp = sb3.substring(y) + sb3.substring(0, y - 1); // taking substring (counting purpose)
                // System.out.println(temp);
            } else {
                temp = sb3.substring(0, sb3.length() - 1); // taking substring (counting purpose)
                // System.out.println(temp);
            }
            sb3 = new StringBuilder(temp);
            flameResult = sb3.charAt(0);

        }
        // System.out.println(flameResult);
        System.out.println("The relation between them is:");

        switch (flameResult) {
            case 'F':
                System.out.println("Friends");
                break;
            case 'L':
                System.out.println("Love");
                break;
            case 'A':
                System.out.println("Affection");
                break;
            case 'M':
                System.out.println("Marriage");
                break;
            case 'E':
                System.out.println("Enemies");
                break;
            case 'S':
                System.out.println("Sibling");
                break;

        }
    }
}