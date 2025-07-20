package Interface;

import java.io.Serializable;
class A implements Serializable{
    void show(){
        System.out.println("Interface.A is serializable");
    }

}


public class MarkerInterface  {
    public static void main(String[] args) {
        A obj1=new A();
        if(obj1 instanceof Serializable){
            obj1.show();
        }
        else{
            System.out.println("Interface.A is not serializable");
        }
    }

}
