package thegeocacher.web.map;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/map/tiles/*")
public class MapServlet extends HttpServlet
{
	private static final Logger LOGGER = Logger.getLogger(MapServlet.class.getSimpleName());

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		LOGGER.info("get map tile for " + request.getPathInfo());
		// Long id = Long.valueOf(request.getPathInfo().substring(1));
		// Image image = service.find(id);
		// response.setContentType(getServletContext().getMimeType(image.getName()));
		// response.setContentLength(image.getBytes().length);
		// response.getOutputStream().write(image.getBytes());
	}

}