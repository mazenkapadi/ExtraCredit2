public class Main {
    public static void main(String[] args) {
        /*
        * Develop an algorithm (Java or C++) that can find the ratio of the sum of the largest two numbers divided by the sum of the smallest two numbers in an array. The solution should be linear or better.
        * For example:
        * If the input is
        * int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        * The ratio is (450+321) / (1+1) = 385.5.
        */

        int [] a ={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        System.out.println(ratioArray(a));
    }
    private static int ratioArray(int[] a){
        int max1 = 0;
        int max2 = 0;

        for(int i = 0; i < a.length; i++)
        {
            int num = a[i];
            if (max1 < num)
            {
                max2 = max1;
                max1 = num;
            }
            else if (max2 < num)
            {
                max2 = num;
            }
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i = 0; i<a.length; i++){
            if(a[i]<min1){
                min2 = min1;
                min1 = a[i];
            }
            else if(a[i]<min2){
                min2 =a[i];
            }
        }
        return (max1+max2)/(min1+min2);
    }
}