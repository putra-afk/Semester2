package week4;

public class Patientmain {
    public static void main(String[] args) {
        Patient[] patients = new Patient[5]; // create an array to store 5 patient objects
    
            // create patient objects
            patients[0] = new Patient("Rey", 25, 50);
            patients[1] = new Patient("Hammam", 35, 60);
            patients[2] = new Patient("Ridho", 45, 70);
            patients[3] = new Patient("Seno", 55, 80);
            patients[4] = new Patient("Arka", 65, 90);
    
            double totalFeeAbove50 = 0;
            for (Patient patient : patients) {
                if (patient.age > 50) {
                    totalFeeAbove50 += patient.totalFee();
                }
            }
            System.out.println("Average total fee of patients above 50 years old: " + (totalFeeAbove50 / patients.length));
    
            double smallestAverageMedicationPrice = patients[0].averageMedicationPrice();
            int smallestMedicationPriceIndex = 0;
            for (int i = 1; i < patients.length; i++) {
                if (patients[i].averageMedicationPrice() < smallestAverageMedicationPrice) {
                    smallestAverageMedicationPrice = patients[i].averageMedicationPrice();
                    smallestMedicationPriceIndex = i;
                }
            }
    
            System.out.println("Smallest average medication price of patients aged 15-30: " + smallestAverageMedicationPrice);
            patients[smallestMedicationPriceIndex].printData();
        }
}
