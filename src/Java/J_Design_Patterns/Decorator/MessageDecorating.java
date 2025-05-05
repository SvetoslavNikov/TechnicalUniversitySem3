package Java.J_Design_Patterns.Decorator;



public class MessageDecorating {
    public static void main(String[] args){
        Message m1 = new SimpleMessage();
        Message m2 = new MessageDecorator(m1);


        System.out.println(m1.getContent());
        System.out.println(m2.getContent());

    }
}

interface Message{
    String getContent();
}

class SimpleMessage implements Message{
    @Override
    public String getContent(){
        return "Hey that is simple Message";
    }
}


class MessageDecorator implements Message{
    private Message message;

    public MessageDecorator(Message message){
        this.message = message;
    }
    @Override
    public String getContent(){
        return "***"+message.getContent()+"***";
    }
}