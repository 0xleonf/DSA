public class Main {
  static int[] median(int[] data) {
    int low = 0;
    int mid = (data.length - 1) / 2;
    int high = (data.length - 1);

    int[] pivot = { data[low], data[mid], data[high] };
    int temp = 0;

    if (pivot[0] > pivot[1]) {
      temp = pivot[0];
      pivot[0] = pivot[1];
      pivot[1] = temp;
    }

    if (pivot[1] > pivot[2]) {
      temp = pivot[1];
      pivot[1] = pivot[2];
      pivot[2] = temp;
    }

    if (pivot[0] > pivot[1]) {
      temp = pivot[0];
      pivot[0] = pivot[1];
      pivot[1] = temp;
    }

    int i = 0;
    while (data[i] != pivot[1]) {
      i++;
    }

    temp = data[high];
    data[high] = data[i];
    data[i] = temp;

    return data;
  }

  static int partition(int[] data, int low, int high) {
    int i = low;
    int pivot = data[high];

    int temp = 0;
    for (int j = low; j < high; j++) {
      if (data[j] <= pivot) {
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
        i++;
      }
    }

    temp = data[i];
    data[i] = data[high];
    data[high] = temp;

    return i;
  }

  static void quickSort(int[] data, int low, int high) {
    if (low > high)
      return;

    int p = partition(data, low, high);
    quickSort(data, low, p - 1);
    quickSort(data, p + 1, high);
  }

  public static void main(String[] args) {
    int[] data = { 9, 42, 37, 34, 6, 30, 40, 21, 22, 37 };
    median(data);
    System.out.println(data[3]);
    System.out.println(data[partition(data, 0, data.length - 1)]);
    quickSort(data, 0, data.length - 1);

    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println("");

  }
}
