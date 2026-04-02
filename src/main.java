import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    static void registerUser(String username, int age) {
        if (username == "" || username == null) {
            throw new NullPointerException("username is null");
        }
        if (age < 18) {
            throw new IllegalArgumentException("User must be 18 or older.");
        }
    }

    static int readNumber(String input) {
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        try {
//            int result=n/m;
//            System.out.println(result);
//        }catch (ArithmeticException e){
//            System.out.println("error cannot divide by zero");
//            System.out.println("message: "+e.getMessage());
//        }


//        int []arr={5,4,3,2,1};
//        int a=sc.nextInt();
//        try{
//            System.out.println(arr[a-1]);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Invalid index! Please enter a number between 0 and 4.");
//        }finally{
//            System.out.println("Thank you for using the Grade Finder.");
//        }


//           try{
//               String username = sc.nextLine();
//               int age = sc.nextInt();
//               registerUser(username, age);
//           }catch(NullPointerException e){
//               System.out.println(e.getMessage());
//           }
//           catch(IllegalArgumentException e){
//               System.out.println(e.getMessage());
//           }
//           finally {
//               System.out.println("you are done");
//           }

//           String []inputs={"101","hii"};
//           for(String input:inputs){
//               try{
//                   int number=readNumber(input);
//                   System.out.println("converted: "+number);
//               }catch(Exception e){
//                   System.out.println("error");
//               }
//           }

//        String name = sc.nextLine();
//        int score=sc.nextInt();
//        try{
//            ExamSystem.submitScore(name, score);
//            System.out.print("name: "+ name+ExamSystem.getGrade(score));
//        }catch(ExamException e){
//            System.out.println(e.getMessage());
//        }

//        String []name={"Zarina","nidwa","duioacd"};
//        int []score={90,-10,89};
//        for(int i=0;i<name.length;i++){
//            try{
//                ExamSystem.submitScore(name[i],score[i]);
//                String grade=ExamSystem.getGrade(score[i]);
//                System.out.println("name: "+name[i]+grade);
//            }catch(ExamException e){
//                System.out.println(e.getMessage());
//            }
//        }



    }
}
