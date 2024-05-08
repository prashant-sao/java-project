public class pizza {
    private int price;
    private boolean veg;
    private int ExtraChesse =100;
    private int ExtraTopping =150;
    private int TakeAway = 30;
    private int basepizzaPrice;
    private boolean isCheeseadded = false;
    private boolean isextraToppingadded = false;
    private boolean istakeaway = false;

public  pizza(boolean veg){
    this.veg = veg;
    if(this.veg){
        price =300;
    }
    else{
        price = 400;
    } 
    basepizzaPrice =this.price;
}

public void extraChesse(){
    isCheeseadded = true;
    System.out.println("Extra cheese added");
    this.price += ExtraChesse;
}
public void extraToppings(){
    isextraToppingadded = true;
    System.out.println("Extra toping was added");
    this.price += ExtraTopping;
}
public void takeaway(){
    istakeaway = true;
    System.out.println("you have selected take away option");
    this.price += TakeAway;
}
public void finalBill(){
    System.out.println("Your total bill value is "+this.price);
}
public void getbill(){
    String bill = "";
    System.out.println("Pizza: "+basepizzaPrice);
    if(isCheeseadded){
        bill += "Extra cheese added "+ExtraChesse + "\n";
    }
    if(isextraToppingadded){
        bill+= "Extra topping added "+ExtraTopping+"\n";
    }
    if(istakeaway){
        bill +="take away opted "+TakeAway+"\n";
    }
    bill ="Bill: "+ this.price+'\n';
    System.out.println(bill);
}

}