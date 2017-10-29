package com.epicgames.ue4;

import slimeccg.kodystone.LoS.OBBDownloaderService;
import slimeccg.kodystone.LoS.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

