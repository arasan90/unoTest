package crc6499cc3f8d6dc23bc6;


public class ContentPresenter
	extends crc64a352b6f848b4d68e.FrameworkElement
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayoutCore:(ZIIIIZ)V:GetOnLayoutCore_ZIIIIZHandler\n" +
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"";
		mono.android.Runtime.register ("Microsoft.UI.Xaml.Controls.ContentPresenter, Uno.UI", ContentPresenter.class, __md_methods);
	}


	public ContentPresenter (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ContentPresenter.class) {
			mono.android.TypeManager.Activate ("Microsoft.UI.Xaml.Controls.ContentPresenter, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public void onLayoutCore (boolean p0, int p1, int p2, int p3, int p4, boolean p5)
	{
		n_onLayoutCore (p0, p1, p2, p3, p4, p5);
	}

	private native void n_onLayoutCore (boolean p0, int p1, int p2, int p3, int p4, boolean p5);


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);

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
