package crc64df39a1ad5fa7a696;


public class KeyStoreKeyValueStorage_SecretKey
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		javax.crypto.SecretKey,
		java.security.Key,
		java.io.Serializable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getAlgorithm:()Ljava/lang/String;:GetGetAlgorithmHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getFormat:()Ljava/lang/String;:GetGetFormatHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getEncoded:()[B:GetGetEncodedHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Uno.Extensions.Storage.KeyValueStorage.KeyStoreKeyValueStorage+SecretKey, Uno.Extensions.Storage.UI", KeyStoreKeyValueStorage_SecretKey.class, __md_methods);
	}


	public KeyStoreKeyValueStorage_SecretKey ()
	{
		super ();
		if (getClass () == KeyStoreKeyValueStorage_SecretKey.class) {
			mono.android.TypeManager.Activate ("Uno.Extensions.Storage.KeyValueStorage.KeyStoreKeyValueStorage+SecretKey, Uno.Extensions.Storage.UI", "", this, new java.lang.Object[] {  });
		}
	}

	public KeyStoreKeyValueStorage_SecretKey (java.lang.String p0)
	{
		super ();
		if (getClass () == KeyStoreKeyValueStorage_SecretKey.class) {
			mono.android.TypeManager.Activate ("Uno.Extensions.Storage.KeyValueStorage.KeyStoreKeyValueStorage+SecretKey, Uno.Extensions.Storage.UI", "System.String, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
		}
	}


	public java.lang.String getAlgorithm ()
	{
		return n_getAlgorithm ();
	}

	private native java.lang.String n_getAlgorithm ();


	public java.lang.String getFormat ()
	{
		return n_getFormat ();
	}

	private native java.lang.String n_getFormat ();


	public byte[] getEncoded ()
	{
		return n_getEncoded ();
	}

	private native byte[] n_getEncoded ();

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
