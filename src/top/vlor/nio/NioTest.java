package top.vlor.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest {
    public static void main(String[] args) throws IOException {
        test();
    }
    public static void test() throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("d:\\mydoc\\nio-data.txt","rw");
        FileChannel inChannel = aFile.getChannel();

        //create buffer with capacity of 48 bytes
        ByteBuffer buf = ByteBuffer.allocate(48);

        //read into buffer
        int bytesRead = inChannel.read(buf);
        while (bytesRead!=-1){
            //make buffer ready for read
            buf.flip();

            while (buf.hasRemaining()){
                System.out.println(buf.get());
            }

            //make buffer ready for writing
            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
