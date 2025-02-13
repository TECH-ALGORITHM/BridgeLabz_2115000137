public class CountingSort {
    public static void sort(int[] arr) {
        int max = 18, min = 10, range = max - min + 1;
        int[] count = new int[range];
        for (int num : arr) count[num - min]++;
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 14, 16, 12, 10};
        sort(ages);
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
