package Day1;
public class basic14 {
    public static void main(String[] args) {
        int i = 10;
        for(i=10;i > 0;i--) {
            String a = "";
            for(int j = 0; j < i; j++) {
                a = a + "*";
            }
            System.out.println(a);

        }
    }
}