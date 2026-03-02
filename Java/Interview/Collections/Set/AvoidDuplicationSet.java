package Interview.Collections.Set;
import java.util.*;
class EMP
{
    int id;
    String name;
    EMP(){}
    EMP(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

	// public int hashCode() {
	// 	return Objects.hash(id, name);
	// }

	// public boolean equals(Object obj) {
	// 	EMP other = (EMP) obj;
	// 	// return Objects.equals(name, other.name) && (id==other.id);
    //     return name.equals(other.name) && (id==other.id);
	// }

    public int hashCode()
    {
        return Objects.hash(id,name.toLowerCase());
    }

    public boolean equals(Object obj2)
    {
        EMP emp=(EMP)obj2;
        return id==emp.id && name.equalsIgnoreCase(emp.name);
    }

}
class AvoidDuplicationSet
{
    public static void main(String []args)
    {
        EMP obj1=new EMP(1,"Vikram");
        EMP obj2=new EMP(1,"vikram");
        EMP obj3=new EMP(1,"Nikhil");
        EMP obj4=new EMP(2,"Anand");
        EMP obj5=new EMP(3,"Sanjay");
        
        LinkedHashSet<EMP> s=new LinkedHashSet<EMP>();
        s.add(obj1);
        s.add(obj2);
        s.add(obj3);
        s.add(obj4);
        s.add(obj5);
        for(EMP obj:s)
        System.out.println(obj.id+":"+obj.name);
        // s.forEach((e)-> {System.out.println(e.id+":"+e.name);});
    }


}