public class UserInfoAndSort {

    // Quicksort implementation
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java UserInfoAndSort <name> <age> <city> [numbers to sort]");
            return;
        }

        String name = args[0];
        String age = args[1];
        String city = args[2];

        System.out.println("User Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        if (args.length > 3) {
            int[] numbers = new int[args.length - 3];
            for (int i = 3; i < args.length; i++) {
                numbers[i - 3] = Integer.parseInt(args[i]);
            }

            System.out.println("Numbers before sorting:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();

            quickSort(numbers, 0, numbers.length - 1);

            System.out.println("Numbers after sorting:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        } else {
            System.out.println("No numbers provided for sorting.");
        }
    }
}
