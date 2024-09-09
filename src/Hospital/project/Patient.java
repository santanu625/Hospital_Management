package Hospital.project;

public class Patient {
    private static int idcounter=1;
    private int id;
    private String name;
    private String gender;
    private int age;
    public Patient(String name,String gender ,int age){
        this.id=idcounter++;
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    public int getId(){
        return id;
    }
    @Override
    public String toString(){
        return "Patient ID: "+id+" Patient Name: "+name+" Patient Gender: "+gender+" patient Age: "+age;
    }



}
