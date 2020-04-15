package BackEnd;

public class Zone {
    
    private int zoneId;
    private char zoneName;
    private double extension;
    
    public Zone(){}
    
    public Zone(int zoneId, char zoneName, double extension){
        this.zoneId = zoneId;
        this.zoneName = zoneName;
        this.extension = extension;
    }
    
    public Zone(Zone zone){
        this(zone.getZoneId(), zone.getZoneName(),zone.getExtension());
    }
    
    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public char getZoneName() {
        return zoneName;
    }

    public void setZoneName(char zoneName) {
        this.zoneName = zoneName;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }
}
