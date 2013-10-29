package com.ubhave.datahandler.loggertypes;

import android.content.Context;

import com.ubhave.datahandler.config.DataTransferConfig;

public abstract class AbstractImmediateTransferLogger extends AbstractTransferLogger
{

	protected AbstractImmediateTransferLogger(Context context)
	{
		super(context);
	}

	@Override
	protected void configureDataStorage()
	{
		super.configureDataStorage();
		try
		{
			dataManager.setConfig(DataTransferConfig.DATA_TRANSER_POLICY, DataTransferConfig.TRANSFER_IMMEDIATE);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
