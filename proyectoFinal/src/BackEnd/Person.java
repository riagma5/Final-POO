package BackEnd;

public class Person {
    private String fullName;
    private int cellPhone;
    private String address;
    private String hireDate; // yyyy-mm-dd
    private String fireDate; // yyyy-mm-dd
    private String startTime; // 
    private int status; //0 inactive, 1 active
    
    Person(){}
    Person(String fullName, int cellPhone, String address, String hireDate,
            String fireDate, String startTime, int status){
        this.fullName = fullName;
        this.cellPhone = cellPhone;
        this.address = address;
        this.hireDate = hireDate;
        this.fireDate = fireDate;
        this.startTime = startTime;
        this.status = status;
    }
    
    Person(Person person){
        this(person.getFullName(), person.getCellPhone(), person.getAddress(),
                person.getHireDate(), person.getFireDate(), 
                person.getStartTime(), person.getStatus());
    }    
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getFireDate() {
        return fireDate;
    }

    public void setFireDate(String fireDate) {
        this.fireDate = fireDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
