package webexpac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableServlet
 */
@WebServlet("/Table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			doPost(request, response);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setCharacterEncoding("utf-8");
		String row = request.getParameter("r");
		String col = request.getParameter("c");
		int nRow;
		if( row != null){
			nRow = Integer.parseInt(row);
		}else {
			nRow = 3;
		}
		int nCol;
		if( col != null){
			nCol = Integer.parseInt(col);
		}else {
			nCol = 3;
		}
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=utf-8");
		out.print("<table border ='1px' cellspacing = '0' cellpadding = '10px'>");
		
		for (int i = 0; i < nRow; i++) {
			out.print("<tr>");
			for (int j = 0; j < nCol; j++) {
				out.print("<td> 셀(" + i + ","+ j +")</td>");
			}
		}
		
		
//		out.print("<% for (int i = 0; i < nRow; i++) {  %>");
//		out.print("<tr>");
//		out.print("<% for (int j = 0; j < nCol; i++) {  %>");		
//		out.print("<td>");
//		out.print("cell(<%=i%>,<%=j %>)");
//		out.print("</td>");	
		
		/*out.print("<td> 셀(0,0)</td>");
		out.print("<td> 셀(0,1)</td>");
		out.print("<td>cell(0,2)</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>cell(1,0)</td>");
		out.print("<td>cell(1,1)</td>");
		out.print("<td>cell(1,2)</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>cell(2,0)</td>");
		out.print("<td>cell(2,1)</td>");
		out.print("<td>cell(2,2)</td>");
		out.print("</tr>");
		out.print("</table>");*/
	}

}
