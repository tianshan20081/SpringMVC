/**
 * 
 */
package com.aoeng.smvc.web.annotation;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aoeng.smvc.web.model.User;
import com.sdicons.json.mapper.JSONMapper;
import com.sdicons.json.model.JSONObject;

/**
 * Nov 22, 20139:48:58 AM
 * 
 */
@Controller
@RequestMapping("/anno/")
public class AnnController
{
	@RequestMapping("add")
	public ModelAndView add() {

		return new ModelAndView("/hello", "rel", "user");
	}

	@RequestMapping("map")
	public ModelAndView map() {
		Map map = new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		return new ModelAndView("/map", "map", map);
	}

	@RequestMapping("string")
	public String string(HttpServletRequest request) {
		Map map = new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		request.setAttribute("map", map);
		return "/map";
	}

	@RequestMapping(value = "post", method = RequestMethod.POST)
	public String post(HttpServletRequest request) {

		System.out.println("--------post Request--------------");
		Map map = new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		request.setAttribute("map", map);
		return "/map";
	}

	@RequestMapping("index")
	public String index() {
		return "/anno";
	}

	@RequestMapping("login")
	public String loginInput() {
		return "/login";
	}

	@RequestMapping("loginInput")
	public void login(User user , HttpServletResponse response) throws Exception {
		System.out.println(user.getName() + "---->" + user.getAge());
		
		response.getWriter().write("save ok");
	}
	@RequestMapping("addJ")
	public void addJ(User user , HttpServletResponse response) throws Exception {
		System.out.println(user.getName() + "---->" + user.getAge());
		
		response.getWriter().write("Json save ok");
	}
	@RequestMapping(value="addJp",method=RequestMethod.POST)
	public void addJp(User user , HttpServletResponse response) throws Exception {
		System.out.println(user.getName() + "---->" + user.getAge());
		
		response.getWriter().write("JsonPost save ok");
		
	}
	@RequestMapping(value="addJson")
	public void addJson(User user , HttpServletResponse response) throws Exception {
		System.out.println(user.getName() + "---->" + user.getAge());
		Map map = new HashMap();
		map.put("name", user.getName());
		map.put("age", user.getAge());
		map.put("isOk", true);
		String json = JSONMapper.toJSON(map).render(false);
		System.out.println(json);
		response.setContentType("application/json");
		response.getWriter().write(json);
	}
}
