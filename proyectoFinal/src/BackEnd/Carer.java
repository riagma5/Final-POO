package BackEnd;

public class Carer extends Person{
    
    private int idCarer;
    private String speciesCared;
    
    public Carer(){}
    
    public Carer(
            String fullName, int cellPhone, String address, String hireDate,
            String fireDate, String startTime, int status, int idCarer,
            String speciesCared){
        super();
        this.idCarer = idCarer;
        this.speciesCared = speciesCared;
    }
    
    public Carer(Carer carer){
        this(
                carer.getFullName(),
                carer.getCellPhone(),
                carer.getAddress(),
                carer.getHireDate(),
                carer.getFireDate(),
                carer.getStartTime(),
                carer.getStatus(),
                carer.getIdCarer(),
                carer.getSpeciesCared()
        );
    }
    
     public int getIdCarer() {
        return idCarer;
    }

    public void setIdCarer(int idCarer) {
        this.idCarer = idCarer;
    }

    public String getSpeciesCared() {
        return speciesCared;
    }

    public void setSpeciesCared(String speciesCared) {
        this.speciesCared = speciesCared;
    }
}
