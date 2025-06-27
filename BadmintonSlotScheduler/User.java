package BadmintonSlotScheduler;

public class User {
    public String name;
    private int bookedBatchIndex = -1;

    public User(String name){
        this.name = name;
    }

    public boolean hasBooked(){
        return bookedBatchIndex!=-1;
    }

    public void book(int index){
        this.bookedBatchIndex = index;
    }

    public void cancelBooking(){
        this.bookedBatchIndex = -1;
    }

    public int getBookedBatchIndex(){
        return bookedBatchIndex;
    }

}
