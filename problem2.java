public class problem2 {
    public static void main(String[] args) {
        int n,i,sum = 0;
        int a[] = {1,-1,3,0,5,6,6,7};
        for (i = 1; i < a.length; i++) {
            if(i%2!=0){
                sum+=a[i];
            }
            
        }
        System.out.println(sum);


    }
    
}
