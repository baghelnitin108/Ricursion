public class firstLastOccurence {

    public static void main(String[] args) {
        String str="helllo";
        Occurence(str, 0, 'l');

    }
    public static int first=-1;
    public static int last=-1;

    public static void Occurence(String str,int idx ,int ele){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        char currChar=str.charAt(idx);
        if(currChar==ele){
            if(first==-1){
                first=idx;

            }else{
                last=idx;
            }
            
        }
        Occurence(str, idx+1, ele);

    }
}