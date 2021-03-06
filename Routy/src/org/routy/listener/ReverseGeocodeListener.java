package org.routy.listener;

import org.routy.model.RoutyAddress;

public abstract class ReverseGeocodeListener {

	public abstract void onResult(RoutyAddress address);
	public abstract void onReverseGeocodeTimeout();
	public abstract void onNoInternetConnectionException();
}
