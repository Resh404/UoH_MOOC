public class Message {
    private String text;

    public Message(String text){
        this.text = text;
    }

    public int getLength(){
        return this.text.length();
    }
}
