/**
 * Created by fenji on 8/29/2016.
 */
public class HeartDoc extends Doctor {
    public HeartDoc(String name) {
        super(name);
        setIllnessToCure(Diseases.HEART_FAILURE);
    }

    @Override
    public boolean treatIllness(Patient thisPatient) {
        if (thisPatient.getDisease() == getIllnessToCure()){
            thisPatient.setTreated(true);
            System.out.println(getName() + " was able to treat " + thisPatient.getName() + "'s Heart failure.");
            return true;
        }
        return false;
    }
}
