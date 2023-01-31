public class Lightbulb implements ACPoweredDevice{
    //instance variables
    private int wattage;

    //class constructor
    public Lightbulb(int argWattage){
        this.SetWattage(argWattage);
    }

    //set and get methods 

    public void SetWattage(int argWattage){
        wattage=argWattage;
    }

    public int GetWattage (){
        return wattage;
    }

    //method implementation for the interface ACPoweredDevice
    public double GetKWH(){
        double kWH;
        kWH=(double)this.GetWattage()/1000;
        return kWH;
    }

    public String ToString(){
        String info = this.getClass().getSimpleName()+", " +this.GetWattage()+" Watts";
        return info;
    }
    
}