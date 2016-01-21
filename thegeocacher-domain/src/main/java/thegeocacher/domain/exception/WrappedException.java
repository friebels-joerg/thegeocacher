package thegeocacher.domain.exception;

public class WrappedException extends RuntimeException
{
	public WrappedException(Throwable cause)
	{
		super(cause);
	}
}