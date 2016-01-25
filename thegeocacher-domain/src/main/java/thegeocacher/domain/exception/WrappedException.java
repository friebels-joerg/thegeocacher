package thegeocacher.domain.exception;

/**
 *
 * @author Jörg Friebel
 * @since 25.01.2016
 */
public class WrappedException extends RuntimeException
{
	public WrappedException(Throwable aCause)
	{
		super(aCause);
	}
}