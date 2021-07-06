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
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BandLeader}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBandLeader extends GenericItem
{
	/** Qualifier of the <code>BandLeader.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>BandLeader.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>BandLeader.birthday</code> attribute **/
	public static final String BIRTHDAY = "birthday";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(BIRTHDAY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandLeader.birthday</code> attribute.
	 * @return the birthday - birthday
	 */
	public Integer getBirthday(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BIRTHDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandLeader.birthday</code> attribute.
	 * @return the birthday - birthday
	 */
	public Integer getBirthday()
	{
		return getBirthday( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandLeader.birthday</code> attribute. 
	 * @return the birthday - birthday
	 */
	public int getBirthdayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBirthday( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandLeader.birthday</code> attribute. 
	 * @return the birthday - birthday
	 */
	public int getBirthdayAsPrimitive()
	{
		return getBirthdayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandLeader.birthday</code> attribute. 
	 * @param value the birthday - birthday
	 */
	public void setBirthday(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BIRTHDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandLeader.birthday</code> attribute. 
	 * @param value the birthday - birthday
	 */
	public void setBirthday(final Integer value)
	{
		setBirthday( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandLeader.birthday</code> attribute. 
	 * @param value the birthday - birthday
	 */
	public void setBirthday(final SessionContext ctx, final int value)
	{
		setBirthday( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandLeader.birthday</code> attribute. 
	 * @param value the birthday - birthday
	 */
	public void setBirthday(final int value)
	{
		setBirthday( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandLeader.code</code> attribute.
	 * @return the code - short unique code of leader
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandLeader.code</code> attribute.
	 * @return the code - short unique code of leader
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandLeader.code</code> attribute. 
	 * @param value the code - short unique code of leader
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandLeader.code</code> attribute. 
	 * @param value the code - short unique code of leader
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandLeader.name</code> attribute.
	 * @return the name - name of band leader
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandLeader.name</code> attribute.
	 * @return the name - name of band leader
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandLeader.name</code> attribute. 
	 * @param value the name - name of band leader
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandLeader.name</code> attribute. 
	 * @param value the name - name of band leader
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
