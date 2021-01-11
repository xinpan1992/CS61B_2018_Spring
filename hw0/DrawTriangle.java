
public class DrawTriangle {

    public static void drawTriangle(int n) {
        int row = n;
        int col = 1;

        int row_now = 1;

        while (row_now <= row) {
            while(col <= row_now) {
                System.out.print("*");
                col = col + 1;
            }
            col = 1;
            System.out.print("\n");
            row_now = row_now + 1;

        }
      
    }


    public static void main(String[] args) {
        drawTriangle(10);

    }
}