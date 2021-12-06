package amdocs.network.links;

public class Links {

    public enum TypeLinks {OPT, ETH, WIFI}

    public Float speedLimit = 100.0f;//Througput máximo do link
    public Boolean linkStatus = false;//Status da porta (ON-OFF)
    public int startID;
    public int endID;
    public TypeLinks linkType;

    public Float getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Float speedLimit) {
        this.speedLimit = speedLimit;
    }

    public Boolean getLinkStatus() {
        return linkStatus;
    }

    public void setLinkStatus(Boolean linkStatus) {
        this.linkStatus = linkStatus;
    }

    public int getStartID() {
        return startID;
    }

    public void setStartID(int startID) {
        this.startID = startID;
    }

    public int getEndID() {
        return endID;
    }

    public void setEndID(int endID) {
        this.endID = endID;
    }

    public TypeLinks getLinkType() {
        return linkType;
    }

    public void setLinkType(TypeLinks linkType) {
        this.linkType = linkType;
    }
   
}