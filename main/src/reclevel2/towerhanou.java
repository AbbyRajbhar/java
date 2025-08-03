package reclevel2;

public class towerhanou {
    public static void towerofHaoni(int n, String src, String helper, String dest){
        if (n== 1){
            System.out.println("transfer disk" + n + "from" + src + "to" + dest);
            return;
        }

        towerofHaoni(n-1, src, dest, helper);
        System.out.println("transfer disk"+ n + "from" + src + "to" + dest);
        towerofHaoni(n-1, src, helper, dest);


    }
    public static void main(String[] args) {
        int n=3;
        towerofHaoni(n, "S", "H", "D");
    }
     
    
}
