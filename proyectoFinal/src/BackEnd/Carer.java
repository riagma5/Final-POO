package BackEnd;

public class Carer extends Person{

    private String speciesCared;
    
    public Carer(){}
    
    public Carer(
            int id, String fullName, int cellPhone, String address, 
            String hireDate, String fireDate, String startTime, int status,
            String speciesCared){
        super();
        this.speciesCared = speciesCared;
    }
    
    public Carer(Carer carer){
        this(
                carer.getId(),
                carer.getFullName(),
                carer.getCellPhone(),
                carer.getAddress(),
                carer.getHireDate(),
                carer.getFireDate(),
                carer.getStartTime(),
                carer.getStatus(),
                carer.getSpeciesCared()
        );
    }
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciesCared() {
        return speciesCared;
    }

    public void setSpeciesCared(String speciesCared) {
        this.speciesCared = speciesCared;
    }
}
