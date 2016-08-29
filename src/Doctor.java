/**
 * Created by fenji on 8/29/2016.
 */
public abstract class Doctor {
    String name = "";
    int IllnessToCure = -1;

    public Doctor(String name){
        this.name = name;
    }

    public int getIllnessToCure() {
        return IllnessToCure;
    }

    public void setIllnessToCure(int illnessToCure) {
        IllnessToCure = illnessToCure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean treatIllness(Patient thisPatient);
}
