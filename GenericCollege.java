class Parent {
    int studentCount = 200;

}

class Child extends Parent {
    int studentCount = 100;

    public static void main(String args[]) {
        Child newClg = new Child();
        System.out.println("Count" + " " + newClg.studentCount);

    }
}