package quizsite;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class QuizServlet
 */
@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public QuizServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		HttpSession session = request.getSession();
		DBConnection con = (DBConnection) session.getAttribute("connection");
		if(con == null) {
			con = new DBConnection();
			session.setAttribute("connection", con);
			//System.out.println("con is NULL");
		}
		
		Quiz quiz = new Quiz();
		int qzID = quiz.getID();
		User currUser = (User) session.getAttribute("user");

		Quiz.registerQuiz(qzID, con, currUser);
		
		session.setAttribute("newQuiz", quiz);
		RequestDispatcher dispatch = request.getRequestDispatcher("createQuiz.jsp");
		dispatch.forward(request, response);
	}
}
