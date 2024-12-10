package och01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Add3
 */
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 이게 없으면 한글이 깨질 수 있음. 밑에 utf-8도 마찬가지 (반드시 세팅)
		request.setCharacterEncoding("utf-8");
		System.out.println("doGet start... ");
		// num의 누적분을 return 목표
		// 숫자인데 text로 받았기 때문에 parseInt로 변환
		int num = Integer.parseInt(request.getParameter("num"));
		String han = request.getParameter("han");
		int sum = 0;
		// 1부터 num까지 누적해서 더함
		for (int i = 1; i <= num; i++) {
		    sum += i;
		}

		// browser에 Display 하기 위한 방법
		response.setContentType("text/html;charset=utf-8");
		// browser에 상세내용을 보여줌
		// response로 getWriter를 써서 PrintWriter 객체를 만듦.
		PrintWriter out = response.getWriter();
		// PrintWriter로 만든 객체 out을 사용해서 화면에 출력될 화면구성
		out.println("<html><body>");
		out.println("<h1> 1부터 "+num+"까지 합계 Get<h1>");
		out.printf("<h1>han Test : %s</h1>", han);
		out.printf("<h1>1부터 %d까지 합계</h1>", num);		
		out.println(sum);
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("doPost start... ");
		// num의 누적분을 return 목표
		int num = Integer.parseInt(request.getParameter("num"));
		String han = request.getParameter("han");
		int sum = 0;
		for (int i = 1; i <= num; i++) {
		    sum += i;
		}

		// browser에 Display 하기 위한 방법
		response.setContentType("text/html;charset=utf-8");
		// browser에 상세내용을 보여줌
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1> 1부터 "+num+"까지 합계 Post<h1>");
		out.printf("<h1>han Test : %s</h1>", han);
		out.printf("<h1>1부터 %d까지 합계</h1>", num);		
		out.println(sum);
		out.println("</body></html>");
		out.close();
	}

}
