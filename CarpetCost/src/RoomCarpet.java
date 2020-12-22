public class RoomCarpet {

    public RoomDimension roomDimension;

    public double costPerSqFt;

    public double calculateCost(RoomDimension room){
        return room.getRoomArea() * costPerSqFt;
    }

    public double getCostPerSqFt() {
        return costPerSqFt;
    }

    public void setCostPerSqFt(double costPerSqFt) {
        this.costPerSqFt = costPerSqFt;
    }

}
