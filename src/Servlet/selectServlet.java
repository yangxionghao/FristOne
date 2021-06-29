package Servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Bean.shengfen;
import Dao.Dao;

/**
 * Servlet implementation class selectServlet
 */
@WebServlet("/selectServlet")
public class selectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		select(request,response);
	}

	private void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     request.setCharacterEncoding("UTF-8");
         String starttime = request.getParameter("time");
         System.out.println(starttime);
         Dao dao = new Dao();
         java.util.List<shengfen> list = dao.selecttime(starttime);
         System.out.println(list);
         if(list != null) {
         	request.setAttribute("list", list);
     		request.getRequestDispatcher("world_map.jsp").forward(request, response);
         }else {
         	request.setAttribute("message", "数据获取失败！");
     		request.getRequestDispatcher("world_map.jsp").forward(request, response);
         }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
