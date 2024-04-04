public class heapSort {

	public void sort(int arr[])
	{
		int N = arr.length;
		for (int i = N / 2 - 1; i >= 0; i--)
		for ( i = N - 1; i > 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}
    void heapify(int arr[], int N, int i)
	{
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2
    	if (l < N && arr[l] > arr[largest])
			largest = l;
        if (r < N && arr[r] > arr[largest])
			largest = r;

		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
            heapify(arr, N, largest);
		}
	}
//
	}
