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
            System.out.println(getName() + " was able to treat " + thisPatient.getName() + "'s Heart failure.");
            return true;
        } else {
            System.out.println(getName() + " wasn't able to treat the illness");
        }
        return false;
    }
}
