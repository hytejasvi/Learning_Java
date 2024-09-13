package InputOutputStreams;

public class Main {
    public static void main(String[] args) {
        String writeMessage = "\nThis is a sample test message line1 \n" +
                "This is a sample test message line2 \n" +
                "This is a sample test message line3 \n" +
                "This is a sample test message line4";
        FileOutputStreamExample wf = new FileOutputStreamExample(writeMessage);
        wf.writeMessage();
        FileInputStreamExample rf = new FileInputStreamExample();
        String receivedMsg = rf.readFromFile();
        //System.out.println(receivedMsg);
    }
}

