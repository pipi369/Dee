public class Offer40 {

//    public static int[] getLeastNumbers(int[] arr, int k) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            queue.offer(arr[i]);
//
//            if (queue.size() > k) {
//                if (queue.peek() > arr[i]) {
//                    queue.poll();
//                }
//            }
//        }
//
//        int[] res = new int[k];
//        for (int i = 0; i < k; i++) {
//            res[i] = queue.poll();
//        }
//
//        return res;
//    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        sort(arr, 0, arr.length - 1);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = arr[high];

        int left = low, right = high - 1;
        while (left < right) {
            while (arr[left] <= pivot && left < right) {
                left++;
            }
            while (arr[right] >= pivot && left < right) {
                right--;
            }
            swap(arr, left, right);
        }

        if (arr[left] > arr[high]) {
            swap(arr, left, high);
        } else {
            left++;
        }

        sort(arr, low, left - 1);
        sort(arr, left + 1, high);

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 1, 2, 4, 4, 6, 2, 6, 6, 8, 7, 7, 11, 14, 10, 10, 16, 7, 15, 19, 10, 12, 10, 3, 20, 13, 11, 26, 26, 20, 7, 15, 31, 14, 30, 4, 19, 21, 26, 28, 30, 5, 22, 13, 30, 21, 3, 32, 0, 47, 12, 23, 6, 40, 49, 54, 29, 12, 45, 29, 48, 55, 38, 18, 0, 4, 61, 30, 66, 59, 70, 17, 49, 17, 10, 73, 22, 46, 20, 72, 0, 78, 71, 30, 86, 12, 23, 64, 5, 86, 57, 67, 66, 26, 55, 24, 19, 24};
        int[] res = getLeastNumbers(arr, 32);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}
