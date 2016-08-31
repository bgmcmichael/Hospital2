/**
 * Created by fenji on 8/29/2016.
 */
public class GeneralPractitionerDoc extends Doctor{

    public GeneralPractitionerDoc(String name) {
        super(name);
        setIllnessToCure(Diseases.COMMON_COLD);
    }

    @Override
    public boolean treatIllness(Patient thisPatient) {
        if (thisPatient.getDisease() == getIllnessToCure()){
            thisPatient.setTreated(true);
            System.out.println(getName() + " was able to treat " + thisPatient.getName() + "'s Common cold.");
            return true;
        }
        return false;
    }
}
