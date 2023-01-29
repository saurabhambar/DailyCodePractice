import java.util.*;

class Capitalise {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);
    }

    // TODO: Implement this method
    static String capitalise(String str) {
        if(str.length() == 0)
        return null;

        String words[] = str.split("\\s");
        String capitalWord = "";
        for(String w : words){
            String first = w.substring(0,1);
            String rest = w.substring(1);
            capitalWord += first.toUpperCase() + rest + " "; 
        }
        return capitalWord;
    }
}

// Input : 
// the quick Brown fox jumps over The lazy dog.
// Output :
// The Quick Brown Fox Jumps Over The Lazy Dog. 