import java.util.ArrayList;

public class DataDoctor {
    private String name, address;
    private long id = 0;
    public String[] compiledData = new String[3];
    public static ArrayList<ArrayList<String>> Doctors = new ArrayList<ArrayList<String>>();
    private static String[] modifiers = { "Name:", "Address:", "ID:" };

    public void setName(String Name) {
        name = Name;
    }

    public void setAddress(String Address) {
        address = Address;
    }

    public void setId(long Id) {
        id = Id;
    }

    public void getDoctor(int index) {
        for (int i = 0; i < 3; i++)
            System.out.printf("%s\t\t %s\n", modifiers[i], Doctors.get(index).get(i));
    }

    public void setCompiledData() {
        for (int i = 0; i < compiledData.length; i++) {
            switch (i) {
                case 0:
                    compiledData[i] = name;
                    break;
                case 1:
                    compiledData[i] = address;
                    break;
                case 2:
                    compiledData[i] = Long.toString(id);
                    break;
            }
        }
    }

    static void initializeList() {
        Doctors.add(new ArrayList<String>());
    }

    public void storeDocData(String[] data){
        initializeList();
        System.out.println(Doctors.size());
        for(int i = 0; i < data.length; i++)
        Doctors.get(Doctors.size() - 1).add(i, data[i]);
        System.out.println(Doctors.size());
    }

}
