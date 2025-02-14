class ProductOfNumbers {
    List<Integer> list=new ArrayList<>();
    public ProductOfNumbers() {
        List<Integer> list=new ArrayList<>();
    }
    
    public void add(int num) {
      list.add(num);
    }
    
    public int getProduct(int k) {
        int prod=1;
        int last=list.size()-1;
       while(k!=0){
        int a=list.get(last);
        prod*=a;
        k--;
        last--;
       }
       return prod;

    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */