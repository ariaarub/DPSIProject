import java.util.*;
public class App {
    static Scanner sc = new Scanner(System.in);
    static DataDoctor docData = new DataDoctor();
    static DataPatient patData = new DataPatient();
    static PatientRoom patRoom = new PatientRoom();
    static Work doctWork = new Work();

    public static void main(String[] args) throws Exception {
        int selection = 0;

        do {
            System.out.println("------------------------Hospital Information System------------------------");
            System.out.println("Type in their corresponding numbers to access menu\n");
            System.out.println("1. For Patients");
            System.out.println("2. For Doctors");
            System.out.println("3. Exit");
            selection = Integer.parseInt(sc.nextLine());
            switch(selection){
                case 1: Patients(); break;
                case 2: Doctors(); break;
                case 3: break;
                default: System.out.println("Invalid selection");
            }
        } while (selection != 3);
    }


    static void Patients(){
        int choice = 11;
        do {
            System.out.println("\n-----Patients-----");
            System.out.println("1. Set name (string)");
            System.out.println("2. Set gender (string)");
            System.out.println("3. Set birth (string)");
            System.out.println("4. Set address (string)");
            System.out.println("5. Set ID (integer)");
            System.out.println("6. Compile data");
            System.out.println("7. Save to room (Must compile first!)");
            System.out.println("8. Get patients from room (index)");
            System.out.println("9. Remove patients from room (index)");
            System.out.println("0. exit menu");
            System.out.println("-----Patients-----\nSelection: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1: System.out.println("Input: "); patData.setName(sc.nextLine()); break;
                case 2: System.out.println("Input: "); patData.setGender(sc.nextLine()); break;
                case 3: System.out.println("Input: "); patData.setBirth(sc.nextLine()); break;
                case 4: System.out.println("Input: "); patData.setAddress(sc.nextLine()); break;
                case 5: System.out.println("Input: "); patData.setId(Long.parseLong(sc.nextLine())); break;
                case 6: System.out.println("Input: "); patData.setCompiledData(); break;
                case 7: System.out.println("Input: "); patRoom.storePatData(patData.compiledData); break;
                case 8: System.out.println("Input: "); patRoom.getRoom(Integer.parseInt(sc.nextLine())); break;
                case 9: System.out.println("Input: "); patRoom.delData(Integer.parseInt(sc.nextLine())); break;
                case 0: break;
                default: System.out.println("Wrong input!");
            }
        } while (choice != 0);
    }

    static void Doctors(){
        int choice = 11;
        do {
            System.out.println("-----Doctor-----");
            System.out.println("1. Set name (string) ");
            System.out.println("2. Set address (string) ");
            System.out.println("3. Set ID (integer)");
            System.out.println("4. Compile and store");
            System.out.println("5. Get doctor data (index)");
            System.out.println("6. Check on patient (docID, patID)");
            System.out.println("7. Set prescription for patient (index + 1, string)");
            System.out.println("8. Exit");
            System.out.println("-----Doctor-----\nSelection: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1: System.out.println("Input: "); docData.setName(sc.nextLine()); break;
                case 2: System.out.println("Input: "); docData.setAddress(sc.nextLine()); break;
                case 3: System.out.println("Input: "); docData.setId(Long.parseLong(sc.nextLine())); break;
                case 4: System.out.println("Input: "); docData.setCompiledData(); docData.storeDocData(docData.compiledData); break;
                case 5: System.out.println("Input: "); docData.getDoctor(Integer.parseInt(sc.nextLine())); break;
                case 6: System.out.println("Input: "); doctWork.checkPatient(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())); break;
                case 7: System.out.println("Input: "); doctWork.setPrescription(Integer.parseInt(sc.nextLine()), sc.nextLine()); break;
                case 8: break;
                default: System.out.println("Wrong input!");
            }
        } while (choice != 8);
    }

}
