import java.lang.Object;
import java.util.ArrayList;

public class Hotel {
    //Room[] room = new Room[];
    ArrayList<Room> room = new ArrayList<Room>();
    String hotelName;
    String state;
    String city;
    String address;
    boolean pool;
    boolean breakfast;
    boolean foodDelivery;
    
    public Hotel(){
        
    }
    
    public ArrayList<Room> getRoom(){
        return room;
    }
    
    public String getName(){
        return hotelName;
    }
    
    public String getState(){
        return state;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getAddress(){
        return address;
    }
   
    public void setRoom (Room _room){
        room.add(_room);
    }
    
    public void setName(String _name){
        hotelName =  _name;
    }
    
    public void setState(String _state){
        state = _state;
    }
    
    public void setCity(String _city){
        city = _city;
    }
    
    public void setAddress(String _address){
        address = _address;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean isFoodDelivery() {
        return foodDelivery;
    }

    public void setFoodDelivery(boolean foodDelivery) {
        this.foodDelivery = foodDelivery;
    }
    
    
    
}