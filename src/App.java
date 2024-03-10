import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        if(a.length() > 9){
            System.out.println("palavrao");
        }else{
            System.out.println("palavrinha");
        }

        sc.close();
    }
}
