public class problem3 {
    public static void main(String[] args) {
        int n,i,sum=0;
        int a[] = {1, 2, 3, 4, 5, 6};
        for ( i = 0; i < a.length; i+=2) {
            sum=a[i]+a[i+1];
            System.out.println(sum);
            sum=0;

        }
    }
    
}
