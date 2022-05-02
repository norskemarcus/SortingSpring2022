package kea.spring2022.sorting;

public class QuickSortSammenlignbar {
  public Sammenlignbar[] sort(Sammenlignbar[] array) {                // NOTE: Datatype[]
    quickSort(array,0, array.length-1);
    return array;
  }

  private void quickSort(Sammenlignbar[] a, int p, int r) { // NOTE: Datatype[]
    if( p < r ) {
      int i = p-1; // skal være int
      for(int j=p; j<r; j++) { // skal være int
        if(a[r].sorteresEfter(a[j])) {      // Fra lav til høj - NOTE: Datatype sammenligning
          i++;
          Sammenlignbar b = a[i];             // NOTE: Datatype
          a[i] = a[j];
          a[j] = b;
        }
      }
      Sammenlignbar b = a[i+1];                         // NOTE: Datatype
      a[i+1] = a[r];
      a[r] = b;

      quickSort(a,p,i);
      quickSort(a,i+2,r);
    }
  }

}
