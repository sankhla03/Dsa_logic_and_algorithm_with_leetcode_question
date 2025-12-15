package function;

public class numPelidrom {
    public static boolean isPelidrm(int n){
        int rev = 0;
        int temp = n;
        while(temp >0){
            int rem  =temp %10;
            rev = rev *10 +rem;
            temp = temp/10;
        }
        if(rev == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 121;
        if(isPelidrm(n)){
            System.out.println(n + " is a Pelidrom number");
        }
        else{
            System.out.println(n + " is not a Pelidrom number");
        }
    }
}
