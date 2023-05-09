package mono.android.app;

public class ApplicationRegistration {

	public static void registerApplications ()
	{
				// Application and Instrumentation ACWs must be registered first.
		mono.android.Runtime.register ("UnoApp1.Droid.Application, UnoApp1.Mobile, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", crc64cc83d67a0dc1d174.Application.class, crc64cc83d67a0dc1d174.Application.__md_methods);
		mono.android.Runtime.register ("Microsoft.UI.Xaml.NativeApplication, Uno.UI, Version=255.255.255.255, Culture=neutral, PublicKeyToken=null", crc64a352b6f848b4d68e.NativeApplication.class, crc64a352b6f848b4d68e.NativeApplication.__md_methods);
		
	}
}
