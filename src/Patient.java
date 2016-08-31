import java.util.Scanner;

/**
 * Created by fenji on 8/29/2016.
 */
public class Patient implements GetsSick {
    String name = "";
    int disease = -1;
    boolean isTreated = false;
    public Patient(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name this patient");
        name = scan.nextLine();
        System.out.println("what disease does this patient have?\n1- Common cold\n2- Heart failure\n3- Lung cancer");
        int diseaseChoice = Integer.valueOf(scan.nextLine());
        setDisease(diseaseChoice);
    }

    public boolean isTreated() {
        return isTreated;
    }

    public void setTreated(boolean treated) {
        isTreated = treated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisease() {
        return disease;
    }

    @Override
    public void setDisease(int disease) {
        this.disease = disease;
    }
}
