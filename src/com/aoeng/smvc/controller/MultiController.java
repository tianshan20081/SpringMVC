/**
 * 
 */
package com.aoeng.smvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * Nov 21, 20138:04:18 PM
 * 
 */
public class MultiController extends MultiActionController
{

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("---------MultiController-------------");
		return new ModelAndView("multi");
	}
	
	public ModelAndView map(HttpServletRequest request,HttpServletResponse response){
		System.out.println("---------Map---------------");
		Map map = new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		return new ModelAndView("/map","map",map);
	}
}
