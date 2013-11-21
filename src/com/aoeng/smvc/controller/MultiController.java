/**
 * 
 */
package com.aoeng.smvc.controller;

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
}
