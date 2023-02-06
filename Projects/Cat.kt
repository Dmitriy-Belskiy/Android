class Cat{
    private Double originWeight;
    private Double weight;
    
     public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;

    }
    
    public void feed(Double amount)
    {
        weight = weight + amount;
    }
    
    
      public Double getFoodWheigh() {
        Double result = weight - originWeight;
        return (result < 0) ? 0 : result;
    }
      
       public void pee() {
        if (weight <= originWeight) {
            System.out.println("I do not want pee");
        } else {
            weight = weight - 1;
            System.out.println("Ehh, I wanna");
        }
    }
      
}