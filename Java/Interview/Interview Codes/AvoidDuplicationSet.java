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
   @Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		EMP other = (EMP) obj;
		return Objects.equals(name, other.name) && (id==other.id);
	}
}
class AvoidDuplicationSet
{
    public static void main(String []args)
    {
        EMP obj1=new EMP(1,"vikram");
        EMP obj2=new EMP(1,"vikram");
        EMP obj3=new EMP(1,"Nikhil");
        EMP obj4=new EMP(2,"anand");
        EMP obj5=new EMP(1,"Sanjay");
        HashSet<EMP> s=new HashSet<EMP>();
        s.add(obj1);
        s.add(obj2);
        s.add(obj3);
        s.add(obj4);
        for(EMP obj:s)
        System.out.println(obj.id+":"+obj.name);
    }
}