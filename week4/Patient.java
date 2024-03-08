package week4;

public class Patient {
    private String name;
    int age;
    private int[] medicationPrice = {10, 20, 30}; // default values for medicationPrice
    private int doctorFee;

    public Patient(String name, int age, int doctorFee) {
        this.name = name;
        this.age = age;
        this.doctorFee = doctorFee;
    }

    public double averageMedicationPrice() {
        double sum = 0;
        for (int price : medicationPrice) {
            sum += price;
        }
        return sum / medicationPrice.length;
    }

    public double totalFee() {
        return doctorFee + averageMedicationPrice();
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Doctor Fee: " + doctorFee);
        System.out.println("Average Medication Price: " + averageMedicationPrice());
        System.out.println("Total Fee: " + totalFee());
        System.out.println("Medication Prices: " + java.util.Arrays.toString(medicationPrice));
        System.out.println();
    }
}
