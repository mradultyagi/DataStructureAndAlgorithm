class student {
    int roll;
    int marks;
    String name;

    public student(int r, int m, String n) {
        this.marks = m;
        this.roll = r;
        this.name = n;
    }

    int getRoll() {
        return roll;
    }

    int getMarks() {
        return marks;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return "{" + roll + ", " + marks + ", " + name + "}";
    }
}
