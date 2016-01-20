package thegeocacher.web.map;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import thegeocacher.ejb.mapsforge.MapTileBean;

/**
 *
 * @author Jörg Friebel
 * @since 20.01.2015
 */
@WebServlet("/map/tiles/*")
public class MapServlet extends HttpServlet
{
	private static final Logger LOGGER = Logger.getLogger(MapServlet.class.getSimpleName());

	@EJB
	MapTileBean mapTileBean;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		LOGGER.info("get map tile for " + request.getPathInfo());

		String[] splits = request.getPathInfo().split("/");
		Byte zoom = Byte.valueOf(splits[1]);
		Integer x = Integer.valueOf(splits[2]);
		Integer y = Integer.valueOf(splits[3]);
		BufferedImage image = mapTileBean.getMapTile(zoom, x, y);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(image, "jpg", baos);
		baos.flush();
		byte[] imageInByteArray = baos.toByteArray();
		baos.close();

		response.setContentType(getServletContext().getMimeType("image/jpeg"));
		response.setContentLength(imageInByteArray.length);
		response.getOutputStream().write(imageInByteArray);
	}
}