// Class : Blueprint
// It doesn't aquire memory.
// new College() it will aqurie memory on instance creation.
class College {
    String name;
    int studentCount;

    // variable initialize.
    // Code execution.
    College(String name, int studentCount) {
        System.out.println("Collage constructor");
        this.name = name;
        this.studentCount = studentCount;
    }

    // methods.
    void printDetails() {
        System.out.println("Clg Name" + "" + this.name);
        System.out.println("Student Count" + "" + this.studentCount);

    }

    public static void main(String args[]) {
        College clgObject = new College("Government Clg", 2000); // On instance creation constructor will call.
        clgObject.printDetails();
    }
}
