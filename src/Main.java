public class Main {
    public static void main(String[] args) {
        double val = 0;
        double[] arr = new double[11];
        for (int k = 0; k<11; k++)
        {
            val = k*(Math.PI/5);
            arr[k] = val;
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");

            System.out.print(Math.sin(arr[i]) + ", ");
            System.out.print(Math.cos(arr[i]));
            System.out.println();
        }
    }
}