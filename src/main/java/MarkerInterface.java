import org.w3c.dom.ls.LSOutput;

import java.io.Serializable;
class A implements Serializable{
    void show(){
        System.out.println("A is serializable");
    }

}


public class MarkerInterface  {
    public static void main(String[] args) {
        A obj1=new A();
        if(obj1 instanceof Serializable){
            obj1.show();
        }
        else{
            System.out.println("A is not serializable");
        }
    }

}
