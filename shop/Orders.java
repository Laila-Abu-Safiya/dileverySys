public class Orders {
    
    private int id;
    private String senderName;
    private String receiverName;
    private String Type;
    private String Phone;
    private int Price;
    private String Address;
    
    public Orders(int ID, String sendName, String reciveName, String Type, String phone, int price, String address)
    {
        this.id = ID;
        this.senderName = sendName;
        this.receiverName = reciveName;
        this.Type = Type;
        this.Phone = phone;
        this.Price = price;
        this.Address = address;
    }

    Orders() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Orders(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId(){
        return id;
    }
    
    public String getsenderName(){
        return senderName;
    }
    
    public String getreceiverName(){
        return receiverName;
    }
    
    public String getType(){
        return Type;
    }
    
    public String getPhone(){
        return Phone;
    }
    
    public int getPrice(){
        return Price;
    }
    
    public String getAddress(){
        return Address;
    }

}