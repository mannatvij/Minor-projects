import java.util.Scanner;


public class Passwordgenarator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many random passwords do you want to generate? Please Enter: ");
        int total = sc.nextInt();
        System.out.println("How many characters you want your random password to be? Please Enter: ");
        int length = sc.nextInt();

        //Create array to store random passwords
 String[] randomPasswords = new String[total];
        //loop through total number of passwords
        for(int i=0; i<total; i++) {
         String randomPassword = "";

            //genarate one random password
            for (int j = 0; j < length; j++) {
                randomPassword = randomPassword + randomCharacter();
            }
            randomPasswords[i] = randomPassword;
        }
           printPasswords(randomPasswords);
    }
    public static void printPasswords(String[] arr) {
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static char randomCharacter(){
        int rand = (int)(Math.random()*62);// a random number which has 62 possibilities.
        if(rand<=9){//its a number, if btw 10-35 uppercase, 36-61 lowercase, if we add 48 then we get in ASCII
          rand+=48;
          return (char)rand;
        } else if (rand<=35){
            //upercase
            rand+=55;
            return (char)rand;//to get in ASCII
        }
        else{
            rand+=61;
            return (char)rand;
            //lowercase
        }
    }
}
