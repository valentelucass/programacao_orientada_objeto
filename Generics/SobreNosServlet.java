import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SobreNosServlet", urlPatterns = {"/sobre"})
public class SobreNosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"pt-BR\">");
        out.println("<head>");
        out.println("    <meta charset=\"UTF-8\">\n");
        out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        out.println("    <title>Sobre Nós - Home Service</title>");
        out.println("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@700;800&family=Roboto:wght@400;500&display=swap\" rel=\"stylesheet\">\n");
        out.println("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\">\n");
        out.println("    <link rel=\"stylesheet\" href=\"assets/css/base.css\">\n");
        out.println("    <link rel=\"stylesheet\" href=\"assets/css/pages.css\">\n");
        out.println("    <link rel=\"stylesheet\" href=\"assets/css/mobile.css\" media=\"(max-width: 992px)\">\n");
        out.println("</head>");
        out.println("<body>");

        // Header section
        out.println("    <header class=\"main-header\">\n" +
                "    <div class=\"container\">\n" +
                "        <a href=\"index.html\" class=\"logo\">HOME SERVICE</a>\n" +
                // Navigation omitted for brevity
                "    </div>\n" +
                "</header>");

        // Main content
        out.println("<main>\n" +
                "    <section class=\"page-section\">\n" +
                "        <div class=\"container\">\n" +
                "            <div class=\"page-header\">\n" +
                "                <h1>Sobre o Home Service</h1>\n" +
                "                <p class=\"section-subtitle\">Conectando clientes e profissionais com transparência e eficiência.</p>\n" +
                "            </div>\n" +
                "            <div class=\"page-content terms-content\">\n" +
                "                <h2>Nossa Missão</h2>\n" +
                "                <p>Nascemos da necessidade real de simplificar a contratação de serviços locais. O mercado tradicional é lento, caro e muitas vezes frustrante. Nossa missão é eliminar a fricção, conectar diretamente quem precisa com quem sabe fazer, de forma justa e sem intermediários que encarecem o serviço.</p>\n" +
                "                <hr>\n" +
                "                <h2>O Fundador</h2>\n" +
                "                <p>Augusto Tenório Godoi, fundador e CEO da Home Service, traz 10 anos de experiência em gestão de operações e atendimento. Com especialização em Pesquisa de Experiência do Usuário (UX Research) e vivência em projetos com Inteligência Artificial, ele lidera a empresa com foco em crescimento com propósito e uma abordagem humanizada aos negócios.</p>\n" +
                "                <hr>\n" +
                "                <h2>Nossos Valores</h2>\n" +
                "                <p>Agilidade, Transparência, Justiça e Inclusão. Esses são os pilares que sustentam cada decisão que tomamos na Home Service.</p>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </section>\n" +
                "</main>");

        // Footer section
        out.println("<footer class=\"main-footer-section\">\n" +
                "    <div class=\"container\">\n" +
                "        <div class=\"footer-grid\">\n" +
                "            <!-- Footer content here -->\n" +
                "        </div>\n" +
                "        <div class=\"footer-bottom\">\n" +
                "            <p>© 2025 Home Service. Todos os direitos reservados a @valentelucass.</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</footer>");

        out.println("</body>");
        out.println("</html>");
    }
}
