public class Television implements ACPoweredDevice{
    //instance variables
    private String type;
    private double size;

    //class constructor
    public Television(String argType, double argSize){
        this.SetType(argType);
        this.SetSize(argSize);
    }

    //set and get methods
    public void SetType(String argType){
        type=argType;
    }
    public void SetSize(double argSize){
        size=argSize;
    } 
    public String GetType(){
        return type;
    }
    public double GetSize(){
        return size;
    }

    //method implementation for the ACPoweredDevice interface
    public double GetKWH(){
        double kWH;
        if(this.GetType().equals("Plasma")){
            if(this.GetSize()>50){
                kWH=.48;
            }
            else{
                kWH=.4;
            }
        }
        else if(this.GetType().equals("LCD")){
            if(this.GetSize()>50){
                kWH=.016;
            }
            else{
                kWH=.012;
            }
        }
        else{
            if(this.GetSize()>30){
                kWH=.12;
            }
            else{
                kWH=.09;
            }
        }
        return kWH;
    }
    public String ToString(){
        String info=this.getClass().getSimpleName()+", "+ this.GetType() + " "+this.GetSize()+" inch";
        return info;

    }

}