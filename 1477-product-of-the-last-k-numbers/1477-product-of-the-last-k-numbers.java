class ProductOfNumbers {
    List<Integer> list;
    int prod;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        list.add(1);
        prod = 1;
    }

    public void add(int num) {
        if (num == 0) {
            list.clear();
            list.add(1);
            prod = 1;
            return;
        }
        prod *= num;
        list.add(prod);

    }

    public int getProduct(int k) {

        int res = list.get(list.size() - 1);
         if (k >= list.size()) { 
            return 0;
        }
        if (list.size() == k) {
            return res;
        }
        return res/list.get(list.size() - 1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */