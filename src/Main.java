import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] correctAnswers = {"b", "b", "c"};
        String [] userAnswers = new String[3];  //Store user answers.

        System.out.println("What is the capital city of Uganda? ");
        System.out.println("a) Entebbe");
        System.out.println("b) Kampala");
        System.out.println("c) Matugga");
        System.out.println("d) Gulu");

        System.out.println("Who is the president of Uganda? ");
        System.out.println("a) Mayegga");
        System.out.println("b) Museveni");
        System.out.println("c) Bobi Wine");
        System.out.println("d) Jomayi");


        System.out.println("What is the your passion? ");
        System.out.println("a) Music");
        System.out.println("b) Coding");
        System.out.println("c) Sleeping");
        System.out.println("d) Hanging out with friends");

        System.out.println("===================================");

        userAnswers[0] = scan.next();
        userAnswers[1] = scan.next();
       userAnswers[2] = scan.next();

       int score = 0;

       for(int i = 0; i < 3; i++){
          if(userAnswers[i].equalsIgnoreCase(correctAnswers[i])){
              score++;
          }
       }

        System.out.println("Your score is "+ score  + "/3");
    }
}