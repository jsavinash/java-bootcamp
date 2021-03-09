class Oops { // Class
    String name = "Nishad";
    int age = 23;

    void printName() {
        System.out.println("Avinash");
    }

    public static void main(String args[]) {
        Oops oopsObject = new Oops(); // Object
        System.out.println(oopsObject.name);
        System.out.println(oopsObject.age);
        oopsObject.printName();
    }
}
