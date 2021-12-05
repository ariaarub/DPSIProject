import java.util.ArrayList;

public class PatientRoom {
    public static ArrayList<ArrayList<String>> Patients = new ArrayList<ArrayList<String>>();
    private static String[] modifiers = {"Name","Gender","DOB","Address","ID","Prescription"};


    static void initializeList(){
        Patients.add(new ArrayList<String>());
    }

    public void getRoom(int index){
        try{
            for(int i=0; i < 6; i++){
                System.out.printf("%s\t\t %s\n", modifiers[i], Patients.get(index).get(i) == null ? "" : Patients.get(index).get(i));
            }
        }
        catch(Exception e){
            System.out.println("No patients!");
        }
    }

    public void storePatData(String[] data){
        initializeList();
        for(int i = 0; i < data.length; i++)
            Patients.get(Patients.size() - 1).add(i, data[i]);
    }

    public void storeData(int index, String data){
        Patients.get(index - 1).add(data);
    }

    public void delData(int index){
        try{
            Patients.remove(index);
            System.out.println("Patients removed!");
        }
        catch(Exception e){
            System.out.println("No patients to be removed!");
        } 
    }
    
}
