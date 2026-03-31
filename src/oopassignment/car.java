package oopassignment;

public class car {
     private static int carCounter = 1;

    public static void setCarCounter(int newCount) {
        carCounter = newCount;
    }
    
    private String carID;
    private String carName;
    private String carType;
    private String carBrand;
    private String carColor;
    private String price;
    private String condition;
    private String mileage;
    private String transmission;
    private String fueltype;
    private String status;
    
    
    
    public car(String carID, String carName, String carType, String carBrand, String carColor, String price, String condition, String mileage, String transmission, String fueltype,String status){
        this.carID = carID;
        this.carName = carName;
        this.carType = carType;
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.price = price;
        this.condition = condition;
        this.mileage = mileage;
        this.transmission = transmission;
        this.fueltype = fueltype;
        this.status = status;
    }
    
    public String getCarID(){
        return carID;
    }
    
    public String getCarname(){
        return carName;
    }
    
    public void setCarName(String newCarName){
        this.carName = newCarName;
    }
    
    public String getCarType(){
        return carType;
    }
    
    public void setCarType(String newCarType){
        this.carType = newCarType;
    }
    
    public String getCarBrand(){
        return carBrand;
    }
    
    public void setCarBrand(String newCarBrand){
        this.carBrand = newCarBrand;
    }
    
    public String getCarColor(){
        return carColor;
    }
    
    public void setCarColor(String newCarColor){
        this.carColor = newCarColor;
    }
    
    public String getPrice(){
        return price;
    }
    
    public void setPrice(String newPrice){
        this.price = newPrice;
    }
    
    public String getCondition(){
        return condition;
    }
    
    public void setCondition(String newCondition){
        this.condition = newCondition;
    }
    
    public String getMileage(){
        return mileage;
    }
    
    public void setMileage(String newMileage){
        this.mileage = newMileage;
    }
    
    public String getTransmission(){
        return transmission;
    }
    
    public void setTransmission(String newTransmission){
        this.transmission = newTransmission;
    }
    
    public String getFuelType(){
        return fueltype;
    }
    
    public void setFuelType(String newFuelType){
        this.fueltype = newFuelType;
    }
    
    public String getCarStatus(){
        return status;
    }
    
    public void setCarStatus(String newStatus){
        this.status = newStatus;
    }
    
    public static String generateCarID() {
        String formattedCounter = String.format("%04d", carCounter);
        carCounter++; 
        return "V" + formattedCounter;
    }
}