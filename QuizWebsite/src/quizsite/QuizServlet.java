package quizsite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext a = request.getServletContext();
		Quiz quiz = (Quiz) a.getAttribute("quiz");
		
		String question_response_string = request.getParameter("question_response");
		String fill_in_blank_string = request.getParameter("fill_in_blank");
		String multiple_choice_string = request.getParameter("multiple_choice");
		String picture_response_string = request.getParameter("picture_response");
		
		int question_response_value = Integer.parseInt(question_response_string);
		int fill_in_blank_value = Integer.parseInt(fill_in_blank_string);
		int multiple_choice_value = Integer.parseInt(multiple_choice_string);
		int picture_response_value = Integer.parseInt(picture_response_string);
		quiz.setFillInBlank(fill_in_blank_value);
		quiz.setNumMultipleChoice(multiple_choice_value);
		quiz.setNumPictureResponse(picture_response_value);
		quiz.setNumQuestionResponse(question_response_value);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("createQuestions.jsp");
		dispatch.forward(request, response);
		
	
	}
}
