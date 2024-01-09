import java.io.DataInputStream;
class Students{
    int rollno;
    void getRollno(int x){
        rollno=x;
    }
    void putRoll(){
        System.out.println("Roll No ="+rollno);
    }
}
class Test extends Students{
    int mark1,mark2;
    void getMaks(int x,int y){
    mark1=x;
    mark2=y;
    }
    void putMarks(){
        System.out.println("Mark 1="+mark1+"\n  Mark 2="+mark2);
    }
}
interface Sports{
    final float spmarks=6.5f;
    void putSportsMarks();
}
class Score extends Test implements Sports{
    public void putSportsMarks(){
        System.out.println("Sports Mark ="+spmarks);
        }
        void putTotalMark(){
        float total=mark1+mark2+spmarks;
        System.out.println("Total Marks="+total);
    }
}
class StudentInterface{
    public static void main(String args[]){
        try{
            DataInputStream in=new DataInputStream(System.in);
            Score s=new Score();
            System.out.println("Enter the Roll no :");
            int r=Integer.parseInt(in.readLine());
            s.getRollno(r);
            System.out.println("Enter the Mark 1 and Mark 2 :");
            int m1=Integer.parseInt(in.readLine());
            int m2=Integer.parseInt(in.readLine());
            s.getMaks(m1,m2);
            System.out.println("\n STUDENT DETAILS \n .............. \n");
            s.putRoll();
            s.putMarks();
            s.putSportsMarks();
            s.putTotalMark();
        }catch (Exception e){}            
        }
    }
