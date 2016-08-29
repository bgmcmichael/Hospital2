/**
 * Created by fenji on 8/29/2016.
 */
public class CancerDoc extends Doctor {
    public CancerDoc(String name) {
        super(name);
        setIllnessToCure(Diseases.LUNG_CANCER);
    }

    @Override
    public boolean treatIllness(Patient thisPatient) {
        if (thisPatient.getDisease() == getIllnessToCure()){
            System.out.println(getName() + " was able to treat " + thisPatient.getName() + "'s Lung cancer.");
            return true;
        } else {
            System.out.println(getName() + " wasn't able to treat the illness");
        }
        return false;
    }
}
