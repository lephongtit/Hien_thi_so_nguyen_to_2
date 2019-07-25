import  java.util.Scanner;
public class Hien_thi_so_nguyen_to_2 {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        System.out.print("Nhập số lượng sô nguyên tố: ");
        int n = sr.nextInt();
        int dem=0;
        int i=2;
        while (dem<n){
            if (check(i)){
                System.out.println(i+" ");
                dem++;
            }
            i++;
        }
    }
    public static boolean check(int k){
        if (k<2){
            return  false;
        }else{
            double root = Math.sqrt(k);
            for(int i=2; i<=root; i++) {
                if(k%i==0) {
                    return false;
                }
            }
        }
        return true;

    }

}
