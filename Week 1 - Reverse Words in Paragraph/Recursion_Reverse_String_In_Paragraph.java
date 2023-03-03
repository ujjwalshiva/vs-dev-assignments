import java.util.*; 

class reversestring{
    public String reverseString(String str){
        int strLen=str.length();
        if (strLen<=1){
            return str;
        }
        else{
            return reverseString(str.substring(strLen/2))+reverseString(str.substring(0,strLen/2));
        }
    }

    public String reversePara(String str){
        if (str.length()<=1){
            return str;
        }
        else{
            int spaceIndex=str.indexOf(" ");
            if (spaceIndex<0){
                return reverseString(str);
            }
            return reverseString(str.substring(0,spaceIndex))+str.charAt(spaceIndex)+reversePara(str.substring(spaceIndex+1));
        }
    }
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a string: ");  
        String str= s.nextLine(); 
        reversestring rFinal=new reversestring();
        String finalPara=rFinal.reversePara(str);
        System.out.println(finalPara);
    }
}
