class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }
}

interface AbstractClass {
    void display();
}

class Child extends Parent implements AbstractClass {


    Child(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Name: " + this.name);
    }
}

public class abstract_inheritance {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("\t\tABSTRACT INHERITANCE");

        Child childInstance = new Child("SHOBANA");
        childInstance.display();
    }
}
