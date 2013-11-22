/**
 * 
 */
package com.aoeng.smvc.web.controller;

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
	public String login(String name, int age, HttpServletRequest request) {
		System.out.println(name + "---->" + age);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		return "/loginInfo";
	}
}
