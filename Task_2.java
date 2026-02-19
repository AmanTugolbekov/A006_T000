import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] strArr = str.toCharArray();




        char[] result = new char[strArr.length - 1];
        for(int i = 0; i < strArr.length; i++){



            for (int k = 0, j = 0; k < strArr.length; k++) {
                if (k != i) {
                    result[j++] = strArr[k];
                }
            }




        }
        int left = 0;
        int right = result.length - 1;

        while(left < right){
            if(result[left] != result[right]){
                System.out.println("Is no palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Is palindrome");


    }
}
