package top.vlor.demo;

import java.io.*;

public class Prototype implements Cloneable,Serializable{
    private static final long serialVersionUID = 1L;
    private String str;

    private SerializableObj obj;

    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public SerializableObj getObj() {
        return obj;
    }

    public void setObj(SerializableObj obj) {
        this.obj = obj;
    }
}

class SerializableObj implements Serializable{
    public static final long serialVersionUID=1l;
}
