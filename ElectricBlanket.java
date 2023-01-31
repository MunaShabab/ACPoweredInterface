public class ElectricBlanket implements ACPoweredDevice{
    //instance variables
    private String size;
    private int setting;

    //class constructors
    public ElectricBlanket(){
        this.SetSize("Queen");
        this.SetSetting(10);
    }

    public ElectricBlanket(String argSize){
        this.SetSize(argSize);
        this.SetSetting(10);
    }

    public ElectricBlanket(int argSetting){
        this.SetSize("Queen");
        this.SetSetting(argSetting);
    }

    public ElectricBlanket(String argSize, int argSetting){
        this.SetSize(argSize);
        this.SetSetting(argSetting);
    }

    //set and get methods
    public void SetSize(String argSize){
        size=argSize;
    }

    public void SetSetting(int argSetting){
        setting=argSetting;
    }

    public String GetSize(){
        return  size;
    }

    public int GetSetting(){
        return setting;
    }

    //method implementation for the interface ACPoweredDevice
    public double GetKWH(){
        double KWH;
        if(this.GetSize().equals("Twin")){
            KWH=(100* (double)this.GetSetting()/10)/1000;
        }
        else if(this.GetSize().equals("Queen")){
            KWH=(150 * (double)this.GetSetting()/10)/1000;
        }
        else{
            KWH=(200* (double)this.GetSetting()/10)/1000;
        }
        return KWH;
    }

    public String ToString(){
        String info=this.getClass().getSimpleName()+", "+this.GetSize()+" at "+ this.GetSetting();
        return info;
    }
}