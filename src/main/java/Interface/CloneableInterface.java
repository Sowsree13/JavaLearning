package Interface;

class Animal implements Cloneable{
    String name;
    String sound;

    @Override
    public Object clone() throws CloneNotSupportedException {
       return super.clone();
    }
}
public class CloneableInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal obj=new Animal();
        obj.name="Cat";
        obj.sound="meow";
        Animal obj1= (Animal) obj.clone();
    }
}
