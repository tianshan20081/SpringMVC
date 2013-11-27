/**
 * 
 */
package com.aoeng.smvc.web.services.impl;

import org.springframework.stereotype.Service;

import com.aoeng.smvc.web.services.IMsg;

/**
 * Nov 26, 201311:36:46 AM
 *
 */
@Service("iMsgImpl")
public class IMsgImpl implements IMsg 
{

	/* (non-Javadoc)
	 * @see com.aoeng.smvc.web.services.IMsg#say()
	 */
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("-------SSMVC------------");
	}

}
