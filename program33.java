interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("Interface A implemented.");
    }

    public void showB() {
        System.out.println("Interface B implemented.");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}
