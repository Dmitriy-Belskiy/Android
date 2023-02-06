class Cat{
    private Double originWeight;
    private Double weight;
    
    private Double minWeight;
    private Double maxWeight;

    private static Integer count = 0;
    
     public Cat()
    {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }
    
    public void feed(Double amount)
    {
        weight = weight + amount;
    }
    
    
      public Double getFoodWheight() {
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
      
      
     public String statusOfCat(){
        if(weight < minWeight) {
            count --;
            return "Dead";
        }else if(weight > maxWeight) {
            count--;
            return "Exploded";
        }
    } 
      
}