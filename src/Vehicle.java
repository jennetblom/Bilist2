public class Vehicle {

    protected Driver driver;
    String type;
    int initialMiles;
    int milesToGo;

    int ageLimit;

    public Vehicle(String type, int initialMiles, int milesToGo, int ageLimit) {
        this.driver = null;
        this.type = type;
        this.initialMiles=initialMiles;
        this.milesToGo = milesToGo;
        this.ageLimit = ageLimit;
        System.out.println(this.type + " created. " + milesToGo + " miles to go!");
    }
    public Vehicle(){

    }

    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        if(driver.age<ageLimit){
            System.out.println("Driver not changed! " + driver.name +" is "+ driver.age + ", but must be "+ ageLimit +" or older to drive car");

        }
        else{
            System.out.println("Driver changed to "+ driver.getName());
            this.driver=driver;
        }
    }

    public void drive(){
        if(driver==null)
        {
            System.out.println(type+  " didnt drive - There´s no driver");
        }
        else{

            System.out.println(type + " drove 10 miles - " + (initialMiles-milesToGo) + " miles to go");
        }

    }
}
