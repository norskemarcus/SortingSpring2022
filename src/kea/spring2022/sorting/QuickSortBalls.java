package kea.spring2022.sorting;

public class QuickSortBalls {

    public Ball[] sort(Ball[] array) {                // NOTE: Datatype[]
      quickSort(array,0, array.length-1);
      return array;
    }

    private void quickSort(Ball[] a, int p, int r) { // NOTE: Datatype[]
      if( p < r ) {
        int i = p-1; // skal være int
        for(int j=p; j<r; j++) { // skal være int
          if(a[r].brighterThan(a[j])) {                 // NOTE: Datatype sammenligning
            i++;
            Ball b = a[i];                   // NOTE: Datatype
            a[i] = a[j];
            a[j] = b;
          }
        }
        Ball b = a[i+1];                         // NOTE: Datatype
        a[i+1] = a[r];
        a[r] = b;

        quickSort(a,p,i);
        quickSort(a,i+2,r);
      }
    }

}
