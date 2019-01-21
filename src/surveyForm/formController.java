package surveyForm;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class formController extends HttpServlet{
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
		   
			   int set1a=0, set1b=0, set2a=0, set2b=0, set3a=0, set3b=0, set4a=0, set4b=0;
			   String s;
			   
			   for(int i=1; i<=10; i++)
			   {
				   s = String.format("q1-%d", i);
				   System.out.println(s);
				   String opt = request.getParameter(s);
				   System.out.println(opt);
				   if(opt==null)
					   continue;
				   else if(opt.equals("A"))
					   set1a++;
				   else if(opt.equals("B"))
					   set1b++;
			   }
			   

			   for(int i=1; i<=20; i++)
			   {
				   s = String.format("q2-%d", i);
				   String opt = request.getParameter(s);
				   if(opt==null)
					   continue;
				   else if(opt.equals("A"))
					   set2a++;
				   else if(opt.equals("B"))
					   set2b++;
			   }

			   for(int i=1; i<=20; i++)
			   {
				   s = String.format("q3-%d", i);
				   String opt = request.getParameter(s);
				   if(opt==null)
					   continue;
				   else if(opt.equals("A"))
					   set3a++;
				   else if(opt.equals("B"))
					   set3b++;
			   }
			   

			   for(int i=1; i<=20; i++)
			   {
				   s = String.format("q4-%d", i);
				   String opt = request.getParameter(s);
				   if(opt==null)
					   continue;
				   else if(opt.equals("A"))
					   set4a++;
				   else if(opt.equals("B"))
					   set4b++;
			   }
			   
			   System.out.println(set1a);
			   System.out.println(set1b);
			   System.out.println(set2a);
			   System.out.println(set2b);
			   System.out.println(set3a);
			   System.out.println(set3b);
			   System.out.println(set4a);
			   System.out.println(set4b);
			  response.setContentType("text/html");
		      PrintWriter pw=response.getWriter();
		      pw.write("<h2> Following data received sucessfully.. <h2> <br>");
		      /*
		       * For updating results
		       * modify the output statements
		      */
		      if(set1a>set1b)
		    	  pw.write("<h3> Set 1 result: A </h3>");
		      else pw.write("<h3> Set 1 result: B </h3>");
		      

		      if(set2a>set2b)
		    	  pw.write("<h3> Set 2 result: A </h3>");
		      else pw.write("<h3> Set 2 result: B </h3>");
		      

		      if(set3a>set3b)
		    	  pw.write("<h3> Set 3 result: A </h3>");
		      else pw.write("<h3> Set 3 result: B </h3>");
		      

		      if(set4a>set4b)
		    	  pw.write("<h3> Set 4 result: A </h3>");
		      else pw.write("<h3> Set 4 result: B </h3>");
		     
			   
	   }
}
