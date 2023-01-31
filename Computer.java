public class Computer implements ACPoweredDevice{
    //instance variable
    String type;

    //class constructor
    public Computer(String argType){
        this.SetType(argType);
    }

    //set and get methods
    public void SetType(String argType){
        type=argType;
    }
    public String GetType(){
        return type;
    }

    //method implementation for the ACPoweredDevice interface
    public double GetKWH(){
        double kWH;
        if(this.GetType().equals("Labtop")){
            kWH=.06;
        }
        else{
            kWH=.175;
        }
        return kWH;
    }
    public String ToString(){
        String info=this.getClass().getSimpleName()+", "+ this.GetType();
        return info;
    }
}