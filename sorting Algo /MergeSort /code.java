 public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        mergeSort(arr ,   0 , arr.length -1  );
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
    // take array then split it to two sub aarrays then sort it in orignal one
    public static void merge(int[] arr, int l, int mid, int r) {
        // size of sub arr 1
        int n1 = mid - l + 1;
        // size of sub arr 2
        int n2 = r - mid ;
      


        int L[] = new int[n1];
        int R[] = new int[n2];
        // insert sub arr 1
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        // insert sub arr 2
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }

        // merge two sub arrays
        // 3 2 3    // 5 3 7
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                arr[k] = R[j];
                j++;
            } else {
                arr[k] = L[i];
                i++;
            }
            k++;
        }
        // if the array still have elements then
        while (i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }
    public static void mergeSort(int arr[], int l, int r){

        if(l<r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l , mid);
            mergeSort(arr,mid + 1  , r);
            merge(arr , l , mid , r);
        }
    }
