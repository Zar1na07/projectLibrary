public class ExamSystem {
    public static void submitScore(String studentName, int score)throws ExamException{
        if( score < 0 || score > 100){
            throw new ExamException("ERROR: score should be from 0 to 100");
        }
        //System.out.print("Student Name: "+studentName + " grade:"+score);
    }
 public static String getGrade(int score){
        if( score >= 90){
            return "A";
        }
        else if( score >= 50){
            return "B";
        }
        else if( score >= 40){
            return "C";
        }
        else {
            return "F";
        }
 }

}
