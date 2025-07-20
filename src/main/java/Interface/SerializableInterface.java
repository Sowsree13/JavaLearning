package Interface;

import java.io.*;

class B implements Serializable{
    int i;
    public B(int i){
        this.i=i;
    }

}
class C extends B{

    public C(int i) {
        super(i);
    }
}

public class SerializableInterface  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        B obj1=new B(10);
        C obj2=new C(15);
        FileOutputStream fos=new FileOutputStream("obj.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj1);
        FileInputStream fis=new FileInputStream("obj.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        B b=(B)ois.readObject();
        System.out.println(b.i);

        oos.writeObject(obj2);

        C c=(C)ois.readObject();
        System.out.println(c.i);

    }

}
