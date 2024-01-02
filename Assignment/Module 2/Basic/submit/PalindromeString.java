public class PalindromeString {
        public static void main(String[] args){
        String word="Java";
        String revWord="";
        for(int i=0;i<word.length();i++){
            char temp=word.charAt(i);
            revWord=temp+revWord;
        }
        System.out.println("Original word :"+word);
        System.out.println("Revered word :"+revWord);
        int yes=1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=revWord.charAt(i)){
                yes=0;
                break;
            }
        }
        if(yes==1){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not palindrome!");
        }
    }
}

// output
// Original word :repaper
// Revered word :repaper
// Palindrome!

//output
// Original word :Java
// Revered word :avaJ
// Not palindrome!