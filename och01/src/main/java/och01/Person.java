package och01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Person
 */
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	// 1129 홈워크
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// 배열인 경우: request 객체의 getParameterValues(“매개변수이름”)으로 처리
		//메일 수신은 배열로. 나머지는 오늘 한것과,,비슷?
		String gender = request.getParameter("gender");
		String[] notice = request.getParameterValues("notice");
		String job = request.getParameter("job");
		
		out.println("<html><body><h1>개인정보</h1>");
		out.println("이름: " +name+ "<p>");
		out.println("아이디: " +id+ "<p>");
		out.println("암호: " +password+ "<p>");
		out.println("성별: " +gender+ "<p>");
		out.println("수신메일: ");			
		int i;
		for(i=0 ; i< notice.length; i++) {
			out.println(notice[i]);			
		}
		out.println("<p>");			
		out.println("직업: " +job+ "<p>");
	}

}
