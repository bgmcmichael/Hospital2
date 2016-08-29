import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by fenji on 8/29/2016.
 */
public class HospitalRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Patient> patientList = new ArrayList<Patient>();
        ArrayList<Hospital> hospitalList = new ArrayList<Hospital>();

        System.out.println("how many hospitals do you want?");
        int numHosp = Integer.valueOf(scan.nextLine());
        for (int count = 0; count < numHosp; count++){
            Hospital newHospital = new Hospital();
            hospitalList.add(newHospital);
        }

        System.out.println("How many patients are there to treat?");
        int numPatients = Integer.valueOf(scan.nextLine());
        for (int count = 0; count < numPatients; count++){
            Patient newPatient = new Patient();
            patientList.add(newPatient);
        }

        for (Hospital currentHospital : hospitalList){
            System.out.println(currentHospital.getName() + " is looking at the patients.");
            currentHospital.setPatientList(patientList);
            currentHospital.startHospital();
            if ((patientList.size() > 0) && (hospitalList.indexOf(currentHospital) != (hospitalList.size() - 1))){
                System.out.println("Transfering patients to a new hospital for better treatment.");
            }
        }

        if (patientList.size() > 0){
            System.out.println("Not all patients could be treated. No hospitals had the right doctor for the remaining patients.");
        } else{
            System.out.println("All patients have been treated");
        }
    }
}
