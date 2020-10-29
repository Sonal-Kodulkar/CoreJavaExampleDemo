package core_java.mypackage2;

class Child extends Parent {
    public int childX = 60;

    public void printX() {
        System.out.println("This is value of childX:" + childX);
    }

    public void printParent() {
        System.out.println("This is method of child class");

    }

    public void childMethod() {
        System.out.println("child class method");
    }
}
