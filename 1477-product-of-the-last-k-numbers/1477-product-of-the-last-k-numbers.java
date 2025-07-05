class ProductOfNumbers {
    private ArrayList<Integer> al=new ArrayList<>();
    // int prod=1;

    public ProductOfNumbers() {
    }
    
    public void add(int num) {
        al.add(num);
    }
    
    public int getProduct(int k) {
        int n=al.size();
        int prod=1;
        for(int i=n-k;i<n;i++){
            prod*=al.get(i);
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