import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        String output = "";
        String current;
        int frequency = 0;

        System.out.println("Enter a word: ");
        input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            current = input.substring(i, i+1);
            if(!input.substring(0,i).contains(current)) {
                frequency++;
                output = current;
            }
        }
        System.out.println("Output: " + output + " Frequency: " + frequency);
    }
}