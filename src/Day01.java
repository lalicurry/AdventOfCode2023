import java.util.ArrayList;

public class Day01 {
    public static void puzzleOne(ArrayList<String> puzzle){

        int runningSum = 0;

        for(String current : puzzle)
        {
            String numbers = "";
            for(int i =0; i<current.length(); i++)
            {
                if(Character.isDigit(current.charAt(i))){
                    numbers+=Character.toString(current.charAt(i));
                    break;
                }
            }
            for(int i =current.length()-1; i>=0; i--)
            {
                if(Character.isDigit(current.charAt(i))){
                    numbers+=Character.toString(current.charAt(i));
                    break;
                }
            }

            runningSum += Integer.parseInt(numbers);

        }


        System.out.println("Answer is: " + runningSum);
    }
}
