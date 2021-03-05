class Root {
    /*
     * This function is use to validate age.
     * 
     * @{Int age} This paramter is user input.
     */
    boolean isValidAge(int age) { // control statement
        boolean isValid;
        if (age > 18) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }

    void forLoop(String name) { // fixed looping
        for (int i = 0; i < 5; i++) {
            System.out.println("Emo");
            if (i == 2) {
                continue;
            }
            System.out.println(name);
            // break;
            // continue
        }
        System.out.println("End");
    }

    void whileLoop(String name) { // conditional loop
        int count = 0;
        while (count < 2) { // condtion has be true.
            System.out.println(name);
            count++;
        }
    }

    void doWhileLoop(String name) {// conditional loop
        int count = 0;
        do { // condtion has be true.
            System.out.println(name);
            count++;
        } while (count < 2);
    }

    void switchCase(String name) {// condition code execution.
        switch (name) {
            case "avinash": {
                System.out.println("Avinash"); // program 1
                break; // flow breaker
            }
            case "chuchu": {
                System.out.println("Chuchu"); // program 2
                break;
            }
            case "demo": {
                System.out.println("Demo"); // program 3
                break;
            }
            default: {
                System.out.println("Default"); // program 4
            }
        }
    }

    public static void main(String args[]) {
        Root rootObj = new Root(); // Instance of Root class
        rootObj.forLoop("Avinash");
    }
}
