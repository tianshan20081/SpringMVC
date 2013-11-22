/**
 * 
 */
package com.aoeng.smvc.web.annotation;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Nov 22, 20139:48:58 AM
 * 
 */
@Controller
public class UserController
{
	@RequestMapping(value = "/ann/user", method = RequestMethod.GET)
	public ModelAndView add() {

		return new ModelAndView("/hello", "rel", "user");
	}

	@RequestMapping(value = "/ann/map", method = RequestMethod.GET)
	public ModelAndView map() {
		Map map = new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		return new ModelAndView("/map", "map", map);
	}

	@RequestMapping(value = "/ann/string", method = RequestMethod.GET)
	public String string(HttpServletRequest request) {
		Map map = new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		request.setAttribute("map", map);
		return "/map";
	}

	@RequestMapping(value = "/ann/post", method = RequestMethod.POST)
	public String post(HttpServletRequest request) {
		Map map = new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		request.setAttribute("map", map);
		return "/map";
	}

	@RequestMapping(value = "/ann/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request) {
		return "/ann";
	}

}
