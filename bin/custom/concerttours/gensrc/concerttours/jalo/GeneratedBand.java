/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 21.06.2021 12:46:35                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.BandLeader;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Band}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBand extends GenericItem
{
	/** Qualifier of the <code>Band.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Band.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Band.history</code> attribute **/
	public static final String HISTORY = "history";
	/** Qualifier of the <code>Band.albumSales</code> attribute **/
	public static final String ALBUMSALES = "albumSales";
	/** Qualifier of the <code>Band.userprofile</code> attribute **/
	public static final String USERPROFILE = "userprofile";
	/** Qualifier of the <code>Band.types</code> attribute **/
	public static final String TYPES = "types";
	/** Qualifier of the <code>Band.tours</code> attribute **/
	public static final String TOURS = "tours";
	/** Relation ordering override parameter constants for Product2Band from ((concerttours))*/
	protected static String PRODUCT2BAND_SRC_ORDERED = "relation.Product2Band.source.ordered";
	protected static String PRODUCT2BAND_TGT_ORDERED = "relation.Product2Band.target.ordered";
	/** Relation disable markmodifed parameter constants for Product2Band from ((concerttours))*/
	protected static String PRODUCT2BAND_MARKMODIFIED = "relation.Product2Band.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TYPES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBand> TYPESHANDLER = new BidirectionalOneToManyHandler<GeneratedBand>(
	ConcerttoursConstants.TC.BAND,
	false,
	"types",
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
		tmp.put(HISTORY, AttributeMode.INITIAL);
		tmp.put(ALBUMSALES, AttributeMode.INITIAL);
		tmp.put(USERPROFILE, AttributeMode.INITIAL);
		tmp.put(TYPES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.albumSales</code> attribute.
	 * @return the albumSales - official global album sales
	 */
	public Long getAlbumSales(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, ALBUMSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.albumSales</code> attribute.
	 * @return the albumSales - official global album sales
	 */
	public Long getAlbumSales()
	{
		return getAlbumSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.albumSales</code> attribute. 
	 * @return the albumSales - official global album sales
	 */
	public long getAlbumSalesAsPrimitive(final SessionContext ctx)
	{
		Long value = getAlbumSales( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.albumSales</code> attribute. 
	 * @return the albumSales - official global album sales
	 */
	public long getAlbumSalesAsPrimitive()
	{
		return getAlbumSalesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.albumSales</code> attribute. 
	 * @param value the albumSales - official global album sales
	 */
	public void setAlbumSales(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, ALBUMSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.albumSales</code> attribute. 
	 * @param value the albumSales - official global album sales
	 */
	public void setAlbumSales(final Long value)
	{
		setAlbumSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.albumSales</code> attribute. 
	 * @param value the albumSales - official global album sales
	 */
	public void setAlbumSales(final SessionContext ctx, final long value)
	{
		setAlbumSales( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.albumSales</code> attribute. 
	 * @param value the albumSales - official global album sales
	 */
	public void setAlbumSales(final long value)
	{
		setAlbumSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.code</code> attribute.
	 * @return the code - short unique code of band
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.code</code> attribute.
	 * @return the code - short unique code of band
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.code</code> attribute. 
	 * @param value the code - short unique code of band
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.code</code> attribute. 
	 * @param value the code - short unique code of band
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TYPESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.history</code> attribute.
	 * @return the history - history of band
	 */
	public String getHistory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HISTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.history</code> attribute.
	 * @return the history - history of band
	 */
	public String getHistory()
	{
		return getHistory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.history</code> attribute. 
	 * @param value the history - history of band
	 */
	public void setHistory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HISTORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.history</code> attribute. 
	 * @param value the history - history of band
	 */
	public void setHistory(final String value)
	{
		setHistory( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Product");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(PRODUCT2BAND_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.name</code> attribute.
	 * @return the name - name of band
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.name</code> attribute.
	 * @return the name - name of band
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.name</code> attribute. 
	 * @param value the name - name of band
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.name</code> attribute. 
	 * @param value the name - name of band
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.tours</code> attribute.
	 * @return the tours
	 */
	public Set<Product> getTours(final SessionContext ctx)
	{
		final List<Product> items = getLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.PRODUCT2BAND,
			"Product",
			null,
			false,
			false
		);
		return new LinkedHashSet<Product>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.tours</code> attribute.
	 * @return the tours
	 */
	public Set<Product> getTours()
	{
		return getTours( getSession().getSessionContext() );
	}
	
	public long getToursCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			ConcerttoursConstants.Relations.PRODUCT2BAND,
			"Product",
			null
		);
	}
	
	public long getToursCount()
	{
		return getToursCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.tours</code> attribute. 
	 * @param value the tours
	 */
	public void setTours(final SessionContext ctx, final Set<Product> value)
	{
		setLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.PRODUCT2BAND,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2BAND_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.tours</code> attribute. 
	 * @param value the tours
	 */
	public void setTours(final Set<Product> value)
	{
		setTours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tours. 
	 * @param value the item to add to tours
	 */
	public void addToTours(final SessionContext ctx, final Product value)
	{
		addLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.PRODUCT2BAND,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2BAND_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tours. 
	 * @param value the item to add to tours
	 */
	public void addToTours(final Product value)
	{
		addToTours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tours. 
	 * @param value the item to remove from tours
	 */
	public void removeFromTours(final SessionContext ctx, final Product value)
	{
		removeLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.PRODUCT2BAND,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2BAND_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tours. 
	 * @param value the item to remove from tours
	 */
	public void removeFromTours(final Product value)
	{
		removeFromTours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.types</code> attribute.
	 * @return the types
	 */
	public EnumerationValue getTypes(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.types</code> attribute.
	 * @return the types
	 */
	public EnumerationValue getTypes()
	{
		return getTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.types</code> attribute. 
	 * @param value the types
	 */
	public void setTypes(final SessionContext ctx, final EnumerationValue value)
	{
		TYPESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.types</code> attribute. 
	 * @param value the types
	 */
	public void setTypes(final EnumerationValue value)
	{
		setTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.userprofile</code> attribute.
	 * @return the userprofile - leader of the group
	 */
	public BandLeader getUserprofile(final SessionContext ctx)
	{
		return (BandLeader)getProperty( ctx, USERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.userprofile</code> attribute.
	 * @return the userprofile - leader of the group
	 */
	public BandLeader getUserprofile()
	{
		return getUserprofile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.userprofile</code> attribute. 
	 * @param value the userprofile - leader of the group
	 */
	public void setUserprofile(final SessionContext ctx, final BandLeader value)
	{
		new PartOfHandler<BandLeader>()
		{
			@Override
			protected BandLeader doGetValue(final SessionContext ctx)
			{
				return getUserprofile( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final BandLeader _value)
			{
				final BandLeader value = _value;
				setProperty(ctx, USERPROFILE,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Band.userprofile</code> attribute. 
	 * @param value the userprofile - leader of the group
	 */
	public void setUserprofile(final BandLeader value)
	{
		setUserprofile( getSession().getSessionContext(), value );
	}
	
}
