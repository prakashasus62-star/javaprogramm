public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int n = arr.length;

        int[] result = new int[n];

        result[0] = 1;

        for (int i = 1; i < n; i++)
            result[i] = result[i - 1] * arr[i - 1];

        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {

            result[i] *= rightProduct;

            rightProduct *= arr[i];
        }

        for (int num : result)
            System.out.print(num + " ");
    }
}
