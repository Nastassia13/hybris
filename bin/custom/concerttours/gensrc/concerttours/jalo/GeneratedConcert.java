/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 08.07.2021 17:02:55                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Producer;
import concerttours.jalo.Song;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct Concert}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedConcert extends VariantProduct
{
	/** Qualifier of the <code>Concert.venue</code> attribute **/
	public static final String VENUE = "venue";
	/** Qualifier of the <code>Concert.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Concert.concertType</code> attribute **/
	public static final String CONCERTTYPE = "concertType";
	/** Qualifier of the <code>Concert.songs</code> attribute **/
	public static final String SONGS = "songs";
	/** Relation ordering override parameter constants for Song2Concert from ((concerttours))*/
	protected static String SONG2CONCERT_SRC_ORDERED = "relation.Song2Concert.source.ordered";
	protected static String SONG2CONCERT_TGT_ORDERED = "relation.Song2Concert.target.ordered";
	/** Relation disable markmodifed parameter constants for Song2Concert from ((concerttours))*/
	protected static String SONG2CONCERT_MARKMODIFIED = "relation.Song2Concert.markmodified";
	/** Qualifier of the <code>Concert.producer</code> attribute **/
	public static final String PRODUCER = "producer";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedConcert> PRODUCERHANDLER = new BidirectionalOneToManyHandler<GeneratedConcert>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VENUE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(CONCERTTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.concertType</code> attribute.
	 * @return the concertType - type of concert (indoors or open air)
	 */
	public EnumerationValue getConcertType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CONCERTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.concertType</code> attribute.
	 * @return the concertType - type of concert (indoors or open air)
	 */
	public EnumerationValue getConcertType()
	{
		return getConcertType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.concertType</code> attribute. 
	 * @param value the concertType - type of concert (indoors or open air)
	 */
	public void setConcertType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CONCERTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.concertType</code> attribute. 
	 * @param value the concertType - type of concert (indoors or open air)
	 */
	public void setConcertType(final EnumerationValue value)
	{
		setConcertType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PRODUCERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.date</code> attribute.
	 * @return the date - date of concert
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.date</code> attribute.
	 * @return the date - date of concert
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.date</code> attribute. 
	 * @param value the date - date of concert
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.date</code> attribute. 
	 * @param value the date - date of concert
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Song");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(SONG2CONCERT_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.producer</code> attribute.
	 * @return the producer
	 */
	public Producer getProducer(final SessionContext ctx)
	{
		return (Producer)getProperty( ctx, PRODUCER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.producer</code> attribute.
	 * @return the producer
	 */
	public Producer getProducer()
	{
		return getProducer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.producer</code> attribute. 
	 * @param value the producer
	 */
	public void setProducer(final SessionContext ctx, final Producer value)
	{
		PRODUCERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.producer</code> attribute. 
	 * @param value the producer
	 */
	public void setProducer(final Producer value)
	{
		setProducer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.songs</code> attribute.
	 * @return the songs
	 */
	public Set<Song> getSongs(final SessionContext ctx)
	{
		final List<Song> items = getLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.SONG2CONCERT,
			"Song",
			null,
			false,
			false
		);
		return new LinkedHashSet<Song>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.songs</code> attribute.
	 * @return the songs
	 */
	public Set<Song> getSongs()
	{
		return getSongs( getSession().getSessionContext() );
	}
	
	public long getSongsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			ConcerttoursConstants.Relations.SONG2CONCERT,
			"Song",
			null
		);
	}
	
	public long getSongsCount()
	{
		return getSongsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.songs</code> attribute. 
	 * @param value the songs
	 */
	public void setSongs(final SessionContext ctx, final Set<Song> value)
	{
		setLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.SONG2CONCERT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SONG2CONCERT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.songs</code> attribute. 
	 * @param value the songs
	 */
	public void setSongs(final Set<Song> value)
	{
		setSongs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to songs. 
	 * @param value the item to add to songs
	 */
	public void addToSongs(final SessionContext ctx, final Song value)
	{
		addLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.SONG2CONCERT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SONG2CONCERT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to songs. 
	 * @param value the item to add to songs
	 */
	public void addToSongs(final Song value)
	{
		addToSongs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from songs. 
	 * @param value the item to remove from songs
	 */
	public void removeFromSongs(final SessionContext ctx, final Song value)
	{
		removeLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.SONG2CONCERT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SONG2CONCERT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from songs. 
	 * @param value the item to remove from songs
	 */
	public void removeFromSongs(final Song value)
	{
		removeFromSongs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.venue</code> attribute.
	 * @return the venue - venue of concert
	 */
	public String getVenue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VENUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.venue</code> attribute.
	 * @return the venue - venue of concert
	 */
	public String getVenue()
	{
		return getVenue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.venue</code> attribute. 
	 * @param value the venue - venue of concert
	 */
	public void setVenue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VENUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.venue</code> attribute. 
	 * @param value the venue - venue of concert
	 */
	public void setVenue(final String value)
	{
		setVenue( getSession().getSessionContext(), value );
	}
	
}
