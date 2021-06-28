/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28.06.2021 21:57:39                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Band;
import concerttours.jalo.Concert;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Song}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSong extends GenericItem
{
	/** Qualifier of the <code>Song.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Song.band</code> attribute **/
	public static final String BAND = "band";
	/** Qualifier of the <code>Song.musicType</code> attribute **/
	public static final String MUSICTYPE = "musicType";
	/** Qualifier of the <code>Song.authors</code> attribute **/
	public static final String AUTHORS = "authors";
	/** Qualifier of the <code>Song.singers</code> attribute **/
	public static final String SINGERS = "singers";
	/** Qualifier of the <code>Song.concerts</code> attribute **/
	public static final String CONCERTS = "concerts";
	/** Relation ordering override parameter constants for Song2Concert from ((concerttours))*/
	protected static String SONG2CONCERT_SRC_ORDERED = "relation.Song2Concert.source.ordered";
	protected static String SONG2CONCERT_TGT_ORDERED = "relation.Song2Concert.target.ordered";
	/** Relation disable markmodifed parameter constants for Song2Concert from ((concerttours))*/
	protected static String SONG2CONCERT_MARKMODIFIED = "relation.Song2Concert.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(BAND, AttributeMode.INITIAL);
		tmp.put(MUSICTYPE, AttributeMode.INITIAL);
		tmp.put(AUTHORS, AttributeMode.INITIAL);
		tmp.put(SINGERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.authors</code> attribute.
	 * @return the authors - authors
	 */
	public Collection<String> getAuthors(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, AUTHORS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.authors</code> attribute.
	 * @return the authors - authors
	 */
	public Collection<String> getAuthors()
	{
		return getAuthors( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.authors</code> attribute. 
	 * @param value the authors - authors
	 */
	public void setAuthors(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, AUTHORS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.authors</code> attribute. 
	 * @param value the authors - authors
	 */
	public void setAuthors(final Collection<String> value)
	{
		setAuthors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.band</code> attribute.
	 * @return the band - band
	 */
	public Band getBand(final SessionContext ctx)
	{
		return (Band)getProperty( ctx, BAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.band</code> attribute.
	 * @return the band - band
	 */
	public Band getBand()
	{
		return getBand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.band</code> attribute. 
	 * @param value the band - band
	 */
	public void setBand(final SessionContext ctx, final Band value)
	{
		setProperty(ctx, BAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.band</code> attribute. 
	 * @param value the band - band
	 */
	public void setBand(final Band value)
	{
		setBand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.code</code> attribute.
	 * @return the code - short unique code of song
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.code</code> attribute.
	 * @return the code - short unique code of song
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.code</code> attribute. 
	 * @param value the code - short unique code of song
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.code</code> attribute. 
	 * @param value the code - short unique code of song
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.concerts</code> attribute.
	 * @return the concerts
	 */
	public Collection<Concert> getConcerts(final SessionContext ctx)
	{
		final List<Concert> items = getLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.SONG2CONCERT,
			"Concert",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.concerts</code> attribute.
	 * @return the concerts
	 */
	public Collection<Concert> getConcerts()
	{
		return getConcerts( getSession().getSessionContext() );
	}
	
	public long getConcertsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ConcerttoursConstants.Relations.SONG2CONCERT,
			"Concert",
			null
		);
	}
	
	public long getConcertsCount()
	{
		return getConcertsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.concerts</code> attribute. 
	 * @param value the concerts
	 */
	public void setConcerts(final SessionContext ctx, final Collection<Concert> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.SONG2CONCERT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SONG2CONCERT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.concerts</code> attribute. 
	 * @param value the concerts
	 */
	public void setConcerts(final Collection<Concert> value)
	{
		setConcerts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to concerts. 
	 * @param value the item to add to concerts
	 */
	public void addToConcerts(final SessionContext ctx, final Concert value)
	{
		addLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.SONG2CONCERT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SONG2CONCERT_MARKMODIFIED)
		);
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
		removeLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.SONG2CONCERT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SONG2CONCERT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from concerts. 
	 * @param value the item to remove from concerts
	 */
	public void removeFromConcerts(final Concert value)
	{
		removeFromConcerts( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Concert");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(SONG2CONCERT_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.musicType</code> attribute.
	 * @return the musicType - music type
	 */
	public EnumerationValue getMusicType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MUSICTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.musicType</code> attribute.
	 * @return the musicType - music type
	 */
	public EnumerationValue getMusicType()
	{
		return getMusicType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.musicType</code> attribute. 
	 * @param value the musicType - music type
	 */
	public void setMusicType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MUSICTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.musicType</code> attribute. 
	 * @param value the musicType - music type
	 */
	public void setMusicType(final EnumerationValue value)
	{
		setMusicType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.singers</code> attribute.
	 * @return the singers - singers
	 */
	public Map<String,String> getAllSingers(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, SINGERS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.singers</code> attribute.
	 * @return the singers - singers
	 */
	public Map<String,String> getAllSingers()
	{
		return getAllSingers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.singers</code> attribute. 
	 * @param value the singers - singers
	 */
	public void setAllSingers(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, SINGERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.singers</code> attribute. 
	 * @param value the singers - singers
	 */
	public void setAllSingers(final Map<String,String> value)
	{
		setAllSingers( getSession().getSessionContext(), value );
	}
	
}
