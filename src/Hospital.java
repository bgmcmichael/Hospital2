import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by fenji on 8/29/2016.
 */
public class Hospital {
    String name = "";
    ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
    ArrayList<Patient> patientList;
    ArrayList<Patient> patientsToBeReleased = new ArrayList<Patient>();
    Scanner scan = new Scanner(System.in);

    public Hospital (){
        int numDocs = 0;
        String docName = "";
        System.out.println("What is the name of this hospital?");
        name = scan.nextLine();
        System.out.println("How many doctors does this hospital have?");
        numDocs = Integer.valueOf(scan.nextLine());
        for (int counter = 0; counter < numDocs; counter++){
            int docType = 0;
            System.out.println("What is doctor " + (counter + 1) + "'s name?");
            docName = scan.nextLine();
            System.out.println("What kind of doctor are they?\n1- General Practitioner\n2- Heart Doctor\n3- Cancer Doctor");
            docType = Integer.valueOf(scan.nextLine());
            switch (docType){
                case 1:
                    GeneralPractitionerDoc newDoc = new GeneralPractitionerDoc(docName);
                    doctorList.add(newDoc);
                    break;
                case 2:
                    HeartDoc newDoc2 = new HeartDoc(docName);
                    doctorList.add(newDoc2);
                    break;
                case 3:
                    CancerDoc newDoc3 = new CancerDoc(docName);
                    doctorList.add(newDoc3);
                    break;
            }
        }
    }

    public void startHospital(){
        for (int patientCounter = 0; patientCounter < patientList.size(); patientCounter++){
            for(int DocCounter = 0;DocCounter < doctorList.size(); DocCounter++){
                if (doctorList.get(DocCounter).treatIllness(patientList.get(patientCounter))){
                    patientsToBeReleased.add(patientList.get(patientCounter));
                }
            }
        }
        for (int patientCounter = 0; patientCounter < patientsToBeReleased.size(); patientCounter++){
            for (int patientCounter2 = 0; patientCounter2 < patientList.size(); patientCounter2++){
                if(patientList.get(patientCounter2) == patientsToBeReleased.get(patientCounter)){
                    patientList.remove(patientCounter2);
                }
            }
        }
    }


    public String getName() {
        return name;
    }

    public void addDoctor(Doctor newDoc){
        doctorList.add(newDoc);
    }

    public void addPatient(Patient newPatient){
        patientList.add(newPatient);
    }

    public void releasePatient(Patient curedPatient){
        System.out.println(curedPatient.getName() + " has been released.");
        int indexHolder = patientList.indexOf(curedPatient);
        patientList.remove(indexHolder);
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<Patient> getPatientList(){
        return patientList;
    }
}
