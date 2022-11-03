package java8;

public interface Message {
    void SendMsg();
    default void SendPicture(){
        System.out.println("Send Picture");
    }

}

class SendMessage implements Message{

    @Override
    public void SendMsg() {
        System.out.println("Send Message");
    }
}

class MessageImpl{
    public static void main(String[] args) {
        Message message = new SendMessage();
        message.SendMsg();
        message.SendPicture();


        Message SendMessage =()->{                 //lamba
            System.out.println("In Lambda");
        };  //lambda
        SendMessage.SendMsg();          //not get called, it will print "In Lambda
        SendMessage.SendPicture();
    }
}











