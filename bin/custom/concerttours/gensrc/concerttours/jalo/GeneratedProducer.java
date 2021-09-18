/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 08.07.2021 17:02:55                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Concert;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Producer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProducer extends GenericItem
{
	/** Qualifier of the <code>Producer.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Producer.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Producer.concerts</code> attribute **/
	public static final String CONCERTS = "concerts";
	/**
	* {@link OneToManyHandler} for handling 1:n CONCERTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Concert> CONCERTSHANDLER = new OneToManyHandler<Concert>(
	ConcerttoursConstants.TC.CONCERT,
	false,
	"producer",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.code</code> attribute.
	 * @return the code - short unique code of producer
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.code</code> attribute.
	 * @return the code - short unique code of producer
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.code</code> attribute. 
	 * @param value the code - short unique code of producer
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.code</code> attribute. 
	 * @param value the code - short unique code of producer
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.concerts</code> attribute.
	 * @return the concerts
	 */
	public Set<Concert> getConcerts(final SessionContext ctx)
	{
		return (Set<Concert>)CONCERTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.concerts</code> attribute.
	 * @return the concerts
	 */
	public Set<Concert> getConcerts()
	{
		return getConcerts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.concerts</code> attribute. 
	 * @param value the concerts
	 */
	public void setConcerts(final SessionContext ctx, final Set<Concert> value)
	{
		CONCERTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.concerts</code> attribute. 
	 * @param value the concerts
	 */
	public void setConcerts(final Set<Concert> value)
	{
		setConcerts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to concerts. 
	 * @param value the item to add to concerts
	 */
	public void addToConcerts(final SessionContext ctx, final Concert value)
	{
		CONCERTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to concerts. 
	 * @param value the item to add to concerts
	 */
	public void addToConcerts(final Concert value)
	{
		addToConcerts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from concerts. 
	 * @param value the item to remove from concerts
	 */
	public void removeFromConcerts(final SessionContext ctx, final Concert value)
	{
		CONCERTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from concerts. 
	 * @param value the item to remove from concerts
	 */
	public void removeFromConcerts(final Concert value)
	{
		removeFromConcerts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.name</code> attribute.
	 * @return the name - name of producer
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.name</code> attribute.
	 * @return the name - name of producer
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.name</code> attribute. 
	 * @param value the name - name of producer
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.name</code> attribute. 
	 * @param value the name - name of producer
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
