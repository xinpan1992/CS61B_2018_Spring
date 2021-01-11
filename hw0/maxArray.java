public class maxArray {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int max_num = m[0];
        int index = 1;

        while(index < m.length) {
            if(m[index] > max_num){
                max_num = m[index];
            }
            index += 1;
        }

        return max_num;
    }

    /** Returns the maximum value from m. */
    public static int max_forloop(int[] m) {
        int max_num = m[0];

        for (int index = 1; index < m.length; index ++) {
            if(m[index] > max_num) {
                max_num = m[index];
            }
        }

        return max_num;
    }

    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, -22, 10, 6, 100};
       System.out.println(max_forloop(numbers));
    }
}