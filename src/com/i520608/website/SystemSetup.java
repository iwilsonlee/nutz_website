package com.i520608.website;

import org.nutz.filepool.NutFilePool;
import org.nutz.mvc.Mvcs;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;


public class SystemSetup implements Setup{

	@Override
	public void destroy(NutConfig nc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(NutConfig nc) {
		// TODO Auto-generated method stub
		//在WEB-INF/rsdata下面放个文件池,用来存放记录
		Helper.filePool = new NutFilePool(Mvcs.getServletContext().getRealPath("/WEB-INF") + "/rsdata");
	}

}
