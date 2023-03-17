package login2;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login2")
public class loginservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	 
	}

	public ServletConfig getServletConfig() {		// TODO Auto-generated method stub
		return null;
		
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {


		
		
	}



	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
				response.setCharacterEncoding("utf-8");
				response.setContentType("text/html;charset=utf-8");
				String id =request.getParameter("user_id");
				String pw =request.getParameter("user_pw");
				String data = "<html>";
				data +="<body>";
				data +="Id: "+ id;
				data +="<br>";
				data +="pw :"+ pw;
				data +="</body>";
			    data +=	"</html>";	
			   PrintWriter out = response.getWriter();
			   out.print(data);
				
			}



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}

}
