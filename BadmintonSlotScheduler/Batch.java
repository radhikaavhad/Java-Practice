package BadmintonSlotScheduler;

public class Batch {
    public String slot;
    public int spots;
    public final int totalSpots = 5;

    public Batch(String slot){
        this.slot = slot;
        this.spots = totalSpots;
    }

    void displaySlot(int index){
        System.out.println(index + ") " + slot + " | Available spots: " + spots);
    }

    public boolean isAvailable(){
        return spots>0;
    }

    public void bookSpot(){
        if(spots>0)
            spots--;
    }

    public void cancelSpot(){
        if(spots<totalSpots)
            spots++;
    }


}
