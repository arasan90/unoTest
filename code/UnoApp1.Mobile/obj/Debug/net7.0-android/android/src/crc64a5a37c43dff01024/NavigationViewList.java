package crc64a5a37c43dff01024;


public class NavigationViewList
	extends crc6499cc3f8d6dc23bc6.ListView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.NavigationViewList, Uno.UI", NavigationViewList.class, __md_methods);
	}


	public NavigationViewList (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NavigationViewList.class) {
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.NavigationViewList, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
