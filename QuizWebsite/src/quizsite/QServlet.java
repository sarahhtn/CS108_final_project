package quizsite;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class QServlet
 */
@WebServlet("/QServlet")
public class QServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public QServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Quiz qz = (Quiz) session.getAttribute("quiz");
		Question newQn;
		String question = request.getParameter("question");
		String answer = request.getParameter("answer");
		String type = request.getParameter("type");
		switch(Integer.parseInt(type)){
			case 1: newQn = new QResponse(question, answer);
				break;
			case 2: newQn = new FillIn(question, answer);
				break;
			case 3: newQn =  new MultiChoice(question, answer);
				String choices = request.getParameter("choices");
				((MultiChoice) newQn).addMCOptions(choices);
			case 4: newQn = new PictureResponse(question, answer);
				break;
			default: newQn = null;
				break;
		}
		if(newQn.equals(null)) qz.addQuestion(newQn);
		
		 String action = request.getParameter("action");
		 if(action.equals("Create & Continue")){
			RequestDispatcher dispatch = request.getRequestDispatcher("chooseQuestionType.jsp");
			dispatch.forward(request, response);
		 }else if(action.equals("Create & Finish Quiz")){
			RequestDispatcher dispatch = request.getRequestDispatcher("optionsQuiz.jsp");
			dispatch.forward(request, response); 
		 }

	}

}
