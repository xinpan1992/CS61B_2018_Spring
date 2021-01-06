public class HelloNumbersSum {
    public static void main(String[] args) {
        System.out.println(5 + "10");
        System.out.println(5 + 10);

        int x = 0;
        int y = 0;
        while (x < 10) {           
            y= y + x;
            System.out.print(y + " ");
            x = x + 1;
            if(x==10) {
            	System.out.println("\n"); 
            }
        }
    }
}