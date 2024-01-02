public class ReverseString {
    public static void main(String[] args){
        String word="Monkey";
        String revWord="";
        for(int i=0;i<word.length();i++){
            char temp=word.charAt(i);
            revWord=temp+revWord;
        }
        System.out.println("Original word :"+word);
        System.out.println("Revered word :"+revWord);
    }
}

//OUTPUT
// Original word :Monkey
// Revered word :yeknoM