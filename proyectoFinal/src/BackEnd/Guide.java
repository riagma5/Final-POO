package BackEnd;

public class Guide extends Person{
    
    public Guide(){}
    
    public Guide(
            int id, String fullName, int cellPhone, String address, 
            String hireDate, String fireDate, String startTime, int status){
        super();
    }
    
    public Guide(Guide guide){
        this(
                guide.getId(),
                guide.getFullName(),
                guide.getCellPhone(),
                guide.getAddress(),
                guide.getHireDate(),
                guide.getFireDate(),
                guide.getStartTime(),
                guide.getStatus()
        );
    }
    
}
