package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App {

	public static void main(String[] args) {
		
		int rollno=104;
		String name="Aeepak";
		float marks=91.5f;
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
		
		//--------Insert Operation--------------
		String insert_query="insert into student values(?,?,?)";
		
		int count=jdbcTemplate.update(insert_query,rollno,name,marks);
		
		if(count>0)
		{
			System.out.println("Insertion Success........");
		}
		else
		{
			System.out.println("Insertion Failed..........");
		}
		
		
		//-----------Update Operation
		float umarks=98.3f;
		int urollno=101;
		
		String update_query="update student set marks=? where rollno=?";
		int ucount=jdbcTemplate.update(update_query,umarks,urollno);
		if(ucount>0)
		{
			System.out.println("Updation Success");
		}
		else
		{
			System.out.println("Updation Failed");
		}
		
		
		
		
		//----------Delete Operation
		int drollno=103;
		
		String delete_query="delete from student where rollno=?";
		int dcount=jdbcTemplate.update(delete_query,drollno);
		if(dcount>0)
		{
			System.out.println("Deletion Success");
		}
		else
		{
			System.out.println("Deletion Failed");
		}
		
		
		//Select Operation
		String select_query="select* from student";
		jdbcTemplate.query(select_query,(rs,rowNum)->{
			System.out.println("Roll No: " + rs.getInt("rollno"));
		    System.out.println("Name: " + rs.getString("name"));
		    System.out.println("Marks: " + rs.getFloat("marks"));
		    return null;
		});
	}
}
