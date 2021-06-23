/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 24.06.2021 22:13:35                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Band;
import concerttours.jalo.BandLeader;
import concerttours.jalo.Concert;
import concerttours.jalo.Song;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>ConcerttoursManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedConcerttoursManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n BANDS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Band> BAND2MUSICTYPEBANDSHANDLER = new OneToManyHandler<Band>(
	ConcerttoursConstants.TC.BAND,
	false,
	"types",
	null,
	false,
	true,
	CollectionType.SET
	);
	/** Relation ordering override parameter constants for Product2Band from ((concerttours))*/
	protected static String PRODUCT2BAND_SRC_ORDERED = "relation.Product2Band.source.ordered";
	protected static String PRODUCT2BAND_TGT_ORDERED = "relation.Product2Band.target.ordered";
	/** Relation disable markmodifed parameter constants for Product2Band from ((concerttours))*/
	protected static String PRODUCT2BAND_MARKMODIFIED = "relation.Product2Band.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.band</code> attribute.
	 * @return the band
	 */
	public Collection<Band> getBand(final SessionContext ctx, final Product item)
	{
		final List<Band> items = item.getLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.PRODUCT2BAND,
			"Band",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.band</code> attribute.
	 * @return the band
	 */
	public Collection<Band> getBand(final Product item)
	{
		return getBand( getSession().getSessionContext(), item );
	}
	
	public long getBandCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			ConcerttoursConstants.Relations.PRODUCT2BAND,
			"Band",
			null
		);
	}
	
	public long getBandCount(final Product item)
	{
		return getBandCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.band</code> attribute. 
	 * @param value the band
	 */
	public void setBand(final SessionContext ctx, final Product item, final Collection<Band> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.PRODUCT2BAND,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2BAND_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.band</code> attribute. 
	 * @param value the band
	 */
	public void setBand(final Product item, final Collection<Band> value)
	{
		setBand( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to band. 
	 * @param value the item to add to band
	 */
	public void addToBand(final SessionContext ctx, final Product item, final Band value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.PRODUCT2BAND,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2BAND_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to band. 
	 * @param value the item to add to band
	 */
	public void addToBand(final Product item, final Band value)
	{
		addToBand( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from band. 
	 * @param value the item to remove from band
	 */
	public void removeFromBand(final SessionContext ctx, final Product item, final Band value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.PRODUCT2BAND,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2BAND_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from band. 
	 * @param value the item to remove from band
	 */
	public void removeFromBand(final Product item, final Band value)
	{
		removeFromBand( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MusicType.bands</code> attribute.
	 * @return the bands
	 */
	public Set<Band> getBands(final SessionContext ctx, final EnumerationValue item)
	{
		return (Set<Band>)BAND2MUSICTYPEBANDSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MusicType.bands</code> attribute.
	 * @return the bands
	 */
	public Set<Band> getBands(final EnumerationValue item)
	{
		return getBands( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MusicType.bands</code> attribute. 
	 * @param value the bands
	 */
	public void setBands(final SessionContext ctx, final EnumerationValue item, final Set<Band> value)
	{
		BAND2MUSICTYPEBANDSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MusicType.bands</code> attribute. 
	 * @param value the bands
	 */
	public void setBands(final EnumerationValue item, final Set<Band> value)
	{
		setBands( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bands. 
	 * @param value the item to add to bands
	 */
	public void addToBands(final SessionContext ctx, final EnumerationValue item, final Band value)
	{
		BAND2MUSICTYPEBANDSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bands. 
	 * @param value the item to add to bands
	 */
	public void addToBands(final EnumerationValue item, final Band value)
	{
		addToBands( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bands. 
	 * @param value the item to remove from bands
	 */
	public void removeFromBands(final SessionContext ctx, final EnumerationValue item, final Band value)
	{
		BAND2MUSICTYPEBANDSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bands. 
	 * @param value the item to remove from bands
	 */
	public void removeFromBands(final EnumerationValue item, final Band value)
	{
		removeFromBands( getSession().getSessionContext(), item, value );
	}
	
	public Band createBand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ConcerttoursConstants.TC.BAND );
			return (Band)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Band : "+e.getMessage(), 0 );
		}
	}
	
	public Band createBand(final Map attributeValues)
	{
		return createBand( getSession().getSessionContext(), attributeValues );
	}
	
	public BandLeader createBandLeader(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ConcerttoursConstants.TC.BANDLEADER );
			return (BandLeader)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BandLeader : "+e.getMessage(), 0 );
		}
	}
	
	public BandLeader createBandLeader(final Map attributeValues)
	{
		return createBandLeader( getSession().getSessionContext(), attributeValues );
	}
	
	public Concert createConcert(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ConcerttoursConstants.TC.CONCERT );
			return (Concert)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Concert : "+e.getMessage(), 0 );
		}
	}
	
	public Concert createConcert(final Map attributeValues)
	{
		return createConcert( getSession().getSessionContext(), attributeValues );
	}
	
	public Song createSong(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ConcerttoursConstants.TC.SONG );
			return (Song)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Song : "+e.getMessage(), 0 );
		}
	}
	
	public Song createSong(final Map attributeValues)
	{
		return createSong( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return ConcerttoursConstants.EXTENSIONNAME;
	}
	
}
