import java.util.*;

class car {
    private String carId;
    private String brand;
    private String model;
    private double basePrice;
    private boolean isAvailable;
}
public car(String carId,String brand,String model,double basePrice,boolean isAvailable) {
    this.carId = carId;
    this.brand = brand;
    this.model = model;
    this.basePrice = basePrice;
    this.isAvailable = true;
}
public String getcarId(){
    return carId;
}
public String getbrand(){
    return brand;
}
public String getModel(){
    return model;
}
public double getBasePricePerDay(){
    return basePrice;
}
public double totalRent(int rentdays){
    return basePrice*rentdays;
}
public boolean getIsAvailable(){
    return isAvailable;
}
public void rent(){
    isAvailable =false;
}
public void returncar(){
    isAvailable =true;
}
class customer{
    private String customerName;
    private String customerId;
    
}
public customer(String customerId,String customerName){
    this.customerId = customerId;
    this.customerName= customerName;

}
public String getcustomerID(){
    return customerId;
}
public String getcustomername(){
    return customerName; 
}
public class car_rental {
    
}
