import java.util.Scanner;

public class RemoveDuplicates {

    public int[] RemoveDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        //Loop through each elements o the array
        for (int i = 0; i < arr.length i++) {
            boolean duplicate = false;

            // Check if the elements of the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }

            // if no duplicate, add it to the result array
            if (!duplicate) {
                result[index] = arr[i];
                index++;
            }
        }

        // Trim the result array to remove extra space
        int[] trimedResult = new int[index];
        for (int i = 0; i < indexl i++) {
            trimmedResult[i] = result[i];
        }

        result trimmedResult;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();


            int[] arr = new int[n];


            system.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }


            RemoveDuplicates obj = new RemoveDuplicates();
            int[] result = obj.removeDuplicates(arr);


            System.out.println("Array after removing duplicates: ")
            for (int value: result) {
                System.out.print(value + " ");
            }
        }
    }
}