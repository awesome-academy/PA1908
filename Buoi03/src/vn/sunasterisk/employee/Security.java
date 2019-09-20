package vn.sunasterisk.employee;

public class Security extends Employee {
    private float height;
    private float weight;

    public Security() {

    }

    public Security(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public Security(int id, String name,
                    int age, boolean gender,
                    float height, float weight) {
        super(id, name, age, gender);
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void trongXe() {
        System.out.println("trong xe!");
    }

    public void smokeThuocLao() {
        System.out.println("toi la bao ve hut thuoc lao!");
    }

    @Override
    public void printInformation() {
        super.printInformation();
    }
}
