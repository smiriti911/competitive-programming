class Solution {
         static int count;
          public static void inversion(int [] a, int [] b) {
        int i=0 , j=0;
        while (i<a.length && j<b.length) {
        if((long)a[i]>((long)2*(long)b[j] )){
            count +=a.length-i;
            j++;
             
        }
        else i++;
    }  
      }
    public static void merge( int[] a, int [] b, int [] c) {
        int i=0, j=0 , k=0;
        while(i<a.length && j<b.length){
        if(a[i]<=b[j])
        c[k++]=a[i++];
        else c[k++]=b[j++];   
       }
       while(j<b.length)
       c[k++]=b[j++];
       while(i<a.length)
       c[k++]=a[i++];
    }
    public static void mergesort(int[] arr) {
        int n=arr.length;
        if(n==1)return;
        int[] a= new int[n/2];
        int [] b=new int[n-n/2];
        for(int i=0; i<n/2; i++){
            a[i]=arr[i];
        }
        for(int i=0; i<n-n/2; i++){
            b[i]=arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        inversion(a,b);
        merge(a,b,arr);
        //delete 
        a=null;
        b=null;
        
    }
    public int reversePairs(int[] nums) {
        count =0;
        mergesort(nums);
        return count;
    }
}