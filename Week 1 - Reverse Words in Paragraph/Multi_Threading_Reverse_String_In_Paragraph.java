import java.util.*;

public class reversestring extends Thread {
    private String para;

    public reversestring(String para) {
        this.para = para;
    }

    @Override
    public void run() {
        String[] words = para.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }
        para = sb.toString().trim();
    }

    public String getPara() {
        return para;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();   
        reversestring thread = new reversestring(str);
        thread.start();
        thread.join()
        String reversedSentence = thread.getPara();
        System.out.println(reversedSentence);
    }
}
