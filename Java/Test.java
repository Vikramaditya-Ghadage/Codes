public class Crop {
    int id;
    String name;
    Crop(){}
    Crop(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}

public class Fertilizer {
    int id;
    String name;
    Fertilizer(){}
    Fertilizer(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
}
public class Farmer {
    int id;
    String license;
    String firstName;
    List<Crop> crops;
    List<Fertilizer> fertilizers;
    Farmer(){}
    Farmer(int id,String license,String firstName,List<Crop> crops,List<Fertilizer> fertilizers)
    {
        this.id=id;
        this.license=license;
        this.firstName=firstName;
        this.crops=crops;
        this.fertilizers=fertilizers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }

    public List<Fertilizer> getFertilizers() {
        return fertilizers;
    }

    public void setFertilizers(List<Fertilizer> fertilizers) {
        this.fertilizers = fertilizers;
    }

    public static List<Crop> getCrop(List<Farmer> obj_list)
    {
        List<Crop> ans=new ArrayList<Crop>();
        for(int i=0;i<obj_list.size();i++)
        {
            List<Crop> temp=obj_list.get(i).getCrops();
            ans.addAll(temp);
            
        }
        return ans;
    }

}

class Test
{
    public static void main(String []args)
    {
        List<Crop> crop1=new ArrayList<Crop>();
        crop1.add(new Crop((1,"cherry")));
        crop1.add(new Crop((1,"chorn")));

        List<Fertilizer> fer=new ArrayList<Fertilizer>();

        Fertilizer f1=new Fertilizer(1,"Acephate");
        Fertilizer f2=new Fertilizer(2,"traiazop");

        fer.add(f1);
        fer.add(f2);


        List<Crop> crop2=new ArrayList<Crop>();

        crop2.add(new Crop((1,"cherry")));
        crop2.add(new Crop((1,"cherry")));

        List<Fertilizer> fer2=new ArrayList<Fertilizer>();
        crop2.add(new Crop((1,"cherry")));
        crop2.add(new Crop((1,"cherry")));


        Farmer obj1=new farmer(1,"demo","vikram",crop,fer);
        Farmer obj2=new farmer(1,"demo","xyz",crop,fer);

    }

}


