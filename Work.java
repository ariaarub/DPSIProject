

public class Work {
    PatientRoom patRoom = new PatientRoom();
    DataDoctor doctor = new DataDoctor();

    public void checkPatient(int docId, int patientId){

        DataDoctor.Doctors.forEach((n) -> {
            String docName = "";
            if (n.contains(Integer.toString(docId))){ docName = n.get(0);
            System.out.printf("Doctor %s\n", docName);}
        });

        PatientRoom.Patients.forEach((n) -> {
            String patName = "";
            if (n.contains(Integer.toString(patientId))) {patName = n.get(0); System.out.printf("Is checking on patient %s\n",patName);}
        });

    }

    public void setPrescription(int index, String drugs){
        patRoom.storeData(index, drugs);
        System.out.printf("%s prescription successfully prescribed!", drugs);
    }

}
