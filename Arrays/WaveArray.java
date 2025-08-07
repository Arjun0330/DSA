class WaveArray {
    public void sortInWave(int arr[]) {
        // code here
        if (arr.length < 2) {
            return;
        }

        int i = 0;
        int j = 1;

        while (i < arr.length && j < arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i = i + 2;
            j = j + 2;
        }
    }
}
