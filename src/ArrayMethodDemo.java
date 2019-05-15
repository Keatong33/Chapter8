public class ArrayMethodDemo {
    public static void main(String[] args){
        double[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total =0;

        displayFor(integers);



    }
    public static void displayFor(double[] integers){
        for(int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
        for(int j = integers.length-1; j>=0; j--) {
            System.out.println(integers[j]);
        }


    }

}
