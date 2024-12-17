package learning.designPatterns.exercisesOOP;

class EmailMessage implements Message{
    @Override
    public void send() {
        System.out.println("Email Notification");
    }
}

class SMSMessage implements Message{
    @Override
    public void send() {
        System.out.println("SMS notification");
    }
}

class PushNotification implements Message{
    @Override
    public void send() {
        System.out.println("Push notification");
    }
}

interface Message {
    void send();
}


class MessageFactory {
   public static Message createMessage(String type){
       switch (type){
           case "PushNotification": return new PushNotification();
           case "SMSMessage": return new SMSMessage();
           case "EmailMessage": return new EmailMessage();
           default: throw new IllegalArgumentException("Wrong type");
       }
   }
}
