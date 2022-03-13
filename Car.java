public class Car {
    private String make;
    private String model;
    private String color;
    private int modelYear;
    private String owner;

    public Car (String ma, String mod, String col, int mYr, String own)
    {
        this.make = ma;
        this.model = mod;
        this.color = col;
        this.modelYear = mYr;
        this.owner = own;
    }

    public String getColor(){
        return this.color;

    }
    
    public void setColor(String newColor){
        this.color = newColor;
    }

    public int getYear(){
        return this.modelYear;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String newOwner){
        this.owner = newOwner;
    }

    public String getModel(){
        return this.model;
    }



}


