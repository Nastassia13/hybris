/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 06.07.2021 11:51:40                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem DateToken}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDateToken extends GenericItem
{
	/** Qualifier of the <code>DateToken.token</code> attribute **/
	public static final String TOKEN = "token";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TOKEN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateToken.token</code> attribute.
	 * @return the token - token
	 */
	public Date getToken(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TOKEN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateToken.token</code> attribute.
	 * @return the token - token
	 */
	public Date getToken()
	{
		return getToken( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateToken.token</code> attribute. 
	 * @param value the token - token
	 */
	public void setToken(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TOKEN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateToken.token</code> attribute. 
	 * @param value the token - token
	 */
	public void setToken(final Date value)
	{
		setToken( getSession().getSessionContext(), value );
	}
	
}
