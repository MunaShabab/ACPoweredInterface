import java.util.ArrayList;
public class Lab8{
    public static void main(String[] args){
        //create instance objects of the different classes in the ACPoweredDevice interface and add them to an ArrayList
        ArrayList<ACPoweredDevice> deviceList=new ArrayList<ACPoweredDevice>();
        Lightbulb light1=new Lightbulb(12);
        deviceList.add(light1);
        ElectricBlanket blanket1=new ElectricBlanket();
        deviceList.add(blanket1);
        ElectricBlanket blanket2= new ElectricBlanket("Twin");
        deviceList.add(blanket2);
        ElectricBlanket blanket3= new ElectricBlanket(3);
        deviceList.add(blanket3);
        ElectricBlanket blanket4= new ElectricBlanket("King",6);
        deviceList.add(blanket4);
        Television television1= new Television("Plasma",30);
        deviceList.add(television1);
        Television television2= new Television("Plasma",52);
        deviceList.add(television2);
        Television television3=new Television("LCD",20);
        deviceList.add(television3);
        Television television4=new Television("LCD",60);
        deviceList.add(television4);
        Television television5= new Television("Tube",32);
        deviceList.add(television5);
        Television television6=new Television("Tube",20);
        deviceList.add(television6);
        Computer computer1=new Computer("Labtop");
        deviceList.add(computer1);
        Computer computer2=new Computer("Desktop");
        deviceList.add(computer2);

        
        for(ACPoweredDevice d:deviceList){
            System.out.println(d.ToString()+ " ,KWH " + String.format("%.3f",d.GetKWH()));
        }
    }
}