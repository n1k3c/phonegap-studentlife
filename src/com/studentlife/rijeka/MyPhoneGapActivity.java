package com.studentlife.rijeka;

import org.apache.cordova.DroidGap;
import android.os.Bundle;
import com.google.ads.*;
import android.widget.LinearLayout;

public class MyPhoneGapActivity extends DroidGap {
		private static final String AdMob_Ad_Unit = "ca-app-pub-7486998366593520/2397846652";
		private AdView adView; 
	

	@Override

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setIntegerProperty("splashscreen", R.drawable.splash);
		super.loadUrl("file:///android_asset/www/index.html", 1000);
		
		adView = new AdView(this, AdSize.BANNER, AdMob_Ad_Unit); 
        LinearLayout layout = super.root;
        layout.addView(adView); 
        AdRequest request = new AdRequest();
        adView.loadAd(request); 
	}
}
