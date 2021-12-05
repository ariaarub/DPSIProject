public class DataPatient {
    private String name
                ,gender
                ,birth
                ,address;
    private long id = 0;
    public String[] compiledData = new String[5];

    public void setName(String Name){
        name = Name;
    }

    public void setGender(String Gender){
        gender = Gender;
    }

    public void setBirth(String Birth){
        birth = Birth;
    }

    public void setAddress(String Address){
        address = Address;
    }

    public void setId(long Id){
        id = Id;
    }

    public void setCompiledData(){
        for(int i = 0; i < compiledData.length; i++){
            switch(i){
                case 0: compiledData[i] = name; break;
                case 1: compiledData[i] = gender; break;
                case 2: compiledData[i] = birth; break;
                case 3: compiledData[i] = address; break;
                case 4: compiledData[i] = Long.toString(id); break;
            }
        }
    }
}
