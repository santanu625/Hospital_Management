package Hospital.project;

public class Doctor {
  private static  int idcounter=1;
    private int id;
    private String name;
    private String SpecialistY ;
    public Doctor(String name ,String SpecialistY){
        this.id=idcounter++;
        this.name=name;
        this.SpecialistY=SpecialistY;
    }
    public  int getId(){
        return id;
    }
    public String toString(){
        return "Doctor ID: "+id+" Doctor Name: "+name+" Doctor SpecialistY: "+SpecialistY;
    }
}
