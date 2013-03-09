import java.util.List;
import java.util.ArrayList;
public class VehicleList
{ 
  public static void main(String [] args)
  { 
    List<Vehicle>vehicleList=new ArrayList<Vehicle>();

    Vehicle bass=new Moped("Zappa");
    vehicleList.add(bass);
    Vehicle nash=new Moped();
    vehicleList.add(nash);
    Vehicle trance=new Moped("Zidane");
    vehicleList.add(trance);
    Vehicle boom=new JetPack();
    vehicleList.add(boom);
    Vehicle nan=new JetPack("Flash",10);
    vehicleList.add(nan);
    Vehicle bash=new JetPack("Gordan",14);
    vehicleList.add(bash);
    Vehicle crash= new DandyHorse();
    vehicleList.add(crash);
    Vehicle crab= new DandyHorse("Zoom");
    vehicleList.add(crab);
    Vehicle cran= new DandyHorse("W00t");
    vehicleList.add(cran);

    for(int i=0;i<vehicleList.size();i++)
    { System.out.println(vehicleList.get(i).travel());   }
	
	for(Vehicle vehicle : vehicleList)
	{ System.out.println(vehicle.travel());   }
  }
}