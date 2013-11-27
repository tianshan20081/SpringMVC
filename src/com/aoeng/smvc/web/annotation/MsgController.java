/**
 * 
 */
package com.aoeng.smvc.web.annotation;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.aoeng.smvc.web.services.IMenu;
import com.aoeng.smvc.web.services.IMsg;

/**
 * Nov 26, 201311:37:43 AM
 * 
 */
@Controller
@RequestMapping("/ssmvc/")
public class MsgController
{
	@Resource(name = "iMsgImpl")
	private IMsg iMsg;

	@RequestMapping("index")
	public String index() {
		iMsg.say();

		return "index";
	}

	@RequestMapping("menus")
	public String menus(HttpServletRequest request, HttpServletResponse response) {
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		IMenu iMenu = (IMenu) context.getBean("iMenuImpl");
		iMenu.menus();
		return "index";
	}

}
