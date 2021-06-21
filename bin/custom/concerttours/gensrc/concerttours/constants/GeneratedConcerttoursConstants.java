/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 21.06.2021 12:46:35                         ---
 * ----------------------------------------------------------------
 */
package concerttours.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedConcerttoursConstants
{
	public static final String EXTENSIONNAME = "concerttours";
	public static class TC
	{
		public static final String BAND = "Band".intern();
		public static final String BANDLEADER = "BandLeader".intern();
		public static final String CONCERTTYPE = "ConcertType".intern();
		public static final String MUSICTYPE = "MusicType".intern();
	}
	public static class Attributes
	{
		public static class MusicType
		{
			public static final String BANDS = "bands".intern();
		}
		public static class Product
		{
			public static final String BAND = "band".intern();
		}
	}
	public static class Enumerations
	{
		public static class ConcertType
		{
			public static final String OPENAIR = "openair".intern();
			public static final String INDOOR = "indoor".intern();
		}
		public static class MusicType
		{
			// no values defined
		}
	}
	public static class Relations
	{
		public static final String BAND2MUSICTYPE = "Band2MusicType".intern();
		public static final String PRODUCT2BAND = "Product2Band".intern();
	}
	
	protected GeneratedConcerttoursConstants()
	{
		// private constructor
	}
	
	
}