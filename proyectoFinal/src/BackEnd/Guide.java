package BackEnd;

public class Guide extends Person{
    
    private int guideId;
    
    public Guide(){}
    
    public Guide(
            String fullName, int cellPhone, String address, String hireDate,
            String fireDate, String startTime, int status, int guideId){
        super();
        this.guideId = guideId;
    }
    
    public Guide(Guide guide){
        this(
                guide.getFullName(),
                guide.getCellPhone(),
                guide.getAddress(),
                guide.getHireDate(),
                guide.getFireDate(),
                guide.getStartTime(),
                guide.getStatus(),
                guide.getGuideId()
        );
    }
    
    public int getGuideId() {
        return guideId;
    }

    public void setGuideId(int guideId) {
        this.guideId = guideId;
    }
    
}
