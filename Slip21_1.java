import java.io.*;

class Student
{
	int rollno;
    String name;
    double percentage;
    static int count=0;
     
    Student()
    {     
    	rollno=1;
        name="ABC";
        percentage=78.00;
    }     
      
	Student(int r,String n,double per)
    {
		rollno=r;
        name=n;
        percentage=per;
        count++;
        System.out.println(" Number of object created are : "+count);
    }

	public String toString()
    {       
    	return ("\n Roll no := "+rollno+"\n  Name := "+name+"\n  Percentage := "+percentage);
    }
}


class Slip21_1
{
	public static void main(String args[]) throws IOException
    {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Student s=new Student();
        System.out.println(s);
         
        System.out.println("\nhow many object you  want to create : ")  ;
        int no=Integer.parseInt(br.readLine());
        Student s1[]=new Student[no];
        for(int i=0;i<no;i++)
        {
        	System.out.println("\nEnter Roll number : ");
      		int r=Integer.parseInt(br.readLine())   ;
            System.out.println("\nEnter name : ");
            String n=br.readLine();      
            System.out.println("\n Percentage are : ");
            double per=Double.parseDouble(br.readLine());
            s1[i]=new Student(r,n,per);       
            //System.out.println("\n Student details before sorting");
            System.out.println(s1[i]);
		}          
        System.out.println("\n Student details after sorting");
        sortStudent(s1,no);
        for(int i=0;i<no;i++)
        System.out.println(s1[i]);          
	}
         
    static void sortStudent(Student s[],int no)
    {
    	Student s2=new Student();
        for(int i=1;i<no;i++)
        {
        	for(int j=0;j<no-i;j++)
          	{
 				if(s[j].percentage>s[j+1].percentage)   	
 				{
 					s2=s[j];
 					s[j]=s[j+1];
 					s[j+1]=s2;
 				}
     		}
		}
	}
}