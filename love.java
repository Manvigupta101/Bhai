package love;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.*;
import java.io.*;

@WebServlet("/love")
public class love extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        pw.println("<!DOCTYPE html>");
        pw.println("<html lang='en'>");
        pw.println("<head>");
        pw.println("<meta charset='UTF-8'>");
        pw.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        pw.println("<title>Message for Bhai</title>");
        pw.println("<style>");
        pw.println("body {");
        pw.println("  background: linear-gradient(135deg, #ffecd2 0%, #fcb69f 100%);");
        pw.println("  display: flex;");
        pw.println("  justify-content: center;");
        pw.println("  align-items: center;");
        pw.println("  height: 100vh;");
        pw.println("  font-family: 'Comic Sans MS', cursive;");
        pw.println("  margin: 0;");
        pw.println("}");
        pw.println(".message-box {");
        pw.println("  background: #fff;");
        pw.println("  padding: 40px;");
        pw.println("  border-radius: 20px;");
        pw.println("  box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);");
        pw.println("  text-align: center;");
        pw.println("}");
        pw.println(".message-box h1 {");
        pw.println("  color: #e91e63;");
        pw.println("  font-size: 32px;");
        pw.println("  margin-bottom: 15px;");
        pw.println("}");
        pw.println(".message-box p {");
        pw.println("  font-size: 20px;");
        pw.println("  color: #444;");
        pw.println("}");
        pw.println("</style>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<div class='message-box'>");
        pw.println("<h1>Happy Birthday Bhai! 🎉</h1>");
        pw.println("<p>Thank You! So much for always being my support System! You are the best and I Miss you ❤️ I hope you loved my surprise </p>");
        pw.println("</div>");
        pw.println("</body>");
        pw.println("</html>");
    }
}

